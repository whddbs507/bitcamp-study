package com.eomcs.io;

import java.io.File;
import java.io.FileInputStream;

public class Exam14 {
  public static void main(String[] args) throws Exception {
    File file = new File("sample/photo1.jpg");
    FileInputStream in = new FileInputStream(file);
    int b1 = in.read();
    int b2 = in.read();
    int soi = b1 << 8 | b2;
    System.out.printf("%x\n", b1);
    System.out.printf("%x\n", b2);
    System.out.printf("SOI : %x\n", soi);
    
    int jfifApp0Marker = in.read() << 8 | in.read();
    System.out.printf("JFIF APP0 Marker : %x\n", jfifApp0Marker);
    
    int jfifApp0Length = in.read() << 8 | in.read();
    System.out.printf("JFIF APP0 정보 길이 : %x\n", jfifApp0Length);
    
    byte[] jfifApp0Info = new byte[jfifApp0Length];
    in.read(jfifApp0Info);
    
    String jfifApp0Id = new String(jfifApp0Info, 0, 4);
    System.out.printf("JFIF APP0 ID : %s\n", jfifApp0Id);
    
    int b;
    
    while (true) {
      b = in.read();
      if ( b == -1) {
        break;
      }
      
      if (b == 0xFF) {
        b = in.read();
        if (b == -1) {
          break;
        }
        if (b >= 0xC0 && b <= 0xC2) {
          break;
        }
      }
    }
    
    if (b == -1) {
      System.out.println("유효한 JPEG 파일이 아닙니다.");
      return;
    }
    
    int sofLength = in.read() << 8 | in.read();
    System.out.printf("SOF 데이터 크기 : %d\n", sofLength);
    
    byte[] sofData = new byte[sofLength];
    in.read(sofData);

    System.out.printf("SOF 샘플링 정밀도 : %d\n", sofData[0]);
    
    int height = ((sofData[1] << 8) & 0xff00) | (sofData[2] & 0xff);
    
    int width = ((sofData[3] << 8) & 0xff00) | (sofData[4] & 0xff);
    System.out.printf("SOF 이미지 크기(w x h) : %d x %d\n", width, height);
    in.close();
  }
}
package com.eomcs.io;

import java.io.File;

public class Exam {
  public static void main(String[] args) throws Exception{
    File currentDir = new File("./build.gradle2");
    System.out.printf("폴더명 : %s\n", currentDir.getName());
    System.out.printf("경로 : %s\n", currentDir.getPath());
    System.out.printf("절대경로 : %s\n", currentDir.getAbsoluteFile());
    System.out.printf("계산된 절대경로 : %s\n", currentDir.getCanonicalPath());
    
    System.out.printf("총크기 : %s\n", currentDir.getTotalSpace());
    System.out.printf("남은크기 : %s\n", currentDir.getFreeSpace());
    System.out.printf("가용크기 : %s\n", currentDir.getUsableSpace());
    
    System.out.printf("디렉토리여부 : %s\n", currentDir.isDirectory());
    System.out.printf("파일여부 : %s\n", currentDir.isFile());
    System.out.printf("감춤폴더 : %s\n", currentDir.isHidden());
    System.out.printf("존재여부 : %s\n", currentDir.exists());
    System.out.printf("실행가능여부 : %s\n", currentDir.canExecute());
  }
}
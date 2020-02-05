package com.eomcs.io;

import java.io.FileOutputStream;

public class DataOutputStream extends FileOutputStream {
  
  public DataOutputStream(String name) throws Exception {
    super(name);
  }
  
  public void writeUTF(String str) throws Exception {
    byte[] bytes = str.getBytes("UTF-8");
    this.write(bytes.length);
    this.write(bytes);
  }
  
  // 00 1B
  public void writeInt(int value) throws Exception { 
    this.write(value >> 24);
    this.write(value >> 16);
    this.write(value >> 8);
    this.write(value);
  }
  
  // 00 00 00 1B
  public void writeLong(long value) throws Exception { 
    this.write((int)(value >> 56));
    this.write((int)(value >> 48));
    this.write((int)(value >> 40));
    this.write((int)(value >> 32));
    this.write((int)(value >> 24));
    this.write((int)(value >> 16));
    this.write((int)(value >> 8));
    this.write((int)(value));
  }
  
  public void writeBoolean(boolean value) throws Exception {
    if (value)
      this.write(1);
    this.write(0);
  }
}
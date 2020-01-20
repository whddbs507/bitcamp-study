package com.eomcs.oop.ex11.pracB;

import java.io.File;
import java.io.FilenameFilter;

public class JavaFilter implements FilenameFilter {
  public boolean accept(File dir, String name) {
    if (name.endsWith("gradle")) {
      return true;
    } else {
      return false;
    }
  }
}
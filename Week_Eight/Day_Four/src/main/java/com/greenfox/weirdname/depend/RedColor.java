package com.greenfox.weirdname.depend;

import com.greenfox.weirdname.depend.Service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {

    printer.log("hello" + " It is red in color...");
  }
}

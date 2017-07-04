package com.dk.myexception

import java.io.FileReader
import java.io.FileNotFoundException

object MyException {
  //异常处理catch用case
  def main(args:Array[String]):Unit={
    try {
      var f = new FileReader("input.txt");
    } catch {
      case ex: FileNotFoundException => println("Miss file exception");
    } finally{
      println("exit");
    }
    
  }
}
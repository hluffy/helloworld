package com.dk.myfile

import java.io.PrintWriter
import java.io.File
import scala.io.Source

object MyFile {
  def main(args:Array[String]):Unit={
    //进行文件写操作
//    var writer = new PrintWriter(new File("D://test.txt"));
//    writer.write("hello world");
//    writer.close();
    
    //读取用户输入
//    println("请输入:");
//    var line = Console.readLine;
//    println("你输入的是:"+line);
    
    //读取文件内容
    println("文件内容为:");
    Source.fromFile("D://test.txt").foreach{
      print;
    }
    
  }
}
package com.dk.varandval

object VarAndVal {
  def main(args: Array[String]): Unit={
//    var声明变量
//    val声明常量
    var i = 10;
    var j = 20;
    println(i*j);
    val k = 5;
    j = 10;
    println(j*k);
    var str = "123sss";
//    var str :String = "123sss";
    println(str);
  }
}
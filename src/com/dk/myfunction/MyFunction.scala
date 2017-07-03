package com.dk.myfunction

object MyFunction {
  def addInt(a:Int,b:Int):Int={
    return a+b;
  }
  
  def sayHello():Unit = {
    println("hello world");
  }
  
  def main(args:Array[String]):Unit={
//    var a = 10;
//    var b = 20;
//    var sum = addInt(a,b);
//    println(sum);
    sayHello();
  }
}
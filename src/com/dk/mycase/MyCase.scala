package com.dk.mycase

object MyCase {
  
  def main(args:Array[String]):Unit={
    println(matchTest(1));
    println(matchTest(2));
    println(matchTest(3));
    println(matchTest(4));
  }
  
  def matchTest(x:Int):String = x match{
      case 1 => "one";
      case 2 => "two";
      case _ => "many";
  };
}
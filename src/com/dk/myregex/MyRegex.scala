package com.dk.myregex

import scala.util.matching.Regex

object MyRegex {
  def main(args:Array[String]):Unit={
//    var pattern = "Scala".r;
//    var str = "Scala is Scalable and cool";
//    println(pattern.findFirstIn(str));
    
//    var pattern = new Regex("(S|s)cala");
//    var str = "Scala is scalable and cool";
//    println(pattern.findAllIn(str).mkString(","));
//    println(pattern.replaceFirstIn(str, "Java"));
    
    var pattern = new Regex("abl[ae]\\d+");
    var str = "ablaw is able1 and cool";
    println(pattern.findAllIn(str).mkString(","));
  }
}
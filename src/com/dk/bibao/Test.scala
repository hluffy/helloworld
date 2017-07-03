package com.dk.bibao

object Test {
  //scala闭包
  def main(args: Array[String]):Unit = {
    println("multi(1)----"+multi(1));
    println("multi(2)----"+multi(2));
  }
  var factor = 10;
  var multi = (i:Int) => i*factor;
}
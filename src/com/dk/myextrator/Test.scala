package com.dk.myextrator

object Test {
  def main(args:Array[String]):Unit={
    //实例化类是可以带上0个或多个参数,实例化是会调用apply()方法
    var x = Test(5);
    println(x);
    
//    x = 3;
    
    
    //使用match语句是，会调用unapply()方法
    x match {
      case Test(num) => println(x + " 是 " + num + " 的两倍！");
      case _ => println("无法计算");
    }
  }
  
  def apply(x:Int)={
    x*2;
  }
  
  def unapply(z:Int):Option[Int]={
    if(z%2==0){
      return Some(z/2);
    }else{
      None;
    }
  }
}
package com.dk.varandval

object Super {
//  protected关键字，只允许子类调用
    class Super{
      protected def f(){
        println("f");
      }
      
//      class Sub extends Super{
//        f();
//      }
      
//      class Other{
//        (new Super()).f();
//      }
  }
  
  
  def main(args: Array[String]): Unit = {
//    new Super();
//    class Sub extends Super{
//      f();
//    }
//    new Sub();
    class Other{
//      (new Super()).f();
    }
    
    new Other();
//    new Sub();
//    println("ss");
  }
  
}
package com.dk.myclass

object MyClass {
  class Point(xc:Int,yc:Int){
    var x:Int = xc;
    var y:Int = yc;
    
    def move(dx:Int,dy:Int){
      x = x + dx;
      y = y + dy;
      println("x坐标:"+x);
      println("y坐标:"+y);
    }
    
  }
  
  //继承
  class Location(xc:Int,yc:Int,zc:Int) extends Point(xc,yc){
    var z:Int = zc;
    
    def move(dx:Int,dy:Int,dz:Int){
      x = x + dx;
      y = y + dy;
      z = z + dz;
      println("x坐标:"+x);
      println("y坐标:"+y);
      println("z坐标:"+z);
    }
  }
  
  def main(args: Array[String]):Unit={
//    var p = new Point(10,20);
//    p.move(-2,3);
    var lo = new Location(1,2,3);
    lo.move(1,2,3);
  }
}
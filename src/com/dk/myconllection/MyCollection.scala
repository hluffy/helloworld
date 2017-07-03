package com.dk.myconllection

object MyCollection {
  def main(args: Array[String]): Unit={
    //list数组
    var x = List(1,2,3,4);
    //set数组
    var y = Set(1,2,3);
    //map
    var z = Map("one" -> 1,"two" -> 2);
    //元组，存储不同类型的数据
    var x1 = (10,"hanxiao");
    //////////////////////////////////////
    var y1:Option[Int] = Some(5);
    for( i <- y1){
      println(i);
    }
//    println(y1.size);
    var y2 = Some(2);
    println(y2);
    for( xx <- y2){
      println(xx);
    }
    
    var list = List(23,"hanxi");
    for(xx <- list){
      println(xx);
    }
  }
}
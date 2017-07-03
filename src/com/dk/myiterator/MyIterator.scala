package com.dk.myiterator

object MyIterator {
  def main(args: Array[String]):Unit={
    var it = Iterator("h","3","sss",44,67);
    while(it.hasNext){
      println(it.next());
    }
    
    //查找最大和最小元素
    var it1 = Iterator(1,2,5,89,99);
    var it2 = Iterator(3,4,5,6,7);
//    println(it1.max);
//    println(it2.min);
    println("长度----------------");
    println(it1.size);
    println(it2.length);
  }
}
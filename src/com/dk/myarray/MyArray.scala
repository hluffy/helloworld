package com.dk.myarray

import Array._

object MyArray {
  def main(args:Array[String]):Unit={
//    var myArray = new Array[String](3);
//    myArray(0) = "hello";
//    myArray(1) = "han";
//    myArray(2) = "xiao";
//    var myArray = Array("hello","han","xiao");
//    println(myArray(0));
    
    //遍历数组
    var test = Array(1,4,22,8,2,4);
    //求和
    var sum = 0;
    for(x <- test){
      sum += x;
//      println(x);
    }
    println(sum);
    
    //求和
    var sumsum = 0;
    for(i <- 0 to (test.length-1)){
      sumsum += test(i);
    }
    println(sumsum);
    
    //求最大值
    var max = test(0);
    for(i <- 1 to (test.length-1)){
      if(max<test(i)){
        max = test(i);
      }
    }
    println(max);
    
    //多维数组
    //ofDim需要导入 import Array._
    var myMatrix = ofDim[Int](3,3);
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j;
      }
    }
    
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        println(myMatrix(i)(j));
      }
    }
    
    //合并数组
    println("合并数组--------");
    var array1 = Array(1,4,5);
    var array2 = Array(3,4,2);
    var array3 = concat(array1,array2);
    for(x <- array3){
      println(x);
    }
    
    
    //创建区间数组 使用range
    //range(10,20)包含10不包含20
    println("区间数组--------");
    var myArray1 = range(10,20,2);
    var myArray2 = range(10,20);
    for(x <- myArray1){
      println(x);
    }
    println("----------");
    for(x <- myArray2){
      println(x);
    }
    
    
    
  }
}
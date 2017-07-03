package com.dk.str

object StrTest {
  def main(args: Array[String]): Unit={
//    var str = "Hello World";
//    println(str);
    var buf = new StringBuilder;
    buf.append("sdsdf");
    buf.append("123");
    println(buf);
    println(buf.length);
    var i = "123";
    var j = "456";
    //字符串连接
    println(i.concat(j));
    
    //创建格式化字符串
    var floatVar = 12.445;
    var intVar = 200;
    var strVar = "hello";
    var result = printf("小数为%f,整数为%d,字符串为%s", floatVar,intVar,strVar);
    
    println(result);
  }
}
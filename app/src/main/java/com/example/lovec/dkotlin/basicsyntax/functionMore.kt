package com.example.lovec.dkotlin.basicsyntax

/**
 * Created by lovec on 2017/8/16.
 * 对方法进行测试
 */
class functionMore {
    /**
     * 简写返回值
     * @param a 参数a, kotlin的Int类型
     * @param b 参数b, kotlin的Int类型
     * @return a与b的总和
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 直接返回函数表达式
     * @param a 参数a, kotlin的Int类型
     * @param b 参数b, kotlin的Int类型
     * @return a与b的总和
     */
    fun sumReturn(a: Int, b: Int) = a + b

    /**
     * 无返回值方法，去掉:Unit 也可
     * @param a 参数a, kotlin的Int类型
     * @param b 参数b, kotlin的Int类型
     */
    fun printSum(a: Int, b: Int): Unit {
        println("a+b=" + (a + b))
    }
}
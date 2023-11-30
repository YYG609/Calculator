package net.flow9.thisiskotlin.calculator

class DivideOperation {
    fun operate(num1:Double, num2:Double): Double{
        val divideResult = num1 / num2
        println("나누기 결과 : ${divideResult}")
        return divideResult
    }
}
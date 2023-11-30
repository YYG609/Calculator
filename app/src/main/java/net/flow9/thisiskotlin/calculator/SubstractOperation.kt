package net.flow9.thisiskotlin.calculator

class SubstractOperation {
    fun operate(num1:Double, num2:Double): Double{
        val substractResult = num1 - num2
        println("빼기 결과 : ${substractResult}")
        return substractResult
    }
}
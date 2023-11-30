package net.flow9.thisiskotlin.calculator

class MultiplyOperation {
    fun operate(num1:Double, num2:Double): Double{
        val multiplyResult = num1 * num2
        println("곱하기 결과 : ${multiplyResult}")
        return multiplyResult
    }
}
package net.flow9.thisiskotlin.calculator

class AddOperation {
    fun operate(num1:Double, num2:Double): Double{
            val addResult = num1 + num2
            println("더하기 결과 : ${addResult}")
            return addResult
    }
}
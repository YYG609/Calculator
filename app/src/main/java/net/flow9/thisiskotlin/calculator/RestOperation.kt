package net.flow9.thisiskotlin.calculator

class RestOperation {
    fun operate(num1:Double, num2:Double): Double{
        val restResult = num1 % num2
        println("나머지계산 결과 : ${restResult}")
        return restResult
    }
}
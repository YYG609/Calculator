package net.flow9.thisiskotlin.calculator

fun main() {
    class Calculator{
        var num1 = readLine()!!.toDouble()
        var operator = readLine().toString()
        var num2 = readLine()!!.toDouble()
        var result = 0.0.toDouble()

        fun operation(){
            when(operator){
                "+" -> {
                    result = num1 + num2
                    println("더하기 : ${result}")
                }
                "-" -> {
                    result = num1 - num2
                    println("빼기 : ${result}")
                }
                "/" -> {
                    result = num1 / num2
                    println("나누기 결과 : ${result}")
                }
                "*" -> {
                    result = num1 * num2
                    println("곱하기 결과 : ${result}")
                }
                else -> println("다시 시도해 주세요")
            }
        }
    }
    Calculator().operation()
}
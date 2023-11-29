package net.flow9.thisiskotlin.calculator

fun main() {
    println("수식을 입력하세요")
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
            println("추가 연산 입력")
            var moreOperation = readLine().toString()
            var num3 = readLine()!!.toDouble()
            when(moreOperation){
                "+" -> {
                    result += num3
                    println("더하기 : ${result}")
                }
                "-" -> {
                    result -= num3
                    println("빼기 : ${result}")
                }
                "/" -> {
                    result /= num3
                    println("나누기 결과 : ${result}")
                }
                "*" -> {
                    result *= num3
                    println("곱하기 결과 : ${result}")
                }
                else -> println("다시 시도해 주세요")
            }
        }
    }
    Calculator().operation()
}
package net.flow9.thisiskotlin.calculator

fun main() {
    println("숫자를 두개 입력해주세요")
    val num1 = readLine()!!.toDouble()
    val num2 = readLine()!!.toDouble()
    val addResult = num1 + num2
    val minusResult = num1 - num2
    val multipleResult = num1 * num2
    val divisionRespult = num1 / num2

    println("덧셈 : ${num1} + ${num2} = ${addResult}")
    println("뺄셈 : ${num1} - ${num2} = ${minusResult}")
    println("곱셈 : ${num1} * ${num2} = ${multipleResult}")
    println("나눗셈 : ${num1} / ${num2} = ${divisionRespult}")
}
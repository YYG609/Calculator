package net.flow9.thisiskotlin.calculator

fun main() {
    println("수식을 입력하세요")
    val calculator = Calculator()
    calculator.operation()
}
class Calculator{
    var num1 = readLine()!!.toDouble()
    var operator = readLine().toString()
    var num2 = readLine()!!.toDouble()
    var result = 0.0.toDouble()

    fun operation():Double{
        when(operator){
            "+" -> {
                result = AddOperation().operate(num1, num2)
            }
            "-" -> {
                result = SubstractOperation().operate(num1, num2)
            }
            "/" -> {
                result = DivideOperation().operate(num1, num2)
            }
            "*" -> {
                result = MultiplyOperation().operate(num1, num2)
            }
            else -> println("다시 시도해 주세요")
        }
        println("추가 연산 입력")
        var moreOperation = readLine().toString()
        var num3 = readLine()!!.toDouble()
        when(moreOperation){
            "+" -> {
                result = AddOperation().operate(result, num3)
            }
            "-" -> {
                result = SubstractOperation().operate(result, num3)
            }
            "/" -> {
                result = DivideOperation().operate(result, num3)
            }
            "*" -> {
                result = MultiplyOperation().operate(result, num3)
            }
            else -> println("다시 시도해 주세요")
        }
        return result
    }
}
fun main(args: Array<String>) {
    // create a function that adds two number
    // sum total to be 800

    //create another to multiply
    //result to be 2000

    //another to divide and result to be 20

    sumnumbers()
    multiplynums()
    dividenums()
    addnums(400,400)
}
fun addnums(numb1:Int, numb2:Int){
    var result = numb1 + numb2
    println(result)

}

fun sumnumbers(){
    var sum1 = 500
    var sum2 = 300
    var sum = sum1 + sum2
    println(sum)
    }

fun multiplynums(){
    var num1 = 400
    var num2 = 5
    var ans = num1 * num2
    println(ans)
}

fun dividenums(){
    var div1 = 100
    var div2 = 5
    var quotient = div1 / div2
    println(quotient)
}


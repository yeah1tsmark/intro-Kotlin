fun main(args: Array<String>) {
    // check numbers divisible by:
    // 3 -print fizzbzz
    // 5-print buzz
    // 15- print fizz

    for(i in 1..100){
        if (i % 3 == 0){
            println("$i fizzbuzz")
        }else if (i % 5 == 0){
            println("$i buzz")
        }else if (i % 15 == 0){
            println("$i fizz")
        }else{
            println("$i")
        }


        }
}


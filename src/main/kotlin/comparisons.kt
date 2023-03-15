fun main(args: Array<String>) {

    print("enter your age")
    var age:Int = readLine()!!.toInt()

    if (age >= 18){
        print("Welcome to the club")

    }
    else {
        print("Sorry we dont admit underage")

    }
}


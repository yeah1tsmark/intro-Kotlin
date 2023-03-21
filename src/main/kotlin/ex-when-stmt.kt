fun main(args: Array<String>) {
    // build a simple *544# USSD app using when statement

    println("Enter Option")
    var number:Int = readLine()!!.toInt()
    when(number){

        0-> println("Sh20=1GB for 1hr")
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        5-> println("No Expiry")
        6-> println("Video Bundles")
        7-> println("Okoa Data")
        8-> println("Lipa Mdogo")
        9-> println("Data Plus NEW")
        10-> println("Hot Minutes")
        11-> println("MORE")

        else-> println("Invalid Choice. Try Again")
    }











}
fun main(args: Array<String>) {
    // build a simple grading system
    //80-100 A
    //75-79 A-
    //70-74 B+
    //65-69 B
    //60-64 B-
    //55-59 C+
    //50-54 C
    //45-49 C-
    //40-44 D+
    //35-39 D
    //30-34 D-
    //01-29 E

    println("Enter Score")
    var score:Int = readLine()!!.toInt()
    if (score >= 80) {
        print("Grade A. Above Expectations")
    }

    else if (score >= 75) {
        print("Grade A-. Excellent")
     }

    else if (score >= 70) {
        print("Grade B+. Very Good")
    }

    else if (score >= 65) {
        print("Grade B. Good")
    }

    else if (score >= 60) {
        print("Grade B-. Fair")
    }

    else if (score >= 55) {
        print("Grade C+.Above Average")
    }

    else if (score >= 50) {
        print("Grade C. Average")
    }

    else if (score >= 45) {
        print("Grade C-. Below Average")
    }

    else if (score >= 40) {
        print("Grade D+. Poor")
    }

    else if (score >= 35) {
        print("Grade D. Very Poor")
    }

    else if (score >= 30) {
        print("Grade D-. Pull up your socks")
    }

    else if (score >= 29) {
        print("Grade E. Retake")
    }



    }







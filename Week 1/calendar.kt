fun main(){

    val firstDay = 1 //Monday
    val secondDay = 2 //Tuesday
    val thirdDay = 3 //Wednesday
    val fourthDay = 4 //Thursday
    val fifthDay = 5 //Friday
    val sixthDay = 6 //Saturday
    val seventhDay = 7 //Sunday

    val dates = listOf(2, 5, 32, 30) //the testing data

    for (date in dates){
        if(date<0 || date>31){
            println("$date is an invalid date!")
        }else{
            var day = date%7 + firstDay-1 // the week day
            when (day){
                1 -> println("$date is Monday!")
                2 -> println("$date is Tuesday!")
                3 -> println("$date is Wednesday!")
                4 -> println("$date is Thursday!")
                5 -> println("$date is Friday!")
                6 -> println("$date is Saturday!")
                7 -> println("$date is Sunday!")
            }
        }
    }
}
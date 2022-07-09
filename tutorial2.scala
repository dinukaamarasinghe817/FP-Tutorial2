object answers{
    def main(args: Array[String])={

        //question 2 answers
        println("Question 2")
        var k = 2; var i = 2; var j = 2;
        var m = 5; var n = 5;
        var f = 12.0; var g = 4.0;
        var c = 'X';

        //question 3 answers
        println("\nQuestion 3")
        printf("a) %d\n", k+12*m)
        printf("b) %.2f\n", m.toFloat/j.toFloat)
        printf("c) %d\n", n%j)
        printf("d) %.2f\n", m.toFloat/j.toFloat*j.toFloat)
        printf("e) %.2f\n", f+10*5+g)
        i+=1
        printf("f) %d\n", (i)*n)

        // second part of the question 3 can't be completed
        // because scala doesn't have increment decrement operators

        //question 4 answers
        println("\nQuestion 4")
        printf("part a ") 
        def grossSal(normal: Int, ot: Int):Int = (normal*250)+(ot*85)
        def tax(gross: Int): Int = (gross*.12).toInt
        def takehome(normal: Int, ot: Int):Int = grossSal(normal,ot) - tax(grossSal(normal,ot));
        printf("answer : %d",takehome(40,30))

        printf("\npart b ")
        def attendance(price: Int):Int = 120 + (15 - price)/5*20
        def earn(price: Int):Int = price*attendance(price)
        def cost(price: Int):Int = 500 + attendance(price)*3
        def profit(price: Int):Int = earn(price) - cost(price)
        printf("answer : %d",profit(24))
    }
}



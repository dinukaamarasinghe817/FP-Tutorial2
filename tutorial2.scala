object answers123{
    def main(args: Array[String])={

        //question 2 answers
        println("Question 2")
        // var k = 2; i = 2; j = 2; m = 5; n = 5;
        var (k,i,j,m,n) = (2,2,2,5,5);
        var (f,g) = (12.0,4.0);
        var c = 'X';

        //question 3 answers
        println("\nQuestion 3")
        // a)
        printf("a) %d\n", k+12*m)
        // b)
        printf("b) %.2f\n", m.toFloat/j.toFloat)
        // c)
        printf("c) %d\n", n%j)
        // d)
        printf("d) %.2f\n", m.toFloat/j.toFloat*j.toFloat)
        // e)
        printf("e) %.2f\n", f+10*5+g)
        // f)
        printf("f) scala doesn't support increment decrement operators")
        // printf("f) %d\n", (++i)*n)   

        
    }
}

object answers3partb{
    def main(args: Array[String])={
        println("\nQuestion 3 part b\n")
        println("differences of java and scala")
        println("java supports increment and decrement operators while scala doesn't support those operators.")
        println("scala supports operator overloading wehreas java doesn't support operator overloading.")
        println("scala variables are immutable by default where as java mutable by default.")
        println("scala is less readable language whereas java is a very readable languadge.\n")

        var (a,b,c,d) = (2,3,4,5)
        var (k,g) = (4.3,4.0)

        println("a) scala doesn't support increment decrement operators")
        // println(--b*a+c*d--)     
        println("b) scala doesn't support increment decrement operators")
        // println(a++)             
        printf("c) %.2f\n",-2*(g-k)+c)
        println("d) scala doesn't support increment decrement operators")
        // println(c=c++)           
        println("e) scala doesn't support increment decrement operators")
        // println(c=++c*a++)       
    }
}

object answers4{
    def main(args: Array[String])={
        //question 4 answers
        println("\nQuestion 4")
        printf("part a ") 
        def grossSal(normal: Int, ot: Int):Int = (normal*250)+(ot*85)
        def tax(gross: Int): Int = (gross*.12).toInt
        def takehome(normal: Int, ot: Int):Int = grossSal(normal,ot) - tax(grossSal(normal,ot));
        printf("answer when normal hours = 40 and OT hours = 30 : %d",takehome(40,30))

        printf("\npart b ")
        def attendance(price: Int):Int = 120 + (15 - price)/5*20
        def earn(price: Int):Int = price*attendance(price)
        def cost(price: Int):Int = 500 + attendance(price)*3
        def profit(price: Int):Int = earn(price) - cost(price)
        printf("maximum profit:\nanswer when ticket price is 24 : %d",profit(24))
    }
}
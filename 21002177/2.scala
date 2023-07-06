object A {

    def main(args: Array[String]):Unit={
        val a = scala.io.StdIn.readInt()
        println("The value of a is " + a)
        val result = match_num(a)
        println(result)
    }


    def match_num(x : Int):String = x match{
    case x if x <= 0 => "Negative/Zero is input"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
}
}
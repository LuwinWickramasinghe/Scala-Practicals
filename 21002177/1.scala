object A {

    def main(args: Array[String]):Unit={
        println(cal_interest(2000));
    }

    def cal_interest(dep_amount: Double): Double = {

    if(dep_amount > 2000000 )
        dep_amount * 0.065
    else if (dep_amount > 200000 && dep_amount <= 2000000)
        dep_amount * 0.035
    else if(dep_amount > 20000 && dep_amount <= 200000)
        dep_amount * 0.04
    else
        dep_amount * 0.02
    }
}
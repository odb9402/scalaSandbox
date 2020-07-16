//Tail recursion
@annotation.tailrec
def power(x: Int, n: Int, t: Int = 1): Int = {
    if (n < 1)
        t
    else
        power(x, n-1, x*t)
}
/*
Wrong tail recursion
@annotation.tailrec
def power(x: Int, n: Int): Int = {
    if (n < 1)
        1
    else
        x * power(x, n-1) // > The last of function is not just calling the function power.
}
*/

power(2,12)
/////////////////////////////////////////////////////////////////////////////////////
def factorize(items: Double*): Double = {
    var total = 1.0
    for(x <- items){
        total = total * x
    }
    total
}
factorize(0.1,0.23,41.2,99.1)
/////////////////////////////////////////////////////////////////////////////////////

//Lab 1.
def radius(r: Double): Double = {r*r*Math.PI}
radius(0.3)

//Lab 2.
def radius(r: String): Double = {r.toDouble*r.toDouble*Math.PI}
radius("0.3")
//radius("") Run time error

//Lab 3.
@annotation.tailrec
def adder(x: Int): Int ={
    if(x >= 50)
        x
    else
        adder(x + 5)
}
adder(5)

//Lab 4.
def dateCal(x: Long): Unit={
    var remainTime = x
    val date: Long = x / (1000*60*60*24)
    remainTime = remainTime % (1000*60*60*24)
    val hour: Int = (remainTime / (1000*60*60)).toInt
    remainTime = remainTime % (1000*60*60)
    val minute: Int = (remainTime / (1000*60)).toInt
    remainTime = remainTime % (1000*60)
    val sec: Int = (remainTime / (1000)).toInt

    println(f"${date}days:${hour}h:${minute}m:${sec}s")
}
dateCal(1000303002)

//Lab 5.
def powerDouble(x: Double, y :Double): Double={
    math.pow(x,y)
}
powerDouble(2,43)

@annotation.tailrec
def powerDouble(x: Double, y :Int, s: Double=1): Double={
    if(y == 0)
        s
    else
        powerDouble(x, y-1, s*x)
}
powerDouble(2,43)

//Lab 6.
def distance(a: (Double, Double), b: (Double, Double)): Double={
    math.sqrt(math.pow((a._1 - b._1),2) + math.pow((a._2 - b._2),2))
}
distance((2.13,4.21),(1.222,99.33))

//Lab 7.
def reorder(x: (Any, Any)): (Any, Any)={
    if(x._2.isInstanceOf[Int])
        (x._2, x._1)
    else
        x
}
reorder((3.1,1))
reorder((1,3.4))

//Lab 8.
def expandTuple(x: (Any,Any,Any)) :(Any,Any,Any,String,String,String)={
    (x._1, x._1.toString, x._2, x._2.toString, x._3 , x._3.toString)
}
expandTuple(1,2,3)
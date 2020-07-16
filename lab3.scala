/*package SCALASANDBOX

object fofo{
    var x: Int = 5
    println(x)
}*/

// Lab 1.
val name: String = null
val exp = name match {
    case n if n == null => "n/a" 
    case n => n
}

// Lab 2.
val amount: Double = 0

if (amount > 0) {
    "greater"
} else if (amount < 0) {
    "less"
} else "same"
    
amount match {
    case n if n > 0 => "greater"
    case n if n < 0 => "greater"
    case 0 => "same"
}

// Lab 3.
val color = "yellow"
color match{
    case "cyan" => f"0xFF0000"
    case "yellow" => f"0x0000FF"
    case "magenta" => f"0xFFFF00"
    case x => "error: $x given"
}

def colorToHex(inStr: String): String = {
    inStr match{
        case "cyan" => f"0xFF0000"
        case "yellow" => f"0x0000FF"
        case "magenta" => f"0xFFFF00"
        case x => "error: $x given"
    }
}

colorToHex("cyan")
colorToHex{
    val first :String = "cy"
    val second :String = "an"
    first+second}

// Lab 4
for(i <- 1 to 30){
    print(i+", ")
    if(i % 5 == 0){
        println("")
    }
}


// Lab 5
for(i <- 1 to 100){
    if(i % 5 == 0 && i % 3 == 0){
        println("typesafe")
    }
    if(i % 5 == 0){
        println("safe")
    }
    if(i % 3 == 0){
        println("type")
    }
}


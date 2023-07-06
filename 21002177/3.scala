import scala.io.StdIn
  
  object question{

    def formatnames(operation :(String,Int)=> String,a :String, b : Int):String ={
        operation(a,b)
    }

      
    def toUpper(name : String,index : Int): String = index match{

        case n if (0 to name.length-1).contains(n) =>
            val character=name.charAt(n)
            name.substring(0,n) + character.toUpper+ name.substring(n + 1)
        case n if n== -1 => name.toUpperCase()
        case _ => name
        
    }
              
    def toLower(name : String,index : Int): String = index match{

        case n if (0 to name.length-1).contains(n) =>
            val character=name.charAt(n)
            name.substring(0,n) + character.toLower+ name.substring(n + 1)
        case n if n== -1 => name.toLowerCase()
        case _ => name
    } 

    def main(args: Array[String]): Unit = {
    println("Enter name: ")
    val name = StdIn.readLine()

    println("Enter Index (Enter -1 to convert all the letters to uppercase or lowercase): ")
    val index = StdIn.readInt()

    println("Enter 1 to convert to uppercase or 2 to convert to lowercase: ")
    val choice = StdIn.readInt()

    val formattedName = choice match {
        case 1 => formatnames(toUpper, name, index)
        case 2 => formatnames(toLower, name, index)
        case _ => name
    }

    println(formattedName)
    }

  }
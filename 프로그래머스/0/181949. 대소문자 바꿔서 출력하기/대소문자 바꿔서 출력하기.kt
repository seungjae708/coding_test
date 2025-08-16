fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    val result = s1.map{
        if (it.isUpperCase()) {
            it.toLowerCase()
        }
        else {
            it.toUpperCase()
        }
    }.joinToString("")
    println(result)
}
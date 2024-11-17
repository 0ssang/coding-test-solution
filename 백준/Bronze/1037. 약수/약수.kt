fun main() {
    val n = readln().toInt()
    val input = readln().split(" ").map{it.toInt()}
    println(input.max() * input.min())
}
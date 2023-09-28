fun main(args: Array<String>) {
    print("Enter the number of disks: ")
    val disksNum = readln().toInt()

    hanoi(disksNum, "A", "C", "B")

}
fun hanoi(n: Int, source: String, destination: String, aux: String) {

    if (n == 1) {
        println("Move disk 1 from rod $source to rod $destination")
        return
    }else {
        hanoi(n - 1, source, aux, destination)
        println("Move disk $n from rod $source to rod $destination")
        hanoi(n - 1, aux, destination, source)
    }
}

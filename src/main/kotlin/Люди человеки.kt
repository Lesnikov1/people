fun main() {
    val version1 = "человеку"
    val version2 = "людям"
    val likes = 2

    val result = if (likes % 10 == 1 && likes != 11) version1 else version2
    println("$likes $result")
}
fun main(args: Array<String>) {
    //Safe calling
    //?.Let

    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }

    //The ?. cahining
    //student? .teacher?.supervisor?.name = "Seymour Skinner"
}

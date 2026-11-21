class Person(val name: String): Walk {
    override fun walk() {
        println("$name is walking")
    }

    override fun run() {
        println("$name is runing")
    }
}
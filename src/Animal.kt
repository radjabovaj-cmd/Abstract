abstract class Animal(val name: String) {
    abstract fun sound()

    fun sleep() {
        println("$name is a sleeping")
    }
}
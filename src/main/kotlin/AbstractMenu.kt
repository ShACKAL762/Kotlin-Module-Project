abstract class AbstractMenu(private val name: String) {



    val list = mutableListOf<String>()

    init {
        list.add("Создать")
        list.add("Выход")
    }
     fun view(){
         println(name)
         for (i in 1..list.size)
             println("$i.${list[i-1]}")
     }
    fun choice():Int{
        var userInput = Scanner().scannerMenu()
        while (!(userInput >= 1 && userInput <= list.size +1)) {
            println("\nЧисло выходит за диапазон")
            view()
            userInput = Scanner().scannerMenu()
        }
        return when (userInput) {
            1 -> {
                add()
                0
            }
            list.size -> -1
            else -> elseReturn(userInput)
        }
    }

    abstract fun add()
    abstract fun elseReturn(choice: Int): Int
}
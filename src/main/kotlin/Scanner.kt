
import java.lang.NumberFormatException
import java.util.Scanner
class Scanner{
    companion object{
        val scanner = Scanner(System.`in`)
    }
    fun scannerMenu():Int{
        println("Введите номер пункта меню")
        while (true) {
            val line = scanner.nextLine()
            try {
                return line.toInt()
            } catch (e: NumberFormatException) {
                println("Вы ввели не число")
            }

            }
        }

    fun scannerCreate():String{
        while (true) {
            val line = scanner.nextLine()
                if (line.trim().isNotEmpty())
                    return line
            else {
                println("Поле не может быть пустым")
            }
        }
    }
}


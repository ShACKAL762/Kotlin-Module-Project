class FirstMenu {
    companion object {
        val archives = mutableMapOf<String, MutableMap<String, String>>()
    }


    fun menuView() {
        println("Список архивов:")
        println("1.Создать новый архив")
        var i = 2
        for (name in archives) {
            println("$i.${name.key}")
            i++
        }
        println("${archives.size + 2}.Выход")
    }

    fun choice(): Int {

        var menu = Scanner().scannerMenu()
        while (!(menu >= 1 && menu <= archives.size + 2)) {
            println("Число выходит за диапазон")
            menu = Scanner().scannerMenu()
        }
        return when (menu) {
            1 -> {
                addArchive()
                0
            }
            archives.size + 2 -> -1
            else -> menu
        }
    }

}
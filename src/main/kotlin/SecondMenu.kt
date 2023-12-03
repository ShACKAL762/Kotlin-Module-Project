

class SecondMenu {
    companion object{
        var notes = mutableMapOf<String,String>()
    }
    fun menuView (){
        println("Список Заметок:")
        println("1.Создать новую заметку")
        var i = 2
        for (name in notes) {
            println("$i.${name.key}")
            i++
        }
        println("${notes.size+2}.Выход")
    }


        fun choice(): Int {
            var menu = Scanner().scannerMenu()
            while (!(menu >= 1 && menu <= notes.size + 2)) {
                println("Число выходит за диапазон")
                menu = Scanner().scannerMenu()
            }
            return when (menu) {
                1 -> {
                    notes = addNote(notes)
                    0
                }
                notes.size + 2 -> -1
                else -> {
                    var i = 0
                    for (note in notes) {
                        if (i == menu - 2) {
                            NoteView(note.value)
                        }
                        i++
                }
                    return 0
                }


        }
    }


}
class SecondMenu:AbstractMenu("Список Заметок") {
    val mapList: MutableMap<String,String> = mutableMapOf()


    override fun add() {
        addNote(this)
    }

    override fun elseReturn(choice: Int): Int {
        NoteView(mapList[list[choice-1]])
        return choice
    }
}

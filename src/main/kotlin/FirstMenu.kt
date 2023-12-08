class FirstMenu:AbstractMenu("Список Архивов:") {
    val mapList = mutableMapOf<String, SecondMenu>()


    override fun add() {
        addArchive(this)
    }

    override fun elseReturn(choice: Int): Int = choice


}
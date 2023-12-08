fun addNote(menu: SecondMenu): MutableMap<String, String> {
    val exitCommand = "0"
    val archive = menu.mapList
    val list = menu.list
    var command:String
    println("Введите имя новой заметки или 0 для возврата")
    while (true) {
        command = Scanner().scannerCreate()
        if (command == exitCommand) {
            return archive
        }
        if (list.contains(command))
            println("Заметка с таким именем существует, выберите другое")
        else break

    }
    val title = command
    println("Введите содержание заметки")
    val text = Scanner().scannerCreate()
    list.add(list.size-1,command)
    archive[title] = text
    return archive
}
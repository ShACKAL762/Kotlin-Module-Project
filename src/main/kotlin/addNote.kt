fun addNote(archive: MutableMap<String, String>): MutableMap<String, String> {
    val exitCommand = "0"
    println("Введите имя новой заметки или 0 для возврата")
    val command = Scanner().scannerCreate()
    if (command == exitCommand) {
        return archive
    }
    val title = command
    println("Введите содержание заметки")
    val text = Scanner().scannerCreate()
    archive.put(title,text)
    return archive
}
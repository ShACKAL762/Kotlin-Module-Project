fun addArchive () {
    val exitCommand = "0"
    println("Введите имя нового архива или 0 для возврата")
    val command = Scanner().scannerCreate()
    if (command == exitCommand){
        return
    }
    FirstMenu.archives[command] = mutableMapOf()
}
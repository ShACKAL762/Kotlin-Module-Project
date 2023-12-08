fun addArchive (mainMenu: FirstMenu) {
    val exitCommand = "0"
    val archive = mainMenu.mapList
    val menuList = mainMenu.list
    var command: String

    println("Введите имя нового архива или 0 для возврата")
    while (true){
        command = Scanner().scannerCreate()
        if (command == exitCommand){
            return
        }
        if (mainMenu.list.contains(command))
            println("Архив с таким именем существует, выберите другое")
        else break
        }
    archive[command] = SecondMenu()
    menuList.add(mainMenu.list.size-1,command)

}
fun main() {
    val firstMenu = FirstMenu()
    var choice = 0
    var state = State.ARCH
    while (true) {
        when (state) {
            State.ARCH -> {
                if (choice < 0) {
                    return
                } else if (choice == 0) {
                    firstMenu.view()
                    choice = firstMenu.choice()
                } else state = State.NOTE
            }

            State.NOTE -> {
                if (choice < 0) {
                    choice = 0
                    state = State.ARCH
                } else {
                    val noteMenu = firstMenu.mapList[firstMenu.list[choice - 1]]
                    noteMenu?.view()
                    val temp = noteMenu?.choice()
                    if (temp != null) {

                        if (temp < 0) {
                            choice = temp
                        }
                    }
                }

            }
        }
    }
}
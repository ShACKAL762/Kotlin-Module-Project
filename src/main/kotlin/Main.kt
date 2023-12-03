import FirstMenu.Companion.archives
import SecondMenu.Companion.notes


fun main() {
    val firstMenu = FirstMenu()
    var choice = 0
    var state = State.ARCH
    while (true) {
        when(state){
            State.ARCH -> {
            if(choice < 0) {
                return
            }else if (choice == 0){
                firstMenu.menuView()
                choice = firstMenu.choice()
            }else state = State.NOTE
            }
            State.NOTE -> {
                if(choice < 0) {
                    choice = 0
                    state = State.ARCH
                }else {
                    var i = 0
                    for (arch in archives) {
                        if (i == choice - 2) {
                            notes = arch.value
                            break
                        }
                        i++
                    }
                    SecondMenu().menuView()
                    val temp = SecondMenu().choice()
                    if (temp<0)
                        choice = temp
                }

            }
        }
    }
}
import Entity.Player.Player
import Input.InputSystem

class Menu {

    companion object {
        fun game() {
            val name = InputSystem.nameInput()
            var player = Player(name)
            var quit = false

            //Once the name is chosen, we start
            do {
                //Show player info before choices
                Show.showPlayer(player)
                //Home choice
                when (InputSystem.home()){
                    //When 1 do random battle again's random ennemie
                    1 -> Battle.battle(player)
                    //2 -> Rest in inn action
                    3 -> quit = true
                    //When 2 call the in to rest ( gold gestion fo to the inn )
                }
            } while (!quit)
        }
    }

}
import Entity.Ennemi.Slime
import Entity.Ennemi.Wolf
import Entity.PhysicalBody
import Entity.Player.Player
import Input.InputSystem

object Battle {

    fun battle(player: Player){
        var ennemie: PhysicalBody
        var run: Boolean = false
        ennemie = when ((1..2).random()) {
            1 -> Wolf("Wolf")
            2 -> Slime("Slime")
            else -> Wolf("Dummy")
        }

        do {
            run = when (InputSystem.command()) {
                1 -> attack(player, ennemie)
                2 -> defend(player, ennemie)
                3 -> run()
                else -> false
            }
        } while (player.hp > 0 && ennemie.hp > 0 && !run)
        // Put back to default state
        run = false
        player.winCoin(ennemie.coin)
    }


    fun attack(player: Player, ennemie: PhysicalBody): Boolean {
        Show.battlemsgatk(player, ennemie)
        ennemie.takeDamage(player.atk - ennemie.def)
        player.takeDamage(ennemie.atk - player.def)
        return false
    }

    fun defend(player: Player, ennemie: PhysicalBody): Boolean {
        Show.battlemsgdef(player, ennemie)
        player.takeDamage(ennemie.atk - player.def - 2)
        return false
    }

    fun run(): Boolean {
        return (0..100).random() % 2 == 0
    }
}

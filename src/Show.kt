import Entity.PhysicalBody
import Entity.Player.Player

object Show {

    fun showPlayer(player: Player) {
        println("╔══ ${player.name} ══╗")
        print("║   ")
        for (char in player.name) {
            print(" ")
        }
        println("   ║")
        println("║ Hp   : ${player.currentHP}/${player.hp}")
        println("║ Atk  : ${player.atk}")
        println("║ Def  : ${player.def}")
        println("║ Coin : ${player.coin}")
        print("╚═══")
        for (char in player.name) {
            print("═")
        }
        println("═══╝")
    }

    fun battlemsgatk(player: Player, ennemie: PhysicalBody) {
        println("${player.name} Attack the ${ennemie.name}!")
        println("${ennemie.name} take ${player.atk - ennemie.def} damage !")
        println("${player.name} take ${ennemie.atk - player.def} damage !")
    }

    fun battlemsgdef(player: Player, ennemie: PhysicalBody) {
        println("${player.name} rise his guard!")
        println("${player.name} take ${ennemie.atk - player.def - 2} damage !")
    }
}
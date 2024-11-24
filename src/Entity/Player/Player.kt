package Entity.Player

import Entity.PhysicalBody

class Player(name: String): PhysicalBody(name){

    init {
        this.hp = 10
        this.currentHP = 10
        this.atk = 3
        this.def = 0
        this.coin = 0
    }

    fun winCoin(coin: Int){
        this.coin += coin
    }

    fun levelUp(){
        val hpwin = (0..3).random()
        this.hp += hpwin
        this.currentHP += hpwin
        this.atk = (0..1).random()
        this.def = (0..1).random()
    }
}
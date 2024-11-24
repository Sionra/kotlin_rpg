package Entity.Ennemi

import Entity.PhysicalBody

class Wolf(name: String): PhysicalBody(name) {

    init {
        this.hp = 5
        this.currentHP = 5
        this.atk = 2
        this.def = 0
        this.coin = (1..3).random()
    }
}
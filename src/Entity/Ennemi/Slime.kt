package Entity.Ennemi

import Entity.PhysicalBody

class Slime(name: String): PhysicalBody(name) {
    init {
        this.hp = 5
        this.currentHP = 5
        this.atk = 1
        this.def = 3
        this.coin = (2..5).random()
    }
}
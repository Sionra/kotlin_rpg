package Entity

abstract class PhysicalBody(val name: String) {
    var hp: Int protected set
    var currentHP: Int protected set
    var atk: Int protected set
    var def: Int protected set
    var coin: Int protected set

    constructor(name: String, hp: Int, atk: Int, def: Int, coin: Int) : this(name) {
        this.hp = hp
        this.currentHP = hp
        this.atk = atk
        this.def = def
        this.coin = coin
    }

    init {
        this.hp = 1
        this.currentHP = 1
        this.atk = 1
        this.def = 0
        this.coin = 0
    }

    fun takeDamage(damage: Int) {
        this.currentHP -= damage
    }
}
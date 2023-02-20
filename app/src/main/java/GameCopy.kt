import kotlin.math.pow

fun main() {
    val name = "Madrigal"
    val race = "gnome"
    val healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.random().pow((110 - healthPoints) / 100.0) * 20).toInt()

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal // true or false
    val auraColor = if (auraVisible) {
        when (karma) {
            in 0..5 -> "red"
            in 6..10 -> "orange"
            in 11..15 -> "purple"
            in 16..20 -> "green"
            else -> {"Aura disappear"}
        }
    } else {
        "Aura invisible"
    }

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
    val statusFormatString = "(HP: $healthPoints)(Aura: $auraColor) -> $healthStatus"
    println(statusFormatString)

}


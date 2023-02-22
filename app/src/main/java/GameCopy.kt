fun main() {
    val name = "Madrigal"
    val healthPoints = 89
    val numFireballs = 0
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    val intoxicationLevel = castFireball(numFireballs)
    printPlayerStatus(auraColor, isBlessed, name, healthStatus, intoxicationLevel, numFireballs)
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String,
    intoxicationLevel: String,
    numFireballs: Int
) {
    println("Aura: $auraColor | Blessed: ${if (isBlessed) "YES" else "NO"} | " +
            "Intoxication: $intoxicationLevel ")
    println("A glass of Fireball springs into existence. (x$numFireballs)")
    println("$name $healthStatus")
}

private fun auraColor(
    isBlessed: Boolean,
    healthPoints: Int,
    isImmortal: Boolean
) = if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) = when (healthPoints) {
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

private fun castFireball(numFireballs: Int) =
    when (numFireballs) {
        0 -> "Sober"
        in 1..10 -> "Tipsy"
        in 11..20 -> "Sloshed"
        in 21..30 -> "Soused"
        in 31..40 -> "Stewed"
        else -> "t0aSt3d"
    }


package com.gamezeug.tables.model

data class Table(
        val id: String,
        val status: GameTableStatus = GameTableStatus.OPEN,
        val maxNumberOfPlayers: Int,
        val name: String,
        val players: List<Player>) {

    fun isTableFull(): Boolean {
        return players.size == maxNumberOfPlayers
    }
}

enum class GameTableStatus {
    OPEN, RUNNING, PAUSED, FINISHED
}

data class Player(val id: String)

package com.gamezeug.tables.persistence

import com.gamezeug.tables.common.exception.ResourceNotFoundException
import com.gamezeug.tables.model.Table
import org.springframework.stereotype.Component

@Component
class TableDao {

    private val tables: MutableMap<String, Table> = mutableMapOf()
    
    fun getAllGames(): List<Table> {
        return tables.values.toList()
    }

    fun getGameTableById(gameId: String): Table {
        return tables.getOrElse(gameId) { throw ResourceNotFoundException("Table $gameId does not exist") }
    }
    
    fun save(game: Table) {
        tables[game.id] = game
    }
    
    fun delete(gameId: String) {
        tables.remove(gameId) ?: throw ResourceNotFoundException("Table $gameId does not exist")
    }
    
}
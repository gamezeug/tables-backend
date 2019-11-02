package com.gamezeug.tables.core

import com.gamezeug.tables.model.GameTableStatus
import com.gamezeug.tables.model.Player
import com.gamezeug.tables.model.Table
import org.springframework.stereotype.Service
import java.security.Principal

@Service
class TableService {

    private val fakeTable1 = Table(
            id = "1",
            status = GameTableStatus.OPEN,
            maxNumberOfPlayers = 2,
            name = "Falcon One",
            players = listOf(Player("007"), Player("Red"))
    )

    private val fakeTable2 = Table(
            id = "2",
            status = GameTableStatus.OPEN,
            maxNumberOfPlayers = 3,
            name = "Falcon two",
            players = listOf(Player("john"))
    )

    private val fakeTables = listOf(fakeTable1, fakeTable2)

    fun getTables(): List<Table> {
        return fakeTables
    }

    fun createTable(table: Table, principal: Principal): Table {
        return table
    }

}
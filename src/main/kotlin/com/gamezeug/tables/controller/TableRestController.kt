package com.gamezeug.tables.controller

import com.gamezeug.tables.model.Table
import org.apache.logging.log4j.LogManager
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*
import java.security.Principal

@RestController
@RequestMapping("/tables")
class TableRestController {

    private val log = LogManager.getLogger(TableRestController::class.java)

    @GetMapping
    fun getTables(principal: Principal?): List<Table> {
        log.info("${principal?.name} is reading the tables")
        return listOf()
    }

    @PreAuthorize("#oauth2.hasScope('table.write')")
    @PostMapping
    fun createTable(@RequestBody table: Table, principal: Principal): Table {
        log.info("${principal.name} is creating the table $table")
        return table
    }

}
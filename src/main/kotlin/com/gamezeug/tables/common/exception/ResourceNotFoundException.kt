package com.gamezeug.tables.common.exception

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class ResourceNotFoundException(reason: String?) : ResponseStatusException(HttpStatus.NOT_FOUND, reason) {}
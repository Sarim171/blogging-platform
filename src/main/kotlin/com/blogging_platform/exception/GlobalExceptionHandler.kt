package com.blogging_platform.exception

import com.blogging_platform.entities.dto.response.ApiResponse
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@RestControllerAdvice
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(ResourceNotFoundException::class)
    fun handleResourceNotFoundException(e: ResourceNotFoundException): ResponseEntity<ApiResponse.Error> {
        return ResponseEntity(
            ApiResponse.Error(status = false, message = e.message),
            e.httpStatus
        )
    }

    @ExceptionHandler(ResourceAlreadyExistException::class)
    fun handleResourceAlreadyExistException(e: ResourceAlreadyExistException): ResponseEntity<ApiResponse.Error> {
        return ResponseEntity(
            ApiResponse.Error(status = false, message = e.message),
            e.httpStatus
        )
    }

    @ExceptionHandler(InvalidJwtException::class)
    fun handleInvalidJwtException(e: InvalidJwtException): ResponseEntity<ApiResponse.Error> {
        return ResponseEntity(
            ApiResponse.Error(status = false, message = e.message),
            e.httpStatus
        )
    }

    override fun handleMethodArgumentNotValid(
        ex: MethodArgumentNotValidException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any>? {
        val errors = ex.allErrors.map { it.defaultMessage }
        return ResponseEntity(
            ApiResponse.Error(
                status = false,
                message = errors.joinToString(", ")
            ),
            status
        )
    }
}
package com.nomadlab.imstupidnigger.modules.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CommonAdvice {

    @ExceptionHandler(Common400Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ProblemDetail onException (Common400Exception exception) {
        return ProblemDetail.forStatusAndDetail (
                HttpStatusCode.valueOf(HttpStatus.BAD_REQUEST.value()), exception.getMessage()
        );
    }

    @ExceptionHandler(Common401Exception.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    ProblemDetail on401Exception (Common401Exception exception) {
        return ProblemDetail.forStatusAndDetail(
                HttpStatusCode.valueOf(HttpStatus.UNAUTHORIZED.value()), exception.getMessage()
        );
    }

    @ExceptionHandler(Common403Exception.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    ProblemDetail on403Exception (Common403Exception exception) {
        return ProblemDetail.forStatusAndDetail(
                HttpStatusCode.valueOf(HttpStatus.FORBIDDEN.value()), exception.getMessage()
        );
    }

    @ExceptionHandler(Common500Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ProblemDetail on500Exception (Common500Exception exception) {
        return ProblemDetail.forStatusAndDetail(
                HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()), exception.getMessage()
        );
    }

}

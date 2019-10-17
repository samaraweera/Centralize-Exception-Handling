package com.commonexception.exception;

import com.commonexception.model.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public final ResponseEntity<BaseResponse> handleCustomerNotFoundException(CustomerNotFoundException ex, WebRequest request){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setExecutionCode("001");
        baseResponse.setExecutionDesc(ex.getMessage());
        return  new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<BaseResponse> handleAllExceptions(Exception ex, WebRequest request) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setExecutionCode("001");
        baseResponse.setExecutionDesc(ex.toString());
        return new ResponseEntity<>(baseResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

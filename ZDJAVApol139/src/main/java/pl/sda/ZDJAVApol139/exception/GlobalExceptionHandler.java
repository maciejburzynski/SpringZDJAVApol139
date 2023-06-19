package pl.sda.ZDJAVApol139.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.sda.ZDJAVApol139.dog.DogNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(DogNotFoundException.class)
    String dogNotFoundExceptionHandler(DogNotFoundException exception) {
        return exception.getMessage();
    }

}

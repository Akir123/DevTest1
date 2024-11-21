package in.ashokit.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
public ResponseEntity<Errorinfo> handleException(Exception e) {
	String exMsg = e.getMessage();
	Errorinfo info = new Errorinfo();
	info.setCode("SBIEX003");
	info.setMsg("exMsg");
	info.setWhen(LocalDateTime.now());
	
	return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
}
	
	@ExceptionHandler(value = UserNotFoundException.class)
public ResponseEntity<Errorinfo> handleException(UserNotFoundException e) {
	String exMsg = e.getMessage();
	Errorinfo info = new Errorinfo();
	info.setCode("SBIEX003");
	info.setMsg("exMsg");
	info.setWhen(LocalDateTime.now());
	
	return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
}
}

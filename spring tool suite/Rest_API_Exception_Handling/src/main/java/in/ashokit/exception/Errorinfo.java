package in.ashokit.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Errorinfo {
private String code;
private String msg;
private LocalDateTime when;

}

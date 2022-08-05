package week_14_exception.task1;

import java.util.Scanner;

public class AgeDoesnotMatchException extends  Throwable {

    AgeDoesnotMatchException(String msg){
        super(msg);
    }
}

package model.command;

import java.io.IOException;
import java.sql.SQLException;

public class WrapperClass extends Exception{
    public static int getError(Exception e){
        e.printStackTrace();
        if (e instanceof IOException){
            return 700;
        } else if (e instanceof SQLException) {
            return 701;
        }
        else
            return 800;
    }
}

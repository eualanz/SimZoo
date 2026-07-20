package Entidades;

import java.util.Date;
import lombok.*;
import java.util.Calendar;


public class DataUtility {

    public static int  calcularIdade (Date dataNascimento){
        Calendar calendarDataNascimento = Calendar.getInstance();
        calendarDataNascimento.setTime(dataNascimento);
        
        Calendar hoje = Calendar.getInstance();

        return hoje.get(Calendar.YEAR) - calendarDataNascimento.get(Calendar.YEAR);
    }
}

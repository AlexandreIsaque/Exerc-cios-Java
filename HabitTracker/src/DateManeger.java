package HabitTracker.src;
import java.text.DateFormat;
import java.util.Date;

public class DateManeger {
    public String data(){
        // data
        Date data = new Date();
        // formatacao da data
        DateFormat dateFormat = DateFormat.getDateInstance();
        // data formatada
        return dateFormat.format(data);
    }
}

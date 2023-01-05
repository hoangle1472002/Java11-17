import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Records {
    public record Person(String name,Integer Age){
        public String GetCurrentDate(){
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
            String curr  = now.format(dateTimeFormatter);
            return curr;
        }
    }
    public static void main(String[] args) {
        Person p = new Person("Le Hoang",20);
        System.out.println(p.toString());
        System.out.println(p.GetCurrentDate());
    }
}

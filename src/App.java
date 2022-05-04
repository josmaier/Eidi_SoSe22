import java.util.Calendar;
import static java.util.Calendar.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Calendar.getInstance().get(HOUR_OF_DAY) + ":" + Calendar.getInstance().get(MINUTE));
    }
}

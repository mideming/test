import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test3{


    public static void main(String[] args) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        calendar.add(Calendar.YEAR,1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, -1);
        Date time = calendar.getTime();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        calendar1.add(Calendar.YEAR,1);
        calendar1.add(Calendar.MONTH, 0);
        calendar1.add(Calendar.HOUR_OF_DAY, 0);
        calendar1.add(Calendar.MINUTE, 0);
        calendar1.set(Calendar.SECOND, -1);
        Date time1 = calendar1.getTime();
    }
}

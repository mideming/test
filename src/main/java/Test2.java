import com.sun.deploy.util.StringUtils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Test2 {
    static {
        System.out.println("aaa");
    }
    public static void main(String[] args) {
        List<Long> a = new ArrayList<>();
        a.add(9L);
        a.add(1L);
        a.add(4L);
        a.add(5L);
        a.add(2L);
        a.add(6L);
        a.add(7L);
        a.add(11L);
        a.add(8L);
        a.add(2L);
        a.add(12L);
        a.add(10L);
        System.out.println(a);
        List<Long> b = new ArrayList<>();
        Collections.sort(a, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if (o1 == o2) {
                    return 0;
                } else {
                    return o2.compareTo(o1);
                }
            }
        });
        System.out.println(a);
    }

    public static Date calculateZeroHour(Date baseDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        calendar.add(Calendar.YEAR,1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, -1);
        return calendar.getTime();
    }

    public static Date calculateCurrentDayEnd(Date baseDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(baseDate);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}

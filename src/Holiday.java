import java.time.LocalDate;
import java.time.Month;

public class Holiday {

    public String isTodayChristmas() {
        LocalDate today = getToday();
        if (today.getMonth() == Month.DECEMBER && (today.getDayOfMonth() == 24 || today.getDayOfMonth() == 25))
            return "Merry Christmas";
        else
            return "Not X'mas";
    }

    protected LocalDate getToday() {
        return LocalDate.now();
    }
}

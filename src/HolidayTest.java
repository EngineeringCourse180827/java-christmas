import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class HolidayTest {

    @Test
    public void today_is_Christmas() {
        FakeHolidayForTest holiday = new FakeHolidayForTest();
        holiday.setToday(LocalDate.parse("2018-12-25"));

        assertEquals("Merry Christmas", holiday.isTodayChristmas());
    }

    class FakeHolidayForTest extends Holiday {

        private LocalDate today;

        @Override
        protected LocalDate getToday() {
            return today;
        }

        public void setToday(LocalDate today) {
            this.today = today;
        }
    }

}
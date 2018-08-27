import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class HolidayTest {

    private FakeHolidayForTest holiday = new FakeHolidayForTest();

    @Test
    public void today_is_christmas_dec_25() {
        givenToday("12-25");

        responseShouldBe("Merry Christmas");
    }

    @Test
    public void today_is_christmas_dec_24() {
        givenToday("12-24");

        responseShouldBe("Merry Christmas");
    }

    @Test
    public void today_is_not_christmas() {
        givenToday("09-01");

        responseShouldBe("Not X'mas");
    }

    private void responseShouldBe(String expected) {
        assertEquals(expected, holiday.isTodayChristmas());
    }

    private void givenToday(String monthDay) {
        holiday.setToday(LocalDate.parse("2018-" + monthDay));
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
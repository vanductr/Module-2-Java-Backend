package rikkei.academy;

import java.time.LocalDate;

public class NextDayCalculator {

    public static LocalDate calculateNextDay(LocalDate currentDate) {
        return currentDate.plusDays(1);
    }
}


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import rikkei.academy.NextDayCalculator;

import java.time.LocalDate;

public class NextDayCalculatorTest {

    @Test
    void testCalculateNextDay() {
        // Arrange
        LocalDate currentDate = LocalDate.of(2022, 1, 1);
        LocalDate expectedNextDay = LocalDate.of(2022, 1, 2);

        // Act
        LocalDate nextDay = NextDayCalculator.calculateNextDay(currentDate);

        // Assert
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    void testCalculateNextDay2() {
        // Arrange
        LocalDate currentDate = LocalDate.of(2018, 1, 31);
        LocalDate expectedNextDay = LocalDate.of(2018, 2, 1);

        // Act
        LocalDate nextDay = NextDayCalculator.calculateNextDay(currentDate);

        // Assert
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    void testCalculateNextDay3() {
        // Arrange
        LocalDate currentDate = LocalDate.of(2018, 4, 30);
        LocalDate expectedNextDay = LocalDate.of(2018, 5, 1);

        // Act
        LocalDate nextDay = NextDayCalculator.calculateNextDay(currentDate);

        // Assert
        assertEquals(expectedNextDay, nextDay);
    }
    @Test
    void testCalculateNextDay4() {
        // Arrange
        LocalDate currentDate = LocalDate.of(2018, 2, 28);
        LocalDate expectedNextDay = LocalDate.of(2018, 3, 1);

        // Act
        LocalDate nextDay = NextDayCalculator.calculateNextDay(currentDate);

        // Assert
        assertEquals(expectedNextDay, nextDay);
    }

    @Test
    void testCalculateNextDay5() {
        // Arrange
        LocalDate currentDate = LocalDate.of(2018, 12, 31);
        LocalDate expectedNextDay = LocalDate.of(2019, 1, 1);

        // Act
        LocalDate nextDay = NextDayCalculator.calculateNextDay(currentDate);

        // Assert
        assertEquals(expectedNextDay, nextDay);
    }
}


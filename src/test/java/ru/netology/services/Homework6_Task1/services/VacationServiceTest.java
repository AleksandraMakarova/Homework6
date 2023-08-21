package 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.services.Homework6_Task1.services.VacationService;

public class VacationServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        VacationService service = new VacationService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

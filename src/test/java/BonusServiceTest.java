import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
     void shouldcalculatorRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            // подготовляем данные;
            long amount = 1000_60;
            boolean registered = false;
            long expected = 10;

            // вызываем целивой метод;
            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);
    }
    @Test
    void shouldcalculatorRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
                     }
    @Test
    void shouldcalculatorRegisteredAndErrouLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 1000_60;
        boolean registered = false;
        long expected = 1;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculatorRegisteredAndNewLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 50500_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
             }  @Test
    void shouldcalculatorRegisteredNextOverLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 500;
        boolean registered = false;
        long expected = 30;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

         }

        }
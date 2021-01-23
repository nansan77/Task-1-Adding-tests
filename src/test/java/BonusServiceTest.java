import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
     void shouldcalculateRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            // подготовляем данные;
            long amount = 1000_60;
            boolean registered = false;
            long expected = 10;

            // вызываем целивой метод;
            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);
    } @Test
    void shouldcalculateRegisteredAndOrderLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 2_500_000_90;
        boolean registered = false;
        long expected = 500;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }@Test
    void shouldcalculateRegisteredAndNewLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 200;
        boolean registered = false;
        long expected = 0;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }@Test
    void shouldcalculatorRegisteredAndNextLimit() {
        BonusService service = new BonusService();

        // подготовляем данные;
        long amount = 26_500_40;
        boolean registered = false;
        long expected = 265;

        // вызываем целивой метод;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

                 }
    }
package temp;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {
    TemperatureConversionsSoapType service;

    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        BigDecimal target = BigDecimal.valueOf(32);

        assertEquals(target, result);

        result = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));

        target = BigDecimal.valueOf(0);

        assertEquals(target, result);

        result = service.windChillInCelsius(BigDecimal.valueOf(32.0), BigDecimal.valueOf(2.0));

        target = BigDecimal.valueOf(31.6796);

        assertEquals(target, result);

        result = service.windChillInFahrenheit(BigDecimal.valueOf(32.0), BigDecimal.valueOf(2.0));

        target = BigDecimal.valueOf(30.44408);

        assertEquals(target, result);
    }
}
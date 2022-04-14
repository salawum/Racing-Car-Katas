package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlarmTest {
    Alarm alarm;
    ISensor sensorStub;

    @Test
    @DisplayName("Alarm should not go off by default")
    public void checkAlarmDefaultState() {
        double pressureValue = 45;
        sensorStub = new SensorStub(pressureValue);
        alarm = new Alarm(sensorStub);

        assertFalse(alarm.isAlarmOn());
    }

    @Test
    @DisplayName("Alarm should not go off if pressure is between acceptable thresholds")
    public void checkAlarmWithinThreshold() {
        double pressureValue = 19;
        sensorStub = new SensorStub(pressureValue);
        alarm = new Alarm(sensorStub);

        alarm.check();

        assertFalse(alarm.isAlarmOn());
    }

    @Test
    @DisplayName("Alarm should go off if pressure is above acceptable thresholds")
    public void checkAlarmAboveThreshold() {
        double pressureValue = 68;
        sensorStub = new SensorStub(pressureValue);
        alarm = new Alarm(sensorStub);

        alarm.check();

        assertTrue(alarm.isAlarmOn());
    }

    @Test
    @DisplayName("Alarm should go off if pressure is below acceptable thresholds")
    public void checkAlarmBelowThreshold() {
        double pressureValue = 3;
        sensorStub = new SensorStub(pressureValue);
        alarm = new Alarm(sensorStub);

        alarm.check();

        assertTrue(alarm.isAlarmOn());
    }

    @Test
    @DisplayName("Alarm should not go off if pressure is above acceptable thresholds")
    public void checkAlarmAboveThresholdEdgeCase() {
        double highPressureThreshold = 21;
        sensorStub = new SensorStub(highPressureThreshold);
        alarm = new Alarm(sensorStub);

        alarm.check();

        assertFalse(alarm.isAlarmOn());
    }

    @Test
    @DisplayName("Alarm should not go off if pressure is below acceptable thresholds")
    public void checkAlarmBelowThresholdEdgeCase() {
        double lowPressureThreshold = 17;
        sensorStub = new SensorStub(lowPressureThreshold);
        alarm = new Alarm(sensorStub);

        alarm.check();

        assertFalse(alarm.isAlarmOn());
    }
}

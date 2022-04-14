package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    protected ISensor sensor;
    protected boolean alarmOn = false;

    public Alarm(ISensor sensor){
        this.sensor = sensor;
    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();
        setAlarmState(checkLowPsiPressure(psiPressureValue) || checkHighPsiPressure(psiPressureValue));
    }

    public boolean isAlarmOn() {
        return alarmOn; 
    }

    private boolean checkLowPsiPressure(double psiPressureValue){
        double lowPressureThreshold = 17;
        return psiPressureValue < lowPressureThreshold;
    }

    private boolean checkHighPsiPressure(double psiPressureValue){
        double highPressureThreshold = 21;
        return psiPressureValue > highPressureThreshold;
    }

    private void setAlarmState(boolean state){
        alarmOn = state;
    }
}

package tddmicroexercises.tirepressuremonitoringsystem;

public class SensorStub implements ISensor{
    double pressureValue;

    public SensorStub(double pressureValue){
        this.pressureValue = pressureValue;
    }

    @Override
    public double popNextPressurePsiValue() {
        return pressureValue;
    }
}

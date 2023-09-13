package Interfaces;

public interface CargoAirplane {
    public boolean warnOverload();
    public void verifyItems(String itemNumber);
    public Boolean DispatchItems(String itemNumber);
    public void TemperatureBalance(String internalTemperature);
}

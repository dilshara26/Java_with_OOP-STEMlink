package Interfaces;

public interface PassengerAirplane{
    public boolean verifyPerson(String name, String travelId);
    public void welcomeMessage(String Destination);
    public boolean verifySafety(boolean engineerConfirmation, boolean pilotConfirmation);
    public void TemperatureBalance(String internalTemperature);
    public void crewStaffControls();

}

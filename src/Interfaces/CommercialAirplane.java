package Interfaces;

public class CommercialAirplane implements PassengerAirplane,CargoAirplane{
    @Override
    public boolean warnOverload() {
        return false;
    }

    @Override
    public void verifyItems(String itemNumber) {

    }

    @Override
    public Boolean DispatchItems(String itemNumber) {
        return null;
    }

    @Override
    public boolean verifyPerson(String name, String travelId) {
        return false;
    }

    @Override
    public void welcomeMessage(String Destination) {

    }

    @Override
    public boolean verifySafety(boolean engineerConfirmation, boolean pilotConfirmation) {
        return false;
    }

    @Override
    public void TemperatureBalance(String internalTemperature) {

    }

    @Override
    public void crewStaffControls() {

    }
}

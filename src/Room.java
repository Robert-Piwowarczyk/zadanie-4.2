public class Room {
    private int yardage;
    private int currentTemperature;
    private boolean airConditioner;

    public Room(int y, int c, boolean ac) {
        yardage = y;
        currentTemperature = c;
        airConditioner = ac;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getYardageRoom() {
        return yardage;
    }

    public boolean setDropTemperature() {
        currentTemperature = currentTemperature - 1;
        return true;
    }

    public boolean getAirConditioner() {
        return airConditioner;
    }

    public boolean setLimitDropTemperature() {
        if (currentTemperature < 16) {
            return false;

        } else {
            return true;
        }
    }

}
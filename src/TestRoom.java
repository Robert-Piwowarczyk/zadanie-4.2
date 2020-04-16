public class TestRoom {
    public static void main(String[] args) {
        Room room1 = new Room(25, 16, true);

        System.out.println("Powierzchnia pokoju:"
                + room1.getYardageRoom() + " metrów kwadratowych" + ";"
                + " Aktualna temperatura w pokoju: "
                + room1.getCurrentTemperature() + " stopni celcjusza");

        System.out.println("Temperatura w pokoju "
                + "obniżona o 1 stopień celcjusza:"
                + room1.setDropTemperature());
        System.out.println("Pokój posiada klimatyzator:"
                + room1.getAirConditioner());
        System.out.println("Osiągnięto temperaturę graniczną:"
                + room1.setLimitDropTemperature());
    }
}

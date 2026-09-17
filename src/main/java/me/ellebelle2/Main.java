package me.ellebelle2;

public class Main {
    public static void main(String[] args) {

        // Skapa ett kontor, lägg till minst fyra rum med olika kapacitet, boka ett par av dem,
        // och skriv ut en lista över vilka rum som är lediga respektive bokade.

        // skapa ett kontor
        Office office = new Office();

        // lägg till minst 4 rum med olika kapacitet
        office.addRoom(new Room("RumStörst", 40));
        office.addRoom(new Room("RumNästStörst", 30));
        office.addRoom(new Room("RumNästMinst", 20));
        office.addRoom(new Room("RumMinst", 10));

        Room room = office.findAvailableRoom(5);
        IO.println("Available Room: " + room.getRoomName());
        if (room.book())
            IO.println("Booking Successful");
        else
            IO.println("Booking Failed");



        // skriv ut bokade rum
        // om isBooked fältet i Room-klassen är bokad eller ej har koll på detta
        IO.println("Booked Rooms: ");
        var listOfBookedRooms = office.getBookedRooms();
        for (Room r : listOfBookedRooms) {
            IO.println(r.getRoomName());
        }


        // skriv ut lediga rum
        IO.println("Available Rooms: ");
        var listOfAvailableRooms = office.getAvailableRooms();
        for (Room r : listOfAvailableRooms) {
            IO.println(r.getRoomName());
        }


    }
}

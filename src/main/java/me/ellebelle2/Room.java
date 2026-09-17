package me.ellebelle2;

public class Room {
    private String roomName;
    private int capacity;
    private boolean isBooked;

    // Konstruktor som tar roomName och capacity och sätter isBooked till false:
    public Room(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.isBooked = false;
    }

    // Lägg till en copy construktor för Room och visa att en kopierad rumsbokning inte
    // påverkar orginalet om man boker kopian.


    public String getRoomName() {
        return roomName;
    }

    public int getCapacity() {
        return capacity;
    }


    // Metod book() som ändrar isBooked (med lämplig kontroll -
    // man kan inte boka ett redan bokat rum)

    public boolean book() {
        if (isBooked) {
            return false;
        }
        isBooked = true;
        return true;

    }


    public boolean isBooked() {
        return isBooked;
    }

    // Metod cancelBooking() som ändrar inBooked (med lämplig kontroll -
    // man kan inte boka ett redan bokat rum)

    public void cancelBooking() {
        isBooked = false;
    }
}

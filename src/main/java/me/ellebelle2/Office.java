package me.ellebelle2;

import java.util.ArrayList;

public class Office {

    // En klass som innehåller en Array eller ArrayList av Room-objekt.
    /*
    - ett static fält som håller koll på det totala antalet rum som skapats i hela systemet (över alla kontor)
    - en metod addRoom(Room r)
    - en metod findAvailableRoom(int minCapacity) som returnerar det första lediga rummet
      med tillräcklig kapacitet (eller null om inget finns)
    - fler metoder kan behövas för att lösa alla krav i punkt 3 (main)
     */

    // Room[] rooms = new Room[4];
    ArrayList<Room> rooms = new ArrayList<>();

        /*
    Ett annat alternativ,
        ArrayList<Room> rooms2;

        Konstruktor:
        public Office() {
            rooms2 = new ArrayList<>();
     */

    private static int totalRooms = 0;

    public void addRoom(Room room) {
        rooms.add(room);
        totalRooms++;
    }

    public ArrayList<Room> getBookedRooms() {
        // behöver en ny ArrayList där jag kan lagra bara de bokade rummen
        var bookedRooms = new ArrayList<Room>();
        for (Room r : rooms) {
            if (r.isBooked()) {
                bookedRooms.add(r);
            }
        }
        return bookedRooms;
    }

    public ArrayList<Room> getAvailableRooms() {
        // samma som ovan fast tvärtom
        var availableRooms = new ArrayList<Room>();
        for (Room r : rooms) {
            if (!r.isBooked()) {
                availableRooms.add(r);
            }
        }
        return availableRooms;
    }

    public Room findAvailableRoom(int minCapacity) {
        // gå igenom alla rum
        // for (int i = 0; i < rooms2.size(); i++) {
        //     Room room = rooms2.get(i);
        // }
        // eller använd foreach
        for (Room room : rooms) {
            if (room.getCapacity() < minCapacity && !room.isBooked()) {
                return room;
            }
        }
        return null;
    }


}

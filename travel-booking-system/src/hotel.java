public class hotel extends trip {

   int rooms = 0;

    public hotel(String destination, int rooms) {
        super(destination);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
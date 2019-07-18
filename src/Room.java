public class Room {
    private Wall wall;
    private Door door;
    private Floor floor;

    public Room(Wall wall, Door door, Floor floor) {
        this.wall = wall;
        this.door = door;
        this.floor = floor;
    }

    public void enterTheRoom(){
        door.openDoor();
    }

    public void paintTheRoomWalls(String color){
        wall.wasPainted(color);
    }

    public void checkForScratches(){
        floor.wasScratched();
    }
}

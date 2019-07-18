public class Main {

    public static void main(String[] args) {

//        POLYMORPHISM

//        CAR EXAMPLE

        Car car = new Car("rav4", 4, 16000);
        Escape escape = new Escape();
        CRV crv = new CRV();
        crv.accelerate(65);
        crv.brake(5);
//        car.accelerate(65);
//        car.brake(5);

//        for(int i=1; i<11; i++){
//            Movie movie = Polymorphism.randomMovie();
//            System.out.println("Movie #" + i +
//                    " : " + movie.getName() + "\n" +
//                    "Plot: " + movie.plot() + "\n");
//        }

//        ENCAPSULATION

//        CHALLENGE

//        Printer printer = new Printer(2, 50, true);
//
//        System.out.println(printer.getTonerLevel());
//        printer.setTonerLevel(50);
//        System.out.println(printer.getTonerLevel());
//
//        printer.fillUpToner(8);
//        System.out.println(printer.getTonerLevel());

//        GOOD WAY!!!
//        Player player = new Player("Daniel", 200, "Sword");
//        System.out.println("Initial health is " + player.getHealth());

//        BAD BAD WAY
//        Player player = new Player();
//        player.fullName = "Daniel";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 10;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        issues:
//        You have less control
//        We're not guaranteeing valid data (that's what a constructor does)
//        The subclass is difficult to change because you might easily break code in another class

//        COMPOSITION

//        HOUSE / ROOM CHALLENGE

//        Dimensions lrWallNDimensions = new Dimensions(10,9,1, 0);
//        Dimensions lrDoor1Dimensions = new Dimensions(2,6,1, 0);
//        Dimensions lrFloorDimensions = new Dimensions(10, 0, 1, 10);
//
//        Wall livingRoomWallNorth = new Wall(lrWallNDimensions, "White", 1);
//        Door livingRoomDoor1 = new Door(lrDoor1Dimensions, "Red",1,"modern");
//        Floor livingRoomFloor = new Floor(lrFloorDimensions, "wood", "mat");
//
//        Room livingRoom = new Room(livingRoomWallNorth, livingRoomDoor1, livingRoomFloor);
//        House house = new House(livingRoom);

//        while PUBLIC
//        System.out.println(house.getRoom().getWall().getColor());
//        house.getRoom().getWall().wasPainted("Pink");
//        System.out.println(house.getRoom().getWall().getColor());
//        house.getRoom().getDoor().openDoor();

//        switched room getters to private and created the following methods
//        house.getRoom().paintTheRoomWalls("Green");
//        house.getRoom().enterTheRoom();
//        house.getRoom().checkForScratches();
//        house.getRoom().paintTheRoomWalls("Black");

//        COMPUTER / PARTS EXAMPLE
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, monitor, motherBoard);
//        thePC.powerUp();
    }
}

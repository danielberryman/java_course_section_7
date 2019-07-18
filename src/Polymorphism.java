//class Movie {
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot() {
//        return "No plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//
//    public String plot() {
//        return "A shark east lots of people.";
//    }
//}
//
//class IndependenceDay extends Movie {
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over the planet.";
//    }
//}
//
//class MazeRunner extends Movie {
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//}
//
//public class Polymorphism {
//
//    public static Movie randomMovie() {
//        int randomNumber = (int) (Math.random() * 2) + 1;
//        System.out.println("Random number generated was: " + randomNumber);
//        switch (randomNumber){
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//        }
//    }
//}

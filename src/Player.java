public class Player {
    private String name;
    private int health = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health <=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
//            reduce number of lives
        }
    }

    public int getHealth() {
        return health;
    }

    //    BAD BAD WAY
//    public String fullName;
//    public int health;
//    public String weapon;
//
//    public void loseHealth(int damage){
//        this.health = this.health - damage;
//        if(this.health<=0){
//            System.out.println("Player knocked out");
////            reduce number of lives
//        }
//    }
//
//    public int healthRemaining(){
//        return this.health;
//    }
}

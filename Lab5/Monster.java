public class Monster {
    String NAME;
    String CLASS_TYPE;
    int x;

    public Monster(String name){
        this.NAME = name;
    }
    //mathod: attack()
    public int attack() {
        x = ((int)Math.random()*4 + 1);
        System.out.println( NAME + ", " + "of type " + this.getClass() + ", " + "attacks generically: " + x + " points damage caused");
        return x;
    }

    //mathod: move()
    public void move (int direction){
        switch (direction) {
            case 1:
                System.out.println(this.NAME + " is moving 1 step NORTH");
                break;
            case 2:
                System.out.println(this.NAME + " is moving 1 step EAST");
                break;
            case 3:
                System.out.println(this.NAME + " is moving 1 step SOUTH");
                break;
            case 4:
                System.out.println(this.NAME + " is moving 1 step WEST");
                break;
            default:
                break;
        }
    }
}

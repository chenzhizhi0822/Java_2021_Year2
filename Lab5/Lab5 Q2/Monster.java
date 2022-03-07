public abstract class Monster {
    String NAME;
    String CLASS_TYPE;
    int x;
    double conter;
    double spAttackProbability = 0.2;

    //Two constructors
    public Monster(String name){
        this.NAME = name;
    }

    public Monster(String name, double newspAttackProbability){
        this.NAME = name;
        this.spAttackProbability = newspAttackProbability;
    }

    public abstract int specialAttack();

    //mathod: attack()
    public int attack() {
        conter = Math.random();
        if (conter < spAttackProbability) {
            this.x = specialAttack();
            return this.x;
        } else {
            this.x = (int)(Math.random()*4 + 1);
            System.out.println( NAME + ", " + "of type " + this.getClass() + ", " + "attacks generically: " + this.x + " points damage caused");
            return this.x;
        }
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

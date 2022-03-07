public class Troll extends Monster {
    public Troll(String name){
        //子类的构造方法必须用super();调用父类构造方法
        super(name);
        if(super.NAME == "Saul" || super.NAME == "Salomon"){
            System.out.println("You have entered a wrong NAME for Troll");
            super.NAME = "Detritus";
        }
    }

    public int specialAttack(){
        int x = ((int)(Math.random()*14 + 1));
        System.out.println( this.NAME + ", " + "of type " + this.getClass() + ", " + "hit with a stick: " + x + " points damage caused");
        return x;
    }


    public void move(int direction){
        super.move(direction);
    }

}

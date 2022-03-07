public class Dragon extends Monster {
    //子类的构造方法必须用super();调用父类构造方法
    public Dragon(String name){
        super(name, 0.3);
    }
    public int specialAttack(){
        int x = ((int)(Math.random()*49 + 1));
        System.out.println( this.NAME + ", " + "of type " + this.getClass() + ", " + "attacks breathing fire: " + x + " points damage caused");
        return x;
    }


    public void move(int direction){
        super.move(direction);
    }
}


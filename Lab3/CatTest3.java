import java.awt.*;
import java.util.ArrayList;


public class CatTest3 {
    public static void main(String[] args) {
        /**
         * Using ArrayList 集合，适合不确定数量的对象，可以随加随减，而用数组只能重新定义
         */
        ArrayList<Cat> array = new ArrayList<Cat>();
        
        Cat cat1 = new Cat("cat1", "short", Color.BLACK, 100);
        Cat cat2 = new Cat("cat2", "long", Color.GRAY, 200);
        Cat cat3 = new Cat("cat3", "short", Color.WHITE, 300);
        Cat cat4 = new Cat("cat4", "long", Color.WHITE, 200);
        Cat cat5 = new Cat("cat5", "long", Color.BLACK, 500);
        
        array.add(cat1);
        array.add(cat2);
        array.add(cat3);
        array.add(cat4);
        array.add(cat5);

        for (int i = 0; i < array.size(); i++) { 
           Cat c = array.get(i); 
            System.out.println(c.getName() + "," + c.getSpeed() + "," + c.colour + "," + c.speed); 
        }

        System.out.println(array.get(4));
        System.out.println(array.size());
        array.remove(3);
        for (int i = 0; i < array.size(); i++) { 
            Cat c = array.get(i); 
             System.out.println(c.getName() + "," + c.getSpeed() + "," + c.colour + "," + c.speed); 
         }
    }
}

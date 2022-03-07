
public class CounterTest {
    public static void main(String[] args) {
        Counter mycount = new Counter();
        mycount.defaultConstructor();
        int gettercount,gettermax;
        gettercount = mycount.getCount();
        gettermax = mycount.getMax();
        System.out.println("The number of count is " + gettercount);
        System.out.println("The number of max is " + gettermax);
        //problem3
        mycount.setCount(1);
        mycount.setMax(9);
        gettercount = mycount.getCount();
        gettermax = mycount.getMax();
        System.out.println("The number of count is " + gettercount);
        System.out.println("The number of max is " + gettermax);
        //problem4
        mycount.increase();
        gettercount = mycount.getCount();
        System.out.println("The number of count is " + gettercount);

        mycount.decrease();
        gettercount = mycount.getCount();
        System.out.println("The number of count is " + gettercount);
        
        mycount.doubler();
        gettercount = mycount.getCount();
        System.out.println("The number of count is " + gettercount);
        
        mycount.reset();
        gettercount = mycount.getCount();
        System.out.println("The number of count is " + gettercount);
        //problem5
        System.out.println(mycount);
        //problem6
        mycount.decrease();
        System.out.println(mycount);
        mycount.setCount(8);
        mycount.increase();
        System.out.println(mycount);
        //problem7
        mycount.increase(3);
        System.out.println(mycount);
        mycount.decrease(2);
        System.out.println(mycount);
    }
}

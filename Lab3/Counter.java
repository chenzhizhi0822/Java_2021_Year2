
public class Counter {
    int count;
    int max;

    public void defaultConstructor() {
        count = 0;
        max = 10;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public void setCount(int n) {
        count = n;
    }

    public void setMax(int n) {
        max = n;
    }

    public void increase() {
        if (count >= 8) {
            count = 0;
            System.out.println("Counter Reset! Since count reaches the max");
        }
        else{
            count = count + 2;
        }
    }

    public void decrease() {
        if (count == 0) {
            System.out.println("Counter reaches 0, it will not decrease");
        }
        else{
            count = count - 1;
        }
    }

    public void doubler(){
        count = count * 2;
    }

    public void reset() {
        count = 0;
        System.out.println("Counter Reset!");
    }

    @Override
    public String toString() {
        return "The number of count is " + count + " The number of max is " + max;
    }

    public void increase(int n) {
        count = count + n;
    }

    public void decrease(int n) {
        count = count - n;
    }
}

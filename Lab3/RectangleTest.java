public class RectangleTest {
    public static void main(String[] args) {
        int r1, r2, z1;
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        r1 = rectangle1.areaCalculate(8, 6);
        r2 = rectangle2.areaCalculate(7, 7);
        z1 = rectangle1.zhouchangCalculate(5,5);
        System.out.println(r1 + " " + r2 + " " + z1);
    }
}

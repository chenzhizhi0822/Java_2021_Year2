public class Rectangle {
    int area, zhouchang;
    public int areaCalculate(int l ,int w){
        area = l * w;
        return area;
    }

    public int zhouchangCalculate(int l ,int w){
        zhouchang = (l + w)*2;
        return zhouchang;
    }
}

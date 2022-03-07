
public class Patterns {
    public void printPattern1(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void printPattern2(int n) {
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int loopnumber = Integer.parseInt(args[0]);

        Patterns pt = new Patterns();
        /**
         * 创建本类的实例对象
         * 通过该实例对象来在main静态方法中
         * 实现两个实例方法的调用
         */
        pt.printPattern1(loopnumber);
        pt.printPattern2(loopnumber);
    }
}

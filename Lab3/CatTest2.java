import java.awt.*;

public class CatTest2 {
    public static void main(String[] args) {
        Cat[] catarray = new Cat[6];//create catarray with 6 cat objects
        /**
         * using this loop to give each element in the array a value
         */
        for(int i=0;i<=5;i++){
            catarray[i] = new Cat();
        }
        catarray[0].speed = 100;
        catarray[0].name="rabbit1";
        catarray[0].furType="short";
        catarray[0].colour=Color.WHITE;

        catarray[1].speed = 200;
        catarray[1].name="rabbit2";
        catarray[1].furType="long";
        catarray[1].colour=Color.BLACK;

        catarray[2].speed = 300;
        catarray[2].name="rabbit3";
        catarray[2].furType="short";
        catarray[2].colour=Color.GRAY;

        catarray[3].speed = 400;
        catarray[3].name="rabbit4";
        catarray[3].furType="long";
        catarray[3].colour=Color.WHITE;

        catarray[4].speed = 500;
        catarray[4].name="rabbit5";
        catarray[4].furType="short";
        catarray[4].colour=Color.GRAY;

        catarray[5].speed = 600;
        catarray[5].name="rabbit6";
        catarray[5].furType="long";
        catarray[5].colour=Color.WHITE;
        /**
         * using this loop to output each objects
         */
        for(int i=0;i<=5;i++){
            System.out.println(catarray[i]);
        }
    }
}

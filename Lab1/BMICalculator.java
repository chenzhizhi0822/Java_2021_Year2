public class BMICalculator {
    public static void main(String[] args) {
        int height_cm = Integer.parseInt(args[0]);
        int weight = Integer.parseInt(args[1]);
        double height_m,BMI;
        height_m = height_cm/100.00;
        BMI = weight/(height_m*height_m);

        System.out.println("Your weight:" + weight + "Kg");
        System.out.println("Your height:" + height_m + "m");
        System.out.println("Your BMI:" + BMI);
        if (BMI < 18.5) {
            System.out.println("You are in the Underweight range.");
        } 
        else if(BMI >= 18.5 && BMI < 24.9){
            System.out.println("You are in the Normal range.");
        }
        else if(BMI >= 25 && BMI < 29.9){
            System.out.println("You are in the Overweight range.");
        }
        else if(BMI >= 30){
            System.out.println("You are in the Obese range.");
        }
    }
}

public class WeekDayConverter {
    public static void main(String[] args) {
        int weekDay = Integer.parseInt(args[0]);
       switch (weekDay) {
           case 1:
               System.out.println("The " + weekDay +"th day of the week is Monday");
               break;
           case 2:
               System.out.println("The " + weekDay +"th day of the week is Tuesday");
               break;
           case 3:
               System.out.println("The " + weekDay +"th day of the week is Wensday");
               break;
           case 4:
               System.out.println("The " + weekDay +"th day of the week is Thursay");
               break;
           case 5:
               System.out.println("The " + weekDay +"th day of the week is Friday");
               break;
           case 6:
               System.out.println("The " + weekDay +"th day of the week is Saturday");
               break;
           case 7:
               System.out.println("The " + weekDay +"th day of the week is Sunday");
               break;
           default:
               System.out.println("You have entered a wrong number!");
               break;
       }
    }
}

import java.awt.*;

public class Rabbit {
        private String name, tailType, furType;
        private Color color;
        private int speed;

    public String getFurType() { return furType;} 
    public void setFurType(String furType) { 
    // check to see that the furType is valid for rabbits
        if ((furType.equals("scaley") || (furType.equals("bald")) )){
        System.out.println("ERROR: Illegal fur type.");
        }
        else this.furType = furType;
        }
    public void sleep(int duration) {
    // code of sleep
    }
    public int run(int duration, boolean zigzag){
    // code of run
        return 0;
    }
    public String toString{
        return "I made a rabbit class" + getName();
    }
    

}

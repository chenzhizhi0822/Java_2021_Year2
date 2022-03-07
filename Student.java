public class Student extends Person {
    public Student() {System.out.print("student ");}

    public static void main(String[] args){
        new Student().go();
    }

    void go(){
        id = "x ";
        System.out.print(this.id + super.id);
    }
}

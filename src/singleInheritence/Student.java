package singleInheritence;

public class Student extends Person {
    double p = 80.78;
    void displayPercentage(){
        System.out.println("Percentage is :"+ p+"%");
    }
    void displayAll(){
        displayName();
        displayPercentage();

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.displayName();
        s.displayPercentage();
        s.displayAll();




    }





}

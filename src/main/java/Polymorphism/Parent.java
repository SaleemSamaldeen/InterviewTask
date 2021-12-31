package Polymorphism;

public class Parent {

    public int num = 100;

    public Parent() {
        System.out.println("Parent class constructor");
    }

    public void school() {
        System.out.println("school implemented in Parent class");
    }

    public void office() {
        System.out.println("office implemented in Parent class");
    }

    public void shopping(String username, int password) {
        System.out.println("shopping implemented in Parent class with 2 args");
    }

    public void shopping(String username, int password, String oneTimeCode) {
        System.out.println("shopping implemented in Parent class with 3 args");
    }

}

class Child extends Parent {
    int num = 150;

    public Child() {
        //System.out.println("Child class constructor"); //Call to super() must be first statement inside Constructor and this sysout throws compile error
        super();  //to call Super class constructor
        System.out.println("Child class constructor");
    }

    public void school() {
        System.out.println("school implemented in Child class: " + this.num);  //Calling child class variable using this keyword
    }

    public void office() {
        super.office(); //using super KW to call parent class method
        System.out.println("office implemented in Child class");
    }

    public void shopping(String uname, int password) {
        System.out.println("shopping implemented in Child class with 2 args");
    }

    public void shopping(String username, int password, String oneTimeCode) {
        System.out.println("shopping implemented in Child class with 3 args");
    }

    public void playing() {
        int value = super.num; //calling super class variable using super()
        System.out.println("playing implemented in Child class: " + value);
    }
}

class Inherited {
    public static void main(String[] params) {

        Parent par = new Child();  // Upcasting in java //A superclass reference refers to a subclass object.
        par.office();
        par.school();
        par.shopping("saleem", 5);
        //par.playing();   //we can't call method of child class because par object belongs to Parent class even though it referring Child
        //we can call common methods belongs to both classes

        Child ch = (Child) par;   // Downcasting in java //When subclass reference refers to super class object.
        ch.office();
        ch.school();
        ch.playing();

    }
}


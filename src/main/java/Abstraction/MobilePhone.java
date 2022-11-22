package Abstraction;

import org.apache.commons.lang3.StringUtils;

public abstract class MobilePhone {

    public abstract void screen();

    public abstract void charger();

    public abstract void powerButton();

    protected abstract void volumeButton();

    public void headPhones() {
        System.out.println("Headphones method inside abstract class MobilePhone");
    }
}

abstract class Dealer extends MobilePhone {  //abstract class can extend another abstract/non-abstract class
    // if all Parent abstract methods not implemented, Child should be declared as abstract class

    public void volumeButton() {
        System.out.println("VolumeButton implemented inside Dealer class");
        System.out.println(StringUtils.substringBetween("Hello Saleem, Welcome to Testing World", "Hello ", " World"));
        System.out.println(String.format("Welcome to Test%sWorld", "ing"));
        System.out.println(String.format("h%slo", "sa"));
    }

    @Override
    public void screen() {
        System.out.println("Screen method implemented inside Dealer class");
    }
}

class Customer extends Dealer {

    public Customer() {
        super();
    }

    @Override
    public void charger() {
        System.out.println("Charger implemented inside Customer class");
    }

    @Override
    public void powerButton() {
        System.out.println("PowerButton implemented inside Customer class");
    }

    @Override
    public void screen() {
        System.out.println("Screen method implemented inside Customer class");
    }
}

class Abstraction {

    static public void main(String[] params) {

        Customer cus = new Customer();
        {
            cus.charger();
            cus.headPhones();
            cus.powerButton();
            cus.screen();
            cus.volumeButton();
        }
    }

    //Singleton Pattern says that "A class must ensure that only single instance should be created and single object can be used by all other classes."
    /** Singleton example
     * Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
     * Private constructor: It will prevent to instantiate the Singleton class from outside the class.
     * Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.
     *
     * class Home{
     *       private static Home obj=new Home(); //Early, instance will be created at load time
     *
     *       private Home(){
     *
     *       }
     *
     *      public static Home getHome(){
     *        return obj;
     *      }
     *
     *     public void doSomething(){
     *       //write your code
     *     }
     * }
     */
}

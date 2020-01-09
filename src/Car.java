public class Car {
    //Fields
    public String color;
    private int doors;
    private String model;
    private int speed;
    public static int number = 0;

    //Constructor
    Car(String color, int doors, String model){
        System.out.println("Creating car object");
        this.color = color;
        this.doors = doors;
        this.model = model;
    }

    //Methods
    public void speedUp(){
        speed++;
    }
    public void setSpeed(int speed){
        if (speed < 0) {
            this.speed = 0;
        }
        else {
            this.speed = speed;
        }
    }
    public int setNumber(){

    }
    public int getSpeed(){
        return speed;
    }
    public String toString(){
        return model + " " + color;
    }

}

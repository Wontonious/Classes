public class Main {
    public static void main(String[] args) {
        int number = 10;
        String name = "Winston";
        Car car = new Car("blue",4,"toyota");
        Car car2 = new Car("green", 2,"honda");

        //Car color
        car.color = "blue";
        car2.color = "green";
        System.out.println(car.color);
        System.out.println(car2.color);

        //Car speed
        car2.setSpeed(20);
        int speedCar2 = car2.getSpeed()/5;
        System.out.println(speedCar2);

        System.out.println(car);
        System.out.println(car2);

        //Car id
    }
}

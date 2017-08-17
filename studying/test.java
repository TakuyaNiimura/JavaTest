import java.util.Scanner;
import java.util.Random;

class Test{
    public static void main(String[] args){
        Car c = new Car();
        c.suplly(10);
        c.move();
        c.move();

        SubCar s = new SubCar();
        s.suplly(20);
        s.move();
        s.sevePeople();
    }
}

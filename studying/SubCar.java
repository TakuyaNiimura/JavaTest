
public class SubCar extends Car{
    private int number = 119;

    public SubCar(){
        System.out.println("SubCarオブジェクトの生成");
    }

    public void sevePeople(){
        System.out.println("救急");
        System.out.println(number+"番");
    }
}
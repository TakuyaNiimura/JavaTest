import java.util.Scanner;
import java.util.Random;

public class Program3_18{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(45)-10;
        System.out.println("摂氏"+a+"度です");
        if(a>=30){
            System.out.println("真夏日です");
        }
        else if(a>=25&&a<30){
            System.out.println("夏です");
        }
        else if(a<0){
            System.out.println("真冬日です");
        }
    }
}

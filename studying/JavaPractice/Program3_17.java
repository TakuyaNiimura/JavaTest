import java.util.Scanner;
import java.util.Random;

public class Program3_17{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(100);
        System.out.println("乱数は"+a);
        if(a<50&&a%2==0){
            System.out.println("50以下の偶数です");
        }
        else if(a%2==0){
            System.out.println("偶数です");
        }
        else if(a<50){
            System.out.println("50以下です");
        }
    }
}

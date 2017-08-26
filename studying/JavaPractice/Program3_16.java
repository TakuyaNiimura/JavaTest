import java.util.Scanner;
import java.util.Random;

public class Program3_16{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(100);
        System.out.println("乱数は"+a);
        if(a%2==0&&a%3==0){
            System.out.println("2と3の公倍数です");
        }
        else if(a%2==0){
            System.out.println("2の倍数です");
        }
        else if(a%3==0){
            System.out.println("3の倍数です");
        }
    }
}

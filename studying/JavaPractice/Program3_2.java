import java.util.Scanner;
import java.util.Random;

public class Program3_2{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(10);
        System.out.println("乱数は"+a);
        if(a!=1) System.out.println("1ではありません。");
    }
}

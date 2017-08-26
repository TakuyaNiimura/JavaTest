import java.util.Scanner;
import java.util.Random;

public class Program4_1{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(10)+1;
        System.out.println("数は"+a);

        for(int i=0;i<a;i++){
            System.out.print("■");
        }
        System.out.println();

    }
}

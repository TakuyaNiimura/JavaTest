import java.util.Scanner;
import java.util.Random;

public class Program4_15{
    public static void main(String[] args){
        //乱数の呼び出し
        //Random rnd = new Random();
        //乱数のコンストラクタの使用
        //int a = rnd.nextInt(10)+1;
        for(int i=1;i<=100;i++){
            System.out.print(i);
            if(i%10==0){
                System.out.println();
            }
        }
    }
}

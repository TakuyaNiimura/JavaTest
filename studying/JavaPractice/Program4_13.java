import java.util.Scanner;
import java.util.Random;

public class Program4_13{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(10)+1;
        if(a>=5){
            for(int i=0;i<a;i++){
                System.out.print("★");
            }
            System.out.println();
        }
        else{
            System.out.println("発生した数は"+a);
        }
    }
}

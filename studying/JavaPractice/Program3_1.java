import java.util.Scanner;
import java.util.Random;

public class Program3_1{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a = rnd.nextInt(10);
        //System.out.println("a="+a);
        if(a>=5) System.out.println("５以上です。");
    }
}

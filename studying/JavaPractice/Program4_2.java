import java.util.Scanner;
import java.util.Random;

public class Program4_2{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a[] = new int[5];
        int max = 0;
        for(int i=0;i<5;i++){
            a[i] = rnd.nextInt(100)+1;
            System.out.println(a);
            if(max<a[i]){
                max = a[i];
            }
        }
    }
}

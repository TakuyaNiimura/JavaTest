import java.util.Scanner;
import java.util.Random;

public class Program4_12{
    public static void main(String[] args){
        //乱数の呼び出し
        Random rnd = new Random();
        //乱数のコンストラクタの使用
        int a[] = new int[5];
        int min = 0;
        for(int i=0;i<5;i++){
            a[i] = rnd.nextInt(100)+1;
            System.out.println(a[i]);
            if(i==0) min = a[i];
            else if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println("最大値は"+min);
    }
}

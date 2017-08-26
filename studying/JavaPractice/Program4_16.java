import java.util.Scanner;
import java.util.Random;

public class Program4_16{
    public static void main(String[] args){
        //乱数の呼び出し
        //Random rnd = new Random();
        //乱数のコンストラクタの使用
        //int a = rnd.nextInt(10)+1;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i<=j){
                    System.out.print("■");
                }
                else{
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }
}

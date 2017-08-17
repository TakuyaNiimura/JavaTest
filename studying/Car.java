

import java.util.Scanner;

public class Car{

    private int fuel = 0;
    private int migration = 0;
    //コンストラクタ
    public Car(){
        System.out.println("Carオブジェクト生成");
    }

    public void move(){
        if(fuel >= 0){
            migration++;
            fuel--;
        }

        System.out.println("移動距離"+migration);
        System.out.println("燃料"+fuel);
    }

    public void suplly(int fuel){
        if(fuel>0){
            this.fuel += fuel;
        }

        System.out.println("燃料"+fuel);
    }
}
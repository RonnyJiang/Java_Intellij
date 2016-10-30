package pub.lemon.functiondemo;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

/**
 * Created by Ronny on 2016/10/30.
 */
public class functiondemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sum(3,8);
        System.out.println("两个数的和为：" + x);
        System.out.println("请输入要比较的第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入要比较的第二个数：");
        int b = sc.nextInt();
        System.out.println("最大数为：" + getMax(a,b));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int getMax(int a,int b){
        return (a>b)?a:b;
    }
}

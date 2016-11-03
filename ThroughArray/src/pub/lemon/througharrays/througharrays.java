package pub.lemon.througharrays;

/**
 * 遍历二维数组的例子（有待改善），自己要我完成一个数组类，实现调用类方法遍历。
 * Created by Ronny on 2016/11/3.
 */
public class througharrays {
    public static void main(String [] agrs) {
        int[][] arr = {{1,2,3},{4,6},{7}};
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println("through arrays success!");
    }

}


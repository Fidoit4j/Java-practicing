package control;

/**
 * @Author: yangli16
 * @Description: 乘法表
 * @Date: 21:22 2019/10/18
 */
public class PrintMultiplicationTable {
    public static void main(String[] args) {
        printTable();
    }


    /**
     * @Author: yangli
     * @Description:打印9*9乘法表
     * @Date: 21:19 2019/10/18
     */
   static void printTable(){
        for (int i=1 ;i <= 9;i++){
            for (int j=1 ; j <= i; j++){
                System.out.print(j + "*" + i + " = " + (i * j));
                System.out.print(",");
            }
            System.out.println();
        }
    }
}

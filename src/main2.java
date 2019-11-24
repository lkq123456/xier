import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Shop a = new teashop();
        int n;
        while (true) {
            System.out.println("欢迎来到西二奶茶店进货1 买奶茶2 结束0"+"\n");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n == 2) {
                try {
                    a.sell();
                } catch (SoldOutException e) {
                    e.printStackTrace();
                }
            } else if (n == 0) break;
            else if (n == 1) {
                a.in();
            } else {
                try {
                    throw new SoldOutException("输入错误");
                } catch (SoldOutException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

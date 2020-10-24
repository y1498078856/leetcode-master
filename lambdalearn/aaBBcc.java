package learncode.lambdalearn;
import java.util.Scanner;
/**
 * @Author yangxin8@asiainfo.com
 * @Date 2020/10/10 13:23
 * @Version 1.0
 */
public class aaBBcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < line; i++) {
            System.out.println(scanner.nextLine().replaceAll("(.)\\1+","$1$1").replaceAll("(.)\\1(.)\\2","$1$1$2"));
        }
    }
}

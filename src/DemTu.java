import java.util.Scanner;
import java.util.StringTokenizer;

public class DemTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 sâu :");
        String a = sc.nextLine();
        StringTokenizer i = new StringTokenizer(a," " );
        int b = i.countTokens();
        System.out.println("số các từ trong sâu là: " + b);
    }
}

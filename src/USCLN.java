import java.util.Scanner;

public class USCLN {
    public static void main(String[] args) {
        int a, b;
        int temp = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a ");
        a = sc.nextInt();
        System.out.println("Nhap b ");
        b = sc.nextInt();
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i ==0 && b % i ==0){
                temp = i;
            }
        }
        System.out.println("USCLN la : " + temp);

    }
}

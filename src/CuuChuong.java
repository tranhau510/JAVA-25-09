import java.util.Scanner;

public class CuuChuong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n = ");
        n = sc.nextInt();
        boolean isChecked = true;
        while (isChecked){
            if (n <= 0 || n > 10){
                System.out.println("ko hop le, vui long nhap lai !!!");
                n = sc.nextInt();

            }
            else {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " * " + i + " = " + n * i);

                }
                isChecked = false;
            }
        }

    }

}

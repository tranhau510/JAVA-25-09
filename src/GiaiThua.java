import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập a = ");
        a = sc.nextInt();
        long b = 1;
        boolean isChecked = true;
        while (isChecked){
            if(a < 0 ){
                System.out.println("ko hop le , vui long nhap lai ");
                a = sc.nextInt();
            }else{
                for(int i = 1; i <= a; i++ ){
                    b = b * i;
                }
                System.out.println("giai thua cua " + a +"la :" + b);
                isChecked = false;
            }
        }

    }
}

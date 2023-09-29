import java.util.Scanner;

public class TimKiemMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tu can tim : ");
        int n = sc.nextInt();
        int[] phanTu = {5, 7, 6, 3, 1, 5, 4, 2, 0, 10};
        boolean isChecked = false;
        for (int i = 0; i < phanTu.length ; i++) {
            if(n == phanTu[i] ){
                System.out.println("tim thay gia tri " + phanTu[i] + " tai vi tri " + i);
                isChecked = true;
            }
                }
        if(!isChecked)
            System.out.println("ko tim thay " + n + "trong mang ");
            }
    }



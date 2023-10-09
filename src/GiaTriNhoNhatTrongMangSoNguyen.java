import java.util.Scanner;

public class GiaTriNhoNhatTrongMangSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu n =");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap vao mang cac so nguyen:");
        for(int i = 0; i < n; i++ ){
            System.out.println("phan tu thu " + (i + 1) + "la: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println( a[i]);
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Phan tu nho nhat cua mang la:" + min);
    }
}

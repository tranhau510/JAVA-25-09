import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,7,1,8,22,2,99,345,25,23,122,77654,244,1000};
       int maxValue = a[0];
        for(int temp : a){
            if(maxValue < temp){
                maxValue = temp;
            }
        }
        System.out.println("Gia tri lon nhat trong mang la: " + maxValue);
        }
    }


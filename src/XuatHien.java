import java.util.Scanner;

public class XuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int demChan = 0;
        int demLe = 0;
        for(int i = 1; i <= 20;i++){
            if(i % 2 == 0){
                demChan += 1;
            }else{
                demLe += 1;
            }
        }
        System.out.println("So la xuat hien chan la : " + demChan);
        System.out.println("So la xuat hien le la : " + demLe);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean isChecked = true;
        Scanner sc = new Scanner(System.in);
        arr.add(14);
        arr.add(2);
        arr.add(7);
        arr.add(1);
        arr.add(12);

        System.out.println("Menu");
        System.out.println("1. them phan tu");
        System.out.println("2. xoa phan tu");
        System.out.println("3. tim kiem phan tu");
        System.out.println("4.sua phan tu");
        System.out.println("5. sap xep mang");
        System.out.println("6. exit");

        while (isChecked) {

            int a = sc.nextInt();
            switch (a) {
                case 1:
                    addItem(arr);
                    showItem(arr);
                    System.out.println("moi ban tiep tuc chon");
                    break;
                case 2:
                    removeItem(arr);
                    showItem(arr);
                    System.out.println("moi ban tiep tuc chon");
                    break;
                case 3:
                    findItem(arr);
                    showItem(arr);
                    System.out.println("moi ban tiep tuc chon");
                    break;
                case 4:
                    setItem(arr);
                    showItem(arr);
                    System.out.println("moi ban tiep tuc chon");
                    break;
                case 5:
                    sortArray(arr);
                    showItem(arr);
                    System.out.println("moi ban tiep tuc chon");
                    break;
                case 6:
                    isChecked = false;


            }
        }


    }

    public static void addItem(ArrayList<Integer> a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tu can them");
        int item = sc.nextInt();
        a.add(item);
    }

    public static void showItem(ArrayList<Integer> a) {
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void removeItem(ArrayList<Integer> arr) {
        Scanner sc = new Scanner(System.in);
        boolean checkNotFound = false;
        System.out.println("nhap phan tu can xoa");
        int item = sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == item) {
                arr.remove(valueOf(arr.get(i)));
                checkNotFound = true;
            }
        }
        if (!checkNotFound) {
            System.out.println("khong tim thay gia tri can xoa");
        }
    }

    public static void sortArray(ArrayList<Integer> arr) {
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public static void findItem(ArrayList<Integer> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tu can tim: ");
        boolean checkNotFound = false;
        int item = sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == item) {
                System.out.println("tim thay phan tu " + arr.get(i));
                checkNotFound = true;
            }
        }
        if (!checkNotFound)
            System.out.println("ko tim thay phan tu ");
    }

    public static void setItem(ArrayList<Integer> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tu can sua: ");
        boolean checkNotFound = false;
        int Item = sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == Item) {
                System.out.println("sua phan tu: " + arr.get(i));
                checkNotFound = true;
            }
        }
        if (!checkNotFound) {
            System.out.println("khong tim thay phan tu can sua");
        }
    }
}

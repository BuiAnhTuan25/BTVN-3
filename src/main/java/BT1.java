import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang(1-12): ");
        int thang = sc.nextInt();

        while (thang < 1 || thang > 12) {
            System.out.print("Nhap lai thang(1-12): ");
            thang = sc.nextInt();
        }
        int soNgayCuaThang = 0;

        if (thang == 2) {
            System.out.print("Nhap nam(>=0): ");
            int nam = sc.nextInt();
            while (nam < 0) {
                System.out.print("Nhap lai nam(>=0): ");
                nam = sc.nextInt();
            }
            soNgayCuaThang = tinhSoNgayThang2(nam);
        } else {
            soNgayCuaThang = tinhSoNgay(thang);
        }

        System.out.println("So ngay cua thang " + thang + " la: " + soNgayCuaThang);

    }

    public static int tinhSoNgayThang2(int nam) {
        if (checkNam(nam))
            return 29;
        else return 28;
    }

    public static int tinhSoNgay(int thang) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public static boolean checkNam(int nam) {
        return ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0);
    }
}

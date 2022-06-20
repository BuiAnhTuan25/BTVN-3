import java.util.Scanner;

public class BT1_ENUM {
    enum Month {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);
        private final int day;

        Month(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten thang (VD:JANUARY): ");
        try{
            Month thangEnum = Month.valueOf(sc.nextLine());
            System.out.println("So ngay cua thang " + thangEnum + " (Enum) la: " + thangEnum.getDay());
        }
        catch(Exception e){
            System.out.println("Du lieu nhap vao khong phai la ten thang!");
        }

    }
}

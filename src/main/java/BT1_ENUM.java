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
            System.out.println("So ngay cua thang " + thangEnum + " (Enum) la: " + tinhSoNgayEnum(thangEnum));
        }
        catch(Exception e){
            System.out.println("Du lieu nhap vao khong phai la ten thang!");
        }

    }
    public static int tinhSoNgayEnum(Month thang) {
        switch (thang) {
            case JANUARY:
                return Month.JANUARY.getDay();
            case FEBRUARY:
                return Month.FEBRUARY.getDay();
            case MARCH:
                return Month.MARCH.getDay();
            case APRIL:
                return Month.APRIL.getDay();
            case MAY:
                return Month.MAY.getDay();
            case JUNE:
                return Month.JUNE.getDay();
            case JULY:
                return Month.JULY.getDay();
            case AUGUST:
                return Month.AUGUST.getDay();
            case SEPTEMBER:
                return Month.SEPTEMBER.getDay();
            case OCTOBER:
                return Month.OCTOBER.getDay();
            case NOVEMBER:
                return Month.NOVEMBER.getDay();
            case DECEMBER:
                return Month.DECEMBER.getDay();
            default:
                return 0;
        }
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BT2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Date dateOne=nhapNgay();;
        Date dateTwo=nhapNgay();

        while(dateOne.before(dateTwo)){
            System.out.println("Ngay 2 phai nho hon ngay 1!");
            dateTwo=nhapNgay();
        }
        System.out.println("Khoang cach giua 2 ngay la: "+(dateOne.getTime()-dateTwo.getTime())/ (24 * 60 * 60 * 1000)+" ngay");

    }
    public static Date nhapNgay(){
        System.out.print("Nhap ngay (dinh dang yyyy MM dd): ");
        String strignDate=sc.nextLine();
        strignDate=strignDate.replaceAll(" ","/");
        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        try {
            date = DateFor.parse(strignDate);
        } catch (Exception e) {
            System.out.println(e);
        }
        return date;
    }

}

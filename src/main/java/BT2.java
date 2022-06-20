import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Scanner;

public class BT2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate dateOne=nhapNgay();;
        LocalDate dateTwo=nhapNgay();

        while(dateOne.isBefore(dateTwo)){
            System.out.println("Ngay 2 phai nho hon ngay 1!");
            dateTwo=nhapNgay();
        }
        Period dateBetween=Period.between(dateTwo,dateOne);
        //System.out.println("Khoang cach giua 2 ngay la: "+(dateOne.getTime()-dateTwo.getTime())/ (24 * 60 * 60 * 1000)+" ngay");
        System.out.println("Khoang cach giua 2 ngay la: "+dateBetween.getYears()+" nam "+dateBetween.getMonths()+" thang "+dateBetween.getDays()+" ngay");

    }
    public static LocalDate nhapNgay(){
        System.out.print("Nhap ngay (dinh dang yyyy MM dd): ");
        String strignDate=sc.nextLine();
        strignDate=strignDate.replaceAll(" ","-");

        LocalDate localDate;
        localDate=LocalDate.parse(strignDate);

        //SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/MM/dd");
        //Date date=new Date();
//        try {
//
//            date = DateFor.parse(strignDate);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        return localDate;
    }

}

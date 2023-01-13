import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a data do feriado:");
        String date = sc.nextLine();
        Holydays holiday = new Holydays();
        holiday.getHolidayByDate(date);
        holiday.getAllHolidaysName();
    }
}

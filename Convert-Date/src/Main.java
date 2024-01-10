import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ShortDateToFullDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateInput = scanner.nextLine();

        LocalDate shortDate = LocalDate.parse(shortDateInput);

        int year = shortDate.getYear();
        int month = shortDate.getMonthValue();
        int day = shortDate.getDayOfMonth();

        String monthName = getMonthName(month);

        System.out.println("Full Date: " + monthName + " " + day + ", " + year);

        scanner.close();
    }
    private static String getMonthName(int month) {
        return LocalDate.of(1, month, 1).format(DateTimeFormatter.ofPattern("MMMM"));
    }
}

package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class Nam1 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which month that you want to count day: ");
        int month = sc.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = "28 or 29 Days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31 Day";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30 ";
                break;
            default:
                dayInMonth = "";
        }
        if (dayInMonth != "") {
            System.out.printf("The month %d has %s days", month, dayInMonth);
        } else {
            System.out.print("Invalid month");
        }
    }
}
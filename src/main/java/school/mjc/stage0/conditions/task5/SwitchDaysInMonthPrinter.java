package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month){
            case 12:
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
            case 11:
            case 4:
            case 6:
            case 9:
                System.out.println("30");
                break;
        }
    }
}

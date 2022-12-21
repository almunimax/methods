import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        printIsLeapYear(2020);
        printIsLeapYear(2022);
        printIsLeapYear(2025);

        System.out.println("Задание 2");
        printAppInfo(0, 2020);
        printAppInfo(1, 2022);
        printAppInfo(3, 2019);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        printCardDeliveryDays(deliveryDistance);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }


    private static void printAppInfo(int mobileOs, int mobileYear) {
        String osName = defileOsName(mobileOs);
        String osVersion = defineAppVersion(mobileYear);
        System.out.println("Для ОС " + osName + " установите " + osVersion + " версию.");
    }

    private static String defileOsName(int mobileOs) {
        if (mobileOs == 0) {
            return "ios";
        } else if (mobileOs == 1) {
            return "Android";
        } else {
            return "Неизвестная ОС";
        }
    }

        private static String defineAppVersion ( int mobileYear){
            int currentYear = LocalDate.now().getYear();

            if (currentYear != mobileYear) {
                return "lite";
            } else {
                return "обычную";
            }
        }

        private static int calcCardDeliveryDays(int distance) {
            int deliveryDays;
            if (distance <= 20) {
                deliveryDays = 1;
            } else if (distance <= 60) {
                deliveryDays = 2;
            } else if (distance <= 100) {
                deliveryDays = 3;
            } else {
                deliveryDays = 0;
            }
            return deliveryDays;
        }

        private static void printCardDeliveryDays(int distance){
        if (distance>100){
            System.out.println("Доставка не осуществляется");
        }
            System.out.println("Потребуется дней " + calcCardDeliveryDays(distance));


    }

}



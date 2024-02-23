public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void checkLeapYear(int yearCheck) {

        int everyFourYears = yearCheck % 4;
        int  everyHundredthYear = yearCheck % 100;
        int everyFourHundredthYear = yearCheck% 400;
        if (yearCheck>1584 && everyHundredthYear != 0 && everyFourYears ==0 || everyFourHundredthYear ==0 ) {
            System.out.println(yearCheck + " год является Високосным");
        } else {
            System.out.println(yearCheck + " год не является Високосным");
        }

    }

    public static void task1() {
        System.out.println("Задача №1");
        int year = 2017;
        checkLeapYear(year);
    }

    public static void checkClientDevice(int clientDeviceOS, int deviceYear) {
        if (clientDeviceOS == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceOS == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientDeviceOS == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientDeviceOS == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientDeviceOS != 1 && clientDeviceOS!=0) {
            System.out.println("Введите год выпуска вашего телефона и цифру 0, если у вас iOS. Если у вас Android, введите цифру 1.");
        }


    }



    public static void task2() {

        System.out.println("Задача №2");
        int clientOS = 1; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2015;
        checkClientDevice(clientOS,clientDeviceYear);

    }

    public static void checkNumberOfDays(int distanceDel) {
        int deliveryDay = 1;
        if (distanceDel > 100) {
            System.out.println("Нет доставки.");
            return;
        }
        if (distanceDel > 20) {
            deliveryDay++;
        }
        if (distanceDel > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: "+ deliveryDay);


    }



    public static void task3() {
        System.out.println("Задача №3");
        int deliveryDistance = 45;
        checkNumberOfDays(deliveryDistance);

    }


}
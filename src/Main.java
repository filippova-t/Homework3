public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        clientOS = 1;
        int clientDeviceYear = 2014;
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        //Задание 3
        int year = 1800;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        //Задание 4
        int deliveryDistance = 95;
        int deliveryPeriod = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryPeriod);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryPeriod + 1));
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется дней: " + (deliveryPeriod + 2));
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка не выполняется в ваш район");
        }



        //Заданиа 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц относится к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц относится к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц относится к сезону осень");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц относится к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


        //Задание 6
        int age = 19;
        int salary = 98_000;
        if (age >= 23) {
            if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 150 / 100 + " рублей");
            } else if (salary >= 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 120 / 100 + " рублей");
            } else if (salary < 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей");
            }
        } else if (age < 23) {
            if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 150 / 100 + " рублей");
            } else if (salary >= 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 120 / 100 + " рублей");
            } else if (salary < 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " рублей");
            }
        }

        //Задание 7
        age = 25;
        salary = 60_000;
        double wantedSum = 330_000;
        double maxPayment = salary * 50 / 100;
        if (age >= 30 && salary <= 80_000 && maxPayment > wantedSum * 0.1 / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * 0.1 / 12 + " рублей." + " Одобрено");
        } else if (age >= 30 && salary <= 80_000 && maxPayment < wantedSum * 0.1 / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + (wantedSum * 0.1) / 12 + " рублей." + " Отказано");
        } else if (age >= 30 && salary > 80_000 && maxPayment > wantedSum * (0.1 - 0.007) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 - 0.007)/ 12 + " рублей." + " Одобрено");
        } else if (age >= 30 && salary > 80_000 && maxPayment < wantedSum * (0.1 - 0.007) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 - 0.007)/ 12 + " рублей." + " Отказано");
        } else if (age < 30 && age >= 23 && salary <= 80_000 && maxPayment > wantedSum * (0.1 + 0.005) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.005) / 12 + " рублей." + " Одобрено");
        } else if (age < 30 && age >= 23 && salary <= 80_000 && maxPayment < wantedSum * (0.1 + 0.005) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.005) / 12 + " рублей." + " Отказано");
        } else if (age < 30 && age >= 23 && salary > 80_000 && maxPayment > wantedSum * (0.1 + 0.005 - 0.007) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.005 - 0.007) / 12 + " рублей." + " Одобрено");
        } else if (age < 30 && age >= 23 && salary > 80_000 && maxPayment < wantedSum * (0.1 + 0.005 - 0.007) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.005 - 0.007) / 12 + " рублей." + " Отказано");
        } else if (age < 23 && salary <= 80_000 && maxPayment > wantedSum * (0.1 + 0.01) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.01) / 12 + " рублей." + " Одобрено");
        } else if (age < 23 && salary <= 80_000 && maxPayment < wantedSum * (0.1 + 0.01) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.01) / 12 + " рублей." + " Отказано");
        } else if (age < 23 && salary > 80_000 && maxPayment > wantedSum * (0.1 + 0.01 - 0.007) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.01 - 0.007) / 12 + " рублей." + " Одобрено");
        } else if (age < 23 && salary > 80_000 && maxPayment  < wantedSum * (0.1 + 0.01 - 0.007) / 12) {
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж ");
            System.out.println("по кредиту " + wantedSum * (0.1 + 0.01 - 0.007) / 12 + " рублей." + " Отказано");
        }




    }
}
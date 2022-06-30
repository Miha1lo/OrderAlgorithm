package ua.ithiller.java;

public class OrderCar {

    public static void main(String[] args) {

        int yearLimit = 18;
        int creditMonth = 36;
        double creditPerMonth;

        ClientData buyer = new ClientData();
        buyer.name = "Jon Wick";
        buyer.old = 18;
        buyer.needCar = 1;
        buyer.money = 75_395;
        buyer.isCredit = true;

        CarData exclusiveCar = new CarData();
        exclusiveCar.name = "Ford gt mustang";
        exclusiveCar.price = 135_999;
        exclusiveCar.amountSalon = 3;

        if (buyer.old >= yearLimit) {
            if (exclusiveCar.amountSalon >= buyer.needCar) {
                if (buyer.money >= exclusiveCar.price) {
                    System.out.println("Уважаемый " + buyer.name + " поздравляем с покупкой "
                            + exclusiveCar.name + ". Получите Ваши ключи");
                } else if (buyer.isCredit) {
                    creditPerMonth = exclusiveCar.price / creditMonth;
                    System.out.println("Уважаемый " + buyer.name + " поздравляем с покупкой " +
                            exclusiveCar.name + " в кредит. Вами был оформлен кредит на " + creditMonth +
                            " месяцев. С ежемесячным платежём " + creditPerMonth + " $");
                } else {
                    System.out.println("Извените, у Вас недостаточно денег, приходите позже.");
                }
            } else {
                System.out.println("Извените, в данный момент в салоне нет необходимого Вам количестава машин");
            }
        } else {
            switch (yearLimit - buyer.old) {
                case 1 -> System.out.println("Извените, приходите через " + (yearLimit - buyer.old) + " год");
                case 2, 3, 4 -> System.out.println("Извените, приходите через " + (yearLimit - buyer.old) + " годa");
                default -> System.out.println("Извените, приходите через " + (yearLimit - buyer.old) + " лет");
            }
        }
    }
}

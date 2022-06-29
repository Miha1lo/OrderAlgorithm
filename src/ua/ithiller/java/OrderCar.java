package ua.ithiller.java;

public class OrderCar {

    public static void main(String[] args) {

        ClientData buyer = new ClientData();
        buyer.name = "Jon Wick";
        buyer.old = 35;
        buyer.money = 75_395;
        buyer.credit = true;

        CarData exclusiveCar = new CarData();
        exclusiveCar.name = "Ford gt mustang";
        exclusiveCar.price = 135_999;
        exclusiveCar.amount = 3;

        if (buyer.old >= 18) {
            if (buyer.money >= exclusiveCar.price) {
                System.out.println("Уважаемый " + buyer.name + " поздравляем с покупкой "
                        + exclusiveCar.name + ". Получите Ваш ключи");
            } else if (buyer.credit) {

            } else {

            }
        } else {

        }
    }
}

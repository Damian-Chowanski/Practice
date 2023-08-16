import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Item> listOfItems;

    public Shop() {
        listOfItems = new ArrayList<>();
    }


    public void addItems() {
        int qtyItems = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile przemiotów chcesz dodać do sklepu: ");
        qtyItems = sc.nextInt();
        while (qtyItems < 8) {
            System.out.println("Minimalna ilość musi być większa od 7\n" +
                    "Podaj ile przedmiotów chcesz dodać do sklepu: ");
            qtyItems = sc.nextInt();
        }
        System.out.print("");
        String name;
        double price;
        int quantity;
        for (int i = 0; i < qtyItems; i++) {
            System.out.println("Podaj nazwę produktu: ");
            name = sc.next();
            System.out.println("Podaj cenę produktu: ");
            price = sc.nextDouble();
            System.out.println("Podaj ilość produktu: ");
            quantity = sc.nextInt();
            listOfItems.add(new Item(name, price, quantity));
        }
        System.out.println("Produkty zostały dodane ");
    }

    public void priceSummary() {
        double sumOfProducts = 0.0;
        for (Item j : listOfItems) {
            sumOfProducts += j.getPrice()*j.getQuantity();
        }
        System.out.println("W twoim magazynie znajdują się produkty o wartości łącznej: " + sumOfProducts + " zł");
    }

    public void getQuantity() {
        int qtySummary = 0;
        for (Item j : listOfItems){
            qtySummary += j.getQuantity();
        }
        System.out.println("Łączna ilość produktów w twoim magazynie to: " + qtySummary);
    }
}

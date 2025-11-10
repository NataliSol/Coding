package HW17LL;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> productList = new LinkedList<String>();
        addNewProductFirst("Сир", productList);
        addNewProductFirst("яблука", productList);
        addNewProductFirst("хліб", productList);
        printAllProducts(productList);
        addProductByPosition(productList, 2, "second position");
        printAllProducts(productList);
        removeByName(productList,"яблука");
        printAllProducts(productList);
        buyProductAndDelete(productList);
    }

    public static void addNewProductFirst(String product, LinkedList<String> productList) {
        productList.addFirst(product);
        System.out.println("продукт додано");
    }

    public static void buyProductAndDelete(LinkedList<String> productList) {
        System.out.println("продукт" + productList.getFirst() + " був купленний");
        productList.removeFirst();
    }

    public static void printAllProducts(LinkedList<String> productList) {
        for (String product : productList) {
            System.out.println(product);
        }
    }

    public static void addProductByPosition(LinkedList<String> productList, int position, String name) {
        productList.add(position, name);
    }

    public static void removeByName(LinkedList<String> productList, String name) {
        productList.remove(name);
    }
}





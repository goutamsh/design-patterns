package com.gshepur.flyweight;

public class FlyweightDemoMain {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.placeOrder("Phone", "Mobile Phone", 1);
        inventorySystem.placeOrder("TV", "Television", 2);
        inventorySystem.placeOrder("Microwave", "Microwave", 3);
        inventorySystem.placeOrder("Phone", "Mobile Phone", 4);
        inventorySystem.placeOrder("TV", "Television", 5);
        inventorySystem.placeOrder("Microwave", "Microwave", 6);
        inventorySystem.placeOrder("Phone", "Mobile Phone", 7);
        inventorySystem.placeOrder("TV", "Television", 8);
        inventorySystem.placeOrder("Microwave", "Microwave", 9);
        inventorySystem.placeOrder("Phone", "Mobile Phone", 10);
        inventorySystem.placeOrder("TV", "Television", 11);
        inventorySystem.placeOrder("Microwave", "Microwave", 12);
        inventorySystem.placeOrder("Phone", "Mobile Phone", 13);
        inventorySystem.placeOrder("TV", "Television", 14);
        inventorySystem.placeOrder("Microwave", "Microwave", 15);

        inventorySystem.processOrders();

        System.out.println(inventorySystem.InventorySystemReport());
    }
}

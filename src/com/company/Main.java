package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner inputData = new Scanner(System.in);

    String productName;
    String productBrand;
    String productModel;
    String productReference;
    String productColor;
    double productPrice;

        System.out.println("Enter the price of the product: ");
        productPrice = Double.parseDouble(inputData.nextLine());

        System.out.println("Enter the name of the product: ");
        productName = inputData.nextLine();

        System.out.println("Enter the brand of the product: ");
        productBrand = inputData.nextLine();

        System.out.println("Enter the product model: ");
        productModel = inputData.nextLine();

        System.out.println("Enter the product reference: ");
        productReference = inputData.nextLine();

        System.out.println("Enter the product color: ");
        productColor = inputData.nextLine();

            Product monitorHp = new Product (productPrice,productName,productBrand,productModel,productReference,productColor);

                double price = monitorHp.getPrice();
                    System.out.println("The precious of the product ingression is: "+ price);
                String name = monitorHp.getName();
                    System.out.println("The name of the product ingression is:   "+ name);
                String brand = monitorHp.getBrand();
                    System.out.println("The brand of the product is: "+ brand);
                String model = monitorHp.getModel();
                    System.out.println("The model of the product is: "+ model);
                String reference = monitorHp.getReference();
                    System.out.println("The reference of the product is: "+ reference);
                String color = monitorHp.getColor();
                    System.out.println("The color of the product is: "+ color);
    }
    }

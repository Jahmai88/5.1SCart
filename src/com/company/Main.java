package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName+" wants to purchase "+quantity+" "+itemDesc;

        boolean outofstock;
      int stock = 1;
      if (stock > 1);
      {System.out.println("Plural");}

       if (stock < 1);
          {System.out.println(custName+ "Item is not here, you're total is, $45.02");
      }



        // Calculating total cost
        total = (price*quantity)*tax;
    }
}

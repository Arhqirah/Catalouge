package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public void mainMenu () {
        Catalogue catalogue = new Catalogue(10);

        //Create items and add to catalogue
        System.out.println(" ");
        Item item1 = new Item("Sport", "Skateboard");
        catalogue.addItem(item1);

        Item item2 = new Item("Sport", "Mountainbike");

        catalogue.addItem(item2);
        Item item3 = new Item("Tøj", "Smoking");
        catalogue.addItem(item3);

        Item item4 = new Item("Tøj", "Pailletkjole");
        catalogue.addItem(item4);


        // System.out.println(Arrays.toString(catalogue.getFullList()));
        ///////////////////////////////////////////////

        // Exercise Part 2: Make program with user input instead of hardcoded values
        // Make program able to show menu and handles user choices in loop
        // Ask user what user wants to do
        int choice = -1;

        while (choice != 0) {

            System.out.println("Hvad kunne du tænke dig?\n");
            System.out.println("1. Se hele kataloget");
            System.out.println("2. Se hvad der er ledigt");
            System.out.println("3. Opret ting til udlån");
            System.out.println("4. Lån ting");
            System.out.println("5. Aflever ting");
            System.out.println("0. Exit\n");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();


            // Read user choice

            // Decide what to do based on user choice

            if (choice == 1) { // get all items in cataloque
                Item[] allItems = catalogue.getFullList();
                for (int i = 0; i < allItems.length; i++) {
                    System.out.println(allItems[i]);

                }

            } else if (choice == 2) { // get available items in cataloque
                Item[] availableItems = catalogue.getAvailableItems();
                for (int i = 0; i < availableItems.length; i++) {
                    System.out.println(availableItems[i]);
                }
            } else if (choice == 3) { // Add new Item to catalogue
                // Hardcoded values for new Item
                Scanner sc = new Scanner(System.in);
                System.out.println("Vælg katogori ");
                String par1 = sc.nextLine();
                System.out.println("Vælg item");
                String par2 = sc.nextLine();
                catalogue.addItem(new Item(par1,par2));
                System.out.println(Arrays.toString(catalogue.getFullList()));
            } else if (choice == 4) { // make item unavailable
                // Hardcoded search criteria Skateboard
                Scanner sc = new Scanner(System.in);
                System.out.println("Hvad vil du gerne låne? ");
                String it1= sc.nextLine();
                Item found = catalogue.findItem(it1);
                System.out.println(found);
                catalogue.borrowItem(found);
                System.out.println(found);
            }


            else if (choice == 5) { // make item available again
                // Hardcoded search criteria Skateboard
                Scanner sc = new Scanner(System.in);
                System.out.println("\nHvad vil du gerne aflevere? ");
                String it1 = sc.nextLine();
                Item found = catalogue.findItem(it1);
                System.out.println(found);
                catalogue.returnItem(found);
                System.out.println(found);
            } else if (choice == 0) {
                System.out.println("Exiting programme");
                System.exit(0);
            }
            else { // invalid choice
                System.out.println("Du foretog et ugyldigt valg.");
            }

        }
    }
}

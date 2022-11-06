import java.sql.*;
import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Recipe Management App");
            System.out.println("1. Add a Recipe");
            System.out.println("2. View all Recipes");
            System.out.println("3. Search a Recipe");
            System.out.println("4. Update a Recipe");
            System.out.println("5. Delete a Recipe");
            System.out.println("6. Display total recipes in each category");
            System.out.println("7. View recipes in a specific category");
            System.out.println("8. Search a recipe using first letter");
            System.out.println("9. View recipes prepared by a specific person");
            System.out.println("10. Exit");

            System.out.println("Enter the choice: ");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add a Recipe");



                    break;

                case 2:
                    System.out.println("View all Recipes");


                    break;


                case 3:
                    System.out.println("Search a Recipe");


                    break;
                case 4:
                    System.out.println("Update a Recipe");


                    break;
                case 5:
                    System.out.println("Delete a Recipe");


                    break;


                case 6:
                    System.out.println("Display total recipes in each category");


                    break;

                case 7:
                    System.out.println("View recipes in a specific category");

                    break;
                case 8:
                    System.out.println("Search a recipe using first letter");


                    break;
                case 9:
                    System.out.println("View recipes prepared by a specific person");



                    break;
                case 10:
                    System.out.println("Exited Menu..");
                    System.exit(0);






            }

        }



    }
}

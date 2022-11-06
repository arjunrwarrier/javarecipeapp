import java.sql.*;
import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String recipeTitle, recipeDesc, recipePreparedBy, recipeIngredients, recipeCategory;
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

                    System.out.println("Enter the Recipe Name: ");
                    recipeTitle = input.next();
                    System.out.println("Enter the Recipe Description: ");
                    recipeDesc = input.next();
                    System.out.println("Recipe prepared by: ");
                    recipePreparedBy = input.next();
                    System.out.println("Ingredients : ");
                    recipeIngredients = input.next();
                    System.out.println("Recipe Category(veg/nonveg): ");
                    recipeCategory = input.next();


                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipedb", "root","");
                        String sql = "INSERT INTO `recipes`(`title`, `description`, `preparedby`, `ingredients`, `recipecategory`) VALUES (?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(1,recipeTitle);
                        stmt.setString(2,recipeDesc);
                        stmt.setString(3,recipePreparedBy);
                        stmt.setString(4,recipeIngredients);
                        stmt.setString(5,recipeCategory);
                        stmt.executeUpdate();
                        System.out.println("Recipe created...");


                    }
                    catch (Exception e){
                        System.out.println(e);
                    }





                    break;

                case 2:
                    System.out.println("View all Recipes");
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipedb","root","");
                        String sql ="SELECT `title`, `description`, `preparedby`, `ingredients`, `recipecategory` FROM `recipes`";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while(rs.next()){
                            String fetchRecipeName = rs.getString("title");
                            String fetchRecipeDesc = rs.getString("description");
                            String fetchRecipePreparedBy = rs.getString("preparedby");
                            String fetchRecipeIngredients = rs.getString("ingredients");
                            String fetchRecipeCategory = rs.getString("recipecategory");

                            System.out.println("Recipe Name: "+fetchRecipeName);
                            System.out.println("Description : "+fetchRecipeDesc);
                            System.out.println("Prepared By : "+fetchRecipePreparedBy);
                            System.out.println("Ingredients : "+fetchRecipeIngredients);
                            System.out.println("Category : "+fetchRecipeCategory+"\n");


                        }
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


                    break;


                case 3:
                    System.out.println("Search a Recipe");
                    System.out.println("Enter Recipe Name: ");
                    recipeTitle = input.next();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipedb", "root", "");
                        String sql = "SELECT `description`, `preparedby`, `ingredients`, `recipecategory` FROM `recipes` WHERE `title` ='"+recipeTitle+"'";


                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while(rs.next()){

                            String fetchRecipeDesc = rs.getString("description");
                            String fetchRecipePreparedBy = rs.getString("preparedby");
                            String fetchRecipeIngredients = rs.getString("ingredients");
                            String fetchRecipeCategory = rs.getString("recipecategory");


                            System.out.println("Description : "+fetchRecipeDesc);
                            System.out.println("Prepared By : "+fetchRecipePreparedBy);
                            System.out.println("Ingredients : "+fetchRecipeIngredients);
                            System.out.println("Category : "+fetchRecipeCategory+"\n");

                        }

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }


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

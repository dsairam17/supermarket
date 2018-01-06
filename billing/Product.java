/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author dsair
 */
public class Product {
    public void addItem(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product details: ");
        System.out.println("Product ID: ");
        int p_id = s.nextInt();
        System.out.println("Brand Name: ");
        String b_name = s.next();
        System.out.println("Type: ");
        String type = s.next();
        System.out.println("Price");
        float price = s.nextFloat();
        System.out.println("Quantity");
        int quantity = s.nextInt();
        System.out.println("Stock");
        int stock = s.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","sairam123");
            PreparedStatement stmt = con.prepareStatement("insert into product values(?, ?, ?, ?, ?, ?)");  
            stmt.setInt(1, p_id);
            stmt.setString(2, b_name);
            stmt.setString(3, type);
            stmt.setFloat(4, price);
            stmt.setInt(5, quantity);
            stmt.setInt(6, stock);
            stmt.executeUpdate();
            System.out.println("Item inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

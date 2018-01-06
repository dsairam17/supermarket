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
public class Bill {
    public void createBill(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Bill ID: ");
        int b_id = s.nextInt();
        System.out.print("Enter customer ID: ");
        int c_id = s.nextInt();
        System.out.print("Enter employee ID: ");
        int e_id = s.nextInt();
        
        while(true)
        {
            System.out.print("Enter the product ID: ");
            int p_id = s.nextInt();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "sairam123");
                PreparedStatement stmt = con.prepareStatement("Select * from product where p_id=?");
                stmt.setInt(1,p_id);
                ResultSet rs = stmt.executeQuery();
                System.out.println("Item Info:-");
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4) + " " + rs.getInt(5) + " " + rs.getInt(6));
                System.out.print("Y/N: ");
                char choice = s.next().charAt(0);
                if(choice=='Y'){
                    stmt = con.prepareStatement("insert into bill values(?, ?, ?)");  
                    stmt.setInt(1, b_id);
                    stmt.setInt(2, c_id);
                    stmt.setInt(3, e_id);
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}

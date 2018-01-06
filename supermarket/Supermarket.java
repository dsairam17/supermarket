/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author dsair
 */
import billing.*;
import java.util.Scanner;
public class Supermarket{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        loop: while(true)
        {
            System.out.println("1.Add new products");
            System.out.println("2.Delete existing products");
            System.out.println("3.Create Bill");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            int n = s.nextInt();
            switch(n)
            {
                case 1: 
                    Product p = new Product();
                    p.addItem();
                    break;
                case 2:
                    break;
                case 3:
                    Bill b = new Bill();
                    b.createBill();
                    break;
                case 4:
                    break loop;
            }
            
        }
    }
    
}

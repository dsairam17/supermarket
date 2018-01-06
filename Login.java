
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raghul
 */
public class Login
{
    int choice=0;
    String username,password;
    Employee employee = new Employee();
    Customer customer = new Customer();
    Login()
    {
        
        try{
		Scanner scanner=new Scanner(System.in);
                while(true)
                {
                    
                    System.out.println("\n1.Login\n2.Exit\nEnter choice");	
                    choice=scanner.nextInt();
                    
                    if(choice==1)
                    {
                        System.out.println("Enter the Username and Password");
                        username=scanner.next();
                        password=scanner.next();
                        
                        if(username.equals("root") && password.equals("123"))
                        {
                            
                            Admin admin = new Admin(username,password);                           
                        }
                        else if(customer.exist(username,password))
                        {
                            customer.operations(username,password);
                        }
                        else if(employee.exist(username,password))
                        {
                            employee.operations(username,password);
                        }
                        else
                        {
                            System.out.println("No record found");
                            
                        }
                    }
                    else if(choice==2)
                    {
                        break;
                    }
                }
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}

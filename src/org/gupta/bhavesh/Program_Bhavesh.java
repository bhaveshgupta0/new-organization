package org.gupta.bhavesh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Program_Bhavesh {

	public static void main(String[] args)
	{
		HashSet<Product_Bhavesh> hashSet_Bhavesh = new HashSet<>();
		
		try (Scanner sc = new Scanner(System.in))
		{
			
			int k = 0;
			int choice = 1;
			while(k==0)
			{
				System.out.println("\n1.Enter the product Details\n2.List the product details\n3.Exit");
				System.out.print("Enter your choice :");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:{
					
					System.out.println("enter the Product Category Id");
					int catId = sc.nextInt();
					System.out.println("Enter the product id ");

					int productId = sc.nextInt();

					System.out.println("enter the product name ");
					String productName = sc.next();
					
					System.out.println("enter the product Description ");
					String productDesc = sc.next();
					
					System.out.println("enter the product price ");
					float productPrice = sc.nextFloat();
					
					 Product_Bhavesh obj_Bhavesh=new  Product_Bhavesh( catId,  productId,  productName,  productDesc,  productPrice);
					 
					 hashSet_Bhavesh.add(obj_Bhavesh);
					 
					
					
					

					
				}
				break;
				case 2:
				{
					Iterator<Product_Bhavesh> obj_Bhavesh = hashSet_Bhavesh.iterator();
					  // Iterate the hash set
					   while (obj_Bhavesh.hasNext()) {
						  
					   System.out.println(obj_Bhavesh.next());
					   System.out.println("\n***************");
					   }
					  
				}
				break;
				
				case 3:
					k++;
					break;
				default: {
					System.out.println("invalid Choice");

				}
					break;
				
				
				}
			}
		}

	}

}

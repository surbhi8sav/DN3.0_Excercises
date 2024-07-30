import java .util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;
public class Product {
 int quantity, productId; 
 String productName;
 double price;
 Product(int productId, String productName,int quantity, double price)
 {
	 this.productId=productId;
	 this.productName=productName;
	 this.quantity=quantity;
	 this.price=price;
 }
// void add()
// {
//	 
//
// }
// void display()
// {
//	
// }
// void delete()
// {
//	 
// }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList <Product> ar = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);
    int q,pid;
    String pname;
    double price;
    while(true)
    {
    System.out.println("Do you want to 1:add 2:Update 3:delete a new product?");
    int choice=scanner.nextInt();
    if(choice == 1 || choice == 2 || choice == 3) {
    switch (choice)
    {
    case 1:while(true)
    {
        System.out.println("Do you want to add a new product? y/n:");
        char c = scanner.next().charAt(0);
        if(c=='y') {
       	 System.out.println("Enter productId, quantity, price,productName");
       	 
       	 pid= scanner.nextInt();
       	 q=scanner.nextInt();
       	 price=scanner.nextDouble();
       	 scanner.nextLine();
       	 pname=scanner.nextLine();
       	 ar.add(new Product(pid,pname,q,price));
//       	 System.out.println("Do you want to add a new product? y/n:");
//            c = scanner.next().charAt(0);
            
        }
        else if(c=='n')
        {
       	 break;
        
       	 
       	 
        }
       }
    	   break;
    case 2: 
    	while(true)
        {System.out.println("Do you want to update a product? y/n:");
    char c = scanner.next().charAt(0);
    if(c=='y') {
//    	System.out.println("Enter index");
//    	int i=scanner.nextInt();
    	System.out.println("Enter old productId");
    	int prid=scanner.nextInt();
    	System.out.println("Enter new productId, quantity, price,productName");
      	 
      	 pid= scanner.nextInt();
      	 q=scanner.nextInt();
      	 price=scanner.nextDouble();
      	 scanner.nextLine();
      	 pname=scanner.nextLine();
      	int i = 0;

      for(Product pr : ar) {
          if(prid==(pr.productId))
             break;
          i++;
      }
      //
      //return -1;
    	 ar.set(i,new Product(pid,pname,q,price));
//   	 System.out.println("Enter productId");
//   	 
//   	 pid= scanner.nextInt();
//   	 int i=ar.indexOf();
//   	 
        
    }
    else if(c=='n')
    {
   	 break;
    
   	 
   	 
    }
   }
	   break;
    case 3:while(true)
    {System.out.println("Do you want to delete a product? y/n:");
char c = scanner.next().charAt(0);
if(c=='y') {
System.out.println("Enter ProductID");
int prid=scanner.nextInt();
	int i = 0;

    for(Product pr : ar) {
        if(prid==(pr.productId))
           break;
        i++;
    }
	ar.remove(i);
//	 System.out.println("Enter productId");
//	 
//	 pid= scanner.nextInt();
//	 int i=ar.indexOf();
//	 
    
}
else if(c=='n')
{
	 break;

	 
	 
}
}
   break;
    default:	System.out.println("Invalid Input");
               
    }
    }
    else {System.out.println("Invalid Input");
    	break;
    }
    }
    for(int i=0;i<ar.size();i++)
    {   System.out.println("Product" + i);
    	System.out.println(ar.get(i).productId);
    	System.out.println(ar.get(i).productName);
    	System.out.println(ar.get(i).quantity);
    	System.out.println(ar.get(i).price);
	}

}
}
//int pos = 0;

//for(MyObj myObj : list) {
//    if(name.equalsIgnoreCase(myObj.name))
//        return pos;
//    pos++;
//}
//
//return -1;

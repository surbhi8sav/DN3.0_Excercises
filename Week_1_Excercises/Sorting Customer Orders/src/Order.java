import java.util.Scanner;

public class Order {
	 String customerName;
	 int orderId;
	 double totalPrice;
	 Order(int orderId, String customerName,double totalPrice)
	 {
		 this.orderId=orderId;
		 this.customerName=customerName;
	     this.totalPrice=totalPrice;
	 }
	 static void bubble_sort(Order[] or)
	 {   Order temp;
		 boolean isSwapped;
		 for(int i=0; i<or.length-1;i++)
		 {   
			 isSwapped=false;
			 for(int j=0;j<or.length-1-i;j++)
			 { if(or[j].totalPrice>or[j+1].totalPrice)
			 {
				temp=or[j+1];
				or[j+1]=or[j];
				or[j]=temp;
				isSwapped=true;
			 }
			 if(isSwapped==false)
				 break;
				 
			 }
		 }
	 }
	 static void quick_sort(Order[] or ,int low,int high)
	 
	 {
		 if(low <high)
		 {
			 int p=partition(or,low,high);
			 quick_sort(or,low,p-1);
			 quick_sort(or,p+1,high);
		 }
	 }
	 static int partition(Order[] or, int low,int high)
	 {
		 double pivot=or[high].totalPrice;
		 int i=low;
		 int j=low;
		 while(i<=high)
		 {
			 if(or[i].totalPrice <= pivot)
			 {
				 Order temp=or[i];
				 or[i]=or[j];
				 or[j]=temp;
				 j++;
				 
			 }
			 i++;
			 
		 }
		 return j-1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int n= scanner.nextInt();
		Order[] or = new Order[n];
	    int oid;
	    String cname;
	    double tp;
		for(int i=0;i<n;i++)
	    {
	        System.out.println("Do you want to add a new order? y/n:");
	        char c = scanner.next().charAt(0);
	        if(c=='y') {
	       	 System.out.println("Enter OrderId, Customer Name,Total price");
	       	 
	       	 oid= scanner.nextInt();
	       	 scanner.nextLine();
	       	 cname=scanner.nextLine();
	       	 //scanner.nextLine();
	       	 tp=scanner.nextDouble();
	       //	scanner.nextLine();
	       	// System.out.println("YOU");
	       	 Order o=new Order(oid,cname,tp);
	       	 or[i]=o;
//	       	 System.out.println("Do you want to add a new product? y/n:");
//	            c = scanner.next().charAt(0);
	            
	        }
	        else if(c=='n')
	        {
	       	 break;
	        
	       	 
	       	 
	        }
	       }
		//bubble_sort(or);
		quick_sort(or,0,or.length-1);
		for(int i=0;i<or.length;i++) 
	    {  // System.out.println("Order" + i);
	    	System.out.print(or[i].orderId +" ");
	    	System.out.print(or[i].customerName+" ");
	    	System.out.println(or[i].totalPrice);
//	    	System.out.println(ar.get(i).productName);
//	    	System.out.println(ar.get(i).quantity);
//	    	System.out.println(ar.get(i).price);
		}

//		System.out.println(ar)
	}

}

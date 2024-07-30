import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
 int employeeId;
 String name, position;
 double salary;
 Employee(int employeeId, String name,String position,double salary)
 {
	 this.employeeId=employeeId;
	 this.name=name;
	 this.position=position;
	 this.salary=salary;
 }
 static int binary_search(Employee[] ar, int l,int h, int eid)
 {
	 Arrays.sort(ar, new Comparator<Employee>() {
            @Override
            public int compare(Employee p1, Employee p2) {
            	return Integer.compare(p1.employeeId, p2.employeeId);
            }
        });
	 int mid;
	 while(l<=h)
	 {
		 mid=(l+h)/2;
		 if(ar[mid].employeeId == eid)
		 {
			 return mid;
		 }
		 else if(eid < ar[mid].employeeId)
		 {
			 return binary_search(ar,l,mid-1,eid);
		 }
		 else {
			 return binary_search(ar,mid+1,h,eid);
		 }
	 }
	 return -1;
	 
 }
 static void traverse(Employee[] er)
 {
	 for(int i=0;i<er.length;i++) 
		    {   System.out.println("Order" + i);
		    	System.out.print(er[i].employeeId +" ");
		    	System.out.print(er[i].name+" ");
		    	System.out.print(er[i].position+" ");
		    	System.out.println(er[i].salary);
 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter array size");
		int n= scanner.nextInt();
		Employee[] ar = new Employee[n];
	    int eid;
	    String name,pos;
	    double salary;
		for(int i=0;i<n;i++)
	    {
	        System.out.println("Do you want to add a new Employee? y/n:");
	        char c = scanner.next().charAt(0);
	        if(c=='y') {
	       	 System.out.println("Enter employeeId, name, position, salary");
	       	 
	       	 eid= scanner.nextInt();
	       	 scanner.nextLine();
	       	 name=scanner.nextLine();
	       	 //scanner.nextLine();
	       	 pos=scanner.nextLine();
	       	 salary=scanner.nextDouble();
	       //	scanner.nextLine();
	       	// System.out.println("YOU");
	       	 Employee p=new Employee(eid,name,pos,salary);
	       	 ar[i]=p;
//	       	 System.out.println("Do you want to add a new product? y/n:");
//	            c = scanner.next().charAt(0);
	            
	        }
	        else if(c=='n')
	        {
	       	 break;
	        
	       	 
	       	 
	        }
	       }
//		quick_sort(ar,0,ar.length-1);
//		for(int i=0;i<ar.length;i++) 
//	    {  // System.out.println("Order" + i);
//	    	System.out.print(or[i].orderId +" ");
//	    	System.out.print(or[i].customerName+" ");
//	    	System.out.println(or[i].totalPrice);
	}

}

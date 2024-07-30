import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Book {
	int bookId; 
	 String title, author;
	 Book(int bookId, String title,String author)
	 {
		 this.bookId=bookId;
		 this.title=title;
		 this.author=author;
	 }
	 static int linear_search(Book[] ar, String tit)
	 {
		 for(int i=0;i< ar.length;i++)
		 {
			 if(tit==ar[i].title)
			 {
				 return i;
				
			 }
			 
		 }
		 return -1;
	 }
	 static int binary_search(Book[] ar, int l,int h, String tit)
	 {
		 Arrays.sort(ar, new Comparator<Book>() {
	            @Override
	            public int compare(Book p1, Book p2) {
	                return p1.title.compareTo(p2.title);
	            }
	        });
	      
		 int mid;
		 while(l<=h)
		 {
			 mid=(l+h)/2;
			 if(ar[mid].title.compareTo(tit)==0)
			 {
				 return mid;
			 }
			 else if((tit.compareTo(ar[mid].title)) < 0)
			 {
				 return binary_search(ar,l,mid-1,tit);
			 }
			 else {
				 return binary_search(ar,mid+1,h,tit);
			 }
		 }
		 return -1;
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter array size");
		int n= scanner.nextInt();
		Book[] ar = new Book[n];
	    int bid;
	    String tit,auth;
		for(int i=0;i<n;i++)
	    {
	        System.out.println("Do you want to add a new book? y/n:");
	        char c = scanner.next().charAt(0);
	        if(c=='y') {
	       	 System.out.println("Enter bookId, title, Author");
	       	 
	       	 bid= scanner.nextInt();
	       	 scanner.nextLine();
	       	 tit=scanner.nextLine();
	       	 //scanner.nextLine();
	       	 auth=scanner.nextLine();
	       //	scanner.nextLine();
	       	// System.out.println("YOU");
	       	 Book p=new Book(bid,tit,auth);
	       	 ar[i]=p;
//	       	 System.out.println("Do you want to add a new product? y/n:");
//	            c = scanner.next().charAt(0);
	            
	        }
	        else if(c=='n')
	        {
	       	 break;
	        
	       	 
	       	 
	        }
	       }
		System.out.println("Enter title to be searched");
		scanner.nextLine();
		String title= scanner.nextLine();
		int l=linear_search(ar,title);
		System.out.println("Linear search result"+l);
		int b=binary_search(ar,0,ar.length,title);
		System.out.println("Binary search result"+b);
	}

}

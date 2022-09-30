
public class prime_num {
	public static void main(String args[])
	{
		int a=1,b=150,i,j;
		System.out.println("Prime Numbers between 1 to 150 are:- ");
		for(i=a; i<=b; i++)
		 {
		     for(j=2; j<=i ; j++)
		     {
		          if(i%j==0)
		          {
		              break;
		          }
		     }
		     if(i==j)
	         {
		          System.out.println(j);
	         }
	    }
	}
}

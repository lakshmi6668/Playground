import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      for(int num=1;num<=2*n;num=num+1)
      {
        if(count%2==1)
        {
      System.out.println(count);
        }
        count=count+1;
      }
	}
}
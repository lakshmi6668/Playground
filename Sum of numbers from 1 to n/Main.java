import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int count=1;
      for(int num=1;num<=n;num=num+1)
      {
      sum=sum+count;
        count=count+1;
      }
        System.out.println(sum);
      }
	}

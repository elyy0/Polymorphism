package Method_Overloading;
import java.util.*;
public class method_overloading {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		method_overloading obj=new method_overloading();
		obj.Greater();
		obj.Greater(5, 6, 8);
		obj.Greater(10, 0);
	}
	public void Greater(int n1,int n2)
	{
		if(n1>n2)
		{
			System.out.println("Number "+n1+" is greater");
		}
		else
		{
			System.out.println("Number "+n2+" is greater");
		}
	}
	public void Greater(int n1,int n2,int n3)
	{
		if(n1>n2 && n1>n3)
		{
			System.out.println("Number "+n1+" is greater");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Number "+n2+" is greater");
		}
		else
		{
			System.out.println("Number "+n3+" is greater");
		}
	}
	public void Greater()
	{
		int i,grt,size;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		System.out.println("Enter "+size+" numbers: ");
		int[] num=new int[size];
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		grt=num[0];
		for(i=0;i<num.length;i++)
		{
			if(grt<num[i])
			{
				grt=num[i];
			}
		}
		System.out.println("The greater no is ="+grt);
	}
}

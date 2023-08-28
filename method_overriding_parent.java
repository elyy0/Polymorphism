package Method_Overriding;
public class method_overriding_parent 
{
    public void swapWithThirdVariable(int a,int b) 
    {
        System.out.println("Using third variable:");
        System.out.println("Before swapping: a="+a+",b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+",b="+b);
    }
    public void swapWithoutThirdVariable(int a,int b)
    {
        System.out.println("Without using third variable:");
        System.out.println("Before swapping: a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+",b="+b);
    }
}

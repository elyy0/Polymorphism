package Method_Overriding;
public class method_overriding_child extends method_overriding_parent 
{
	public static void main(String[] args)
	{
		method_overriding_child obj=new method_overriding_child();
		obj.swapWithThirdVariable(44, 66);
		obj.swapWithoutThirdVariable(44, 22);
	}
	@Override
    public void swapWithoutThirdVariable(int a,int b)
	{
        System.out.println("Overridden method:- Without using third variable");
        System.out.println("Before swapping: a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+",b="+b);
    }

}

class overload
{
void test()
{
System.out.println("no parameters");
}
void test(int a)
{
System.out.println("one parameter");
System.out.println("value a:"+a);
}
void test(int a,int b)
{
System.out.println("two ineger parameters");
System.out.println("a and b:"+a+""+b);
}
void test(double a)
{
System.out.println("one dobuble parameter:");
System.out.println("double a:"+a);
}
}
class Main
{
public static void main(String args[])
{
overload obj=new overload();
obj.test();
obj.test(10);
obj.test(10.20);
obj.test(129.8);
}
}

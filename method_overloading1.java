class overload1
{
    void test()
    {
        System.out.println("no parameters");
    }
    void test(int a)
    {
        System.out.println("one integer parameter");
        System.out.println("a:"+a);
    }
    void test(int a,int b)
    {
        System.out.println("two integer parameter");
        System.out.println("a and b:"+a+" and "+b);
    }
    void test(int a,int b,int c)
    {
        System.out.println("three integer parameters");
        System.out.println("values of a,b,c:"+a+","+b+","+c);
    }
    void test(double a)
    {
        System.out.println("one double parameter:");
        System.out.println("double a:"+a);
    }
}
class Main
{
    public static void main(String args[])
    {
        overload1 obj=new overload1();
        obj.test();
        obj.test(10);
        obj.test(10,20);
        obj.test(10,20,30);
        obj.test(120.9);
    }
}

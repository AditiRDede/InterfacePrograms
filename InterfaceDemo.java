interface Product
{
    int no=11;
    public void fun();
    public void  gun();
}
class Base implements Product
{
    int no=21;

    public void fun()
    {
        System.out.println("Inside Base class:: fun()");
    }

    public void gun()
    {
        System.out.println("Inside Base class:: gun()");
    }

}
class InterfaceDemo 
{
    public static void main(String [] args)
    {
        Product pobj=new Base();
        Base bobj =new Base();
        System.out.println("Inside main...");
        pobj.fun();
        pobj.gun();
        System.out.println("final field of interface ::"+pobj.no);
        System.out.println("final field of interface ::"+Product.no);
        System.out.println("data field of Base ::"+bobj.no);
    }
}
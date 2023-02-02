interface Parent
{
    int no=11;
    public void fun();
}
interface Child extends Parent
{
    int no=21;
    public void fun();
    public void gun();

    //Java 8 onwards
    public static void run()
    {
        System.out.println("Inside CHild interface method :: run ()");
    }

    //Java 8 onwards
    public default void sun()
    {
        System.out.println("Inside CHild interface method :: sun ()");
    }

}
class InterfaceDemo2 implements Child, Parent
{
    public static void main(String [] args)
    {
        System.out.println("Inside main ...");
        Child cobj=new InterfaceDemo2();    //upcasting
        Parent pobj=new InterfaceDemo2();   //upcasting

        InterfaceDemo2 dobj=new InterfaceDemo2();

        cobj.fun();
        cobj.gun();

        System.out.println("Value of no From CHild interface:: "+cobj.no);
        System.out.println("Value of no From Parent interface:: "+pobj.no);

        //Cant access directly dobj.no :: causes error as both interfaces hve same name variable
        //System.out.println("Value of no inherited in InterfaceDemo2 class from Child :: "+Child.no);

        System.out.println("Value of no inherited in InterfaceDemo2 class from Child :: "+Child.no);
        System.out.println("Value of no inherited in InterfaceDemo2 class from Parent :: "+Parent.no);

     

        Child.run();
        cobj.sun();
        dobj.sun();
        

        
    }
    public void fun()
    {
        System.out.println("Inside fun()..."); 
    }
    public void gun()
    {
        System.out.println("Inside gun()..."); 
    }
}
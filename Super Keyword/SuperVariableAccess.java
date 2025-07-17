

class Parent
{
    int i=10;
}
class SuperVariableAccess extends Parent
{
    int i=20;
    void show(int i)
    {
        System.out.println("Parameter i: " + i);       // print 30
        System.out.println("Current class i: " + this.i);  // print 20
        System.out.println("Parent class i: " + super.i);   // print 10
    }
    public static void main(String [] args)
    {
        SuperVariableAccess s=new SuperVariableAccess();
        s.show(30);
    }
}

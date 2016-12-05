abstract class Demo
{
    abstract void show();
}

class Outer
{
    int num = 4;
    void method()
    {
    new Demo()
    {
        void show()
        {
            System.out.print("................"+num);
        }
    }.show();
    }
}
class Demo1
{
    public static void main(String[] args)
    {   
        new Outer().method();
    }
}
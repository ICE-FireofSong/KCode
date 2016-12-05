class Outer
{   int num = 3;
    class Inner
    {
        int num = 4;
        void show()
        {
            int num = 5;
            System.out.print(Outer.this.num);
            System.out.print(Inner.this.num);
            System.out.print(num);
        }
    }   
        void show ()
        {
            System.out.print(num);
        }
}

class InnerDemo
{
    public static void main (String [] args)
    {
         System.out.print(new Outer().new Inner().num);
    }
}
interface  A
{
    public void show ();
}

interface Z
{
    public int add(int a,int b);
}

class Q
{
    public void method()
    {}
}

    

interface CC
{
    void show();
}

interface MM
{
    void method();
}

interface QQ extends CC,MM
{
     void function();                               //接口之间能进行多继承。    
}

class WW implements QQ
{
    public void show(){}
    public void method(){}
    public void function(){}
}

class implementsDemo
{
    public static void main(String [] args)
    {}
}
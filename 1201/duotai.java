abstract class Animal
{
    abstract void eat ();
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("�й�ͷ");
    }
     void lookHome()
    {
        System.out.println("����");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("����");
    }
     void catchMouse()
    {
        System.out.println("ץ����");
    }
}
class duotai
{
    public static void main(String[] args)
    {
        method(new Dog());
    }
    public static void method (Animal a)
    {
        a.eat();
        if (a instanceof Cat)
        {
            Cat c = (Cat)a;
            c.catchMouse();
        }
        if (a instanceof Dog)
        {
            Dog c = (Dog)a;
            c.lookHome();        
        }   
    }
}
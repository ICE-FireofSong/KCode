abstract class Animal
{
    abstract void eat ();
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("啃骨头");
    }
     void lookHome()
    {
        System.out.println("看家");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("吃鱼");
    }
     void catchMouse()
    {
        System.out.println("抓老鼠");
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
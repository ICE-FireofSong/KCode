/* 为了扩展笔记本的躬耕，但日后出现什么功能设备不知道。
定义一个规则，只要日后出现的设备都符合这个规则就可以了。
规则在java中就是接口。*/

interface USB
{
    public void open();
    public void close();
}

class BookPC
{
    public static void main (String[] args)
    {

    }
    public static void useUSB(USB u)
    {
        u.open();
        u.close();
    }
}


class UPan implements USB
{
    public void open()
    {
        System.out.println("upan open")
    }
     public void close()
    {
        System.out.println("upan close")
    }
}
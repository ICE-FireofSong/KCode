/* Ϊ����չ�ʼǱ��Ĺ��������պ����ʲô�����豸��֪����
����һ������ֻҪ�պ���ֵ��豸�������������Ϳ����ˡ�
������java�о��ǽӿڡ�*/

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
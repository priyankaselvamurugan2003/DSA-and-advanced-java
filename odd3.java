public class odd3{
    public static void main(String args[])
    {
        System.out.println(isodd(5));
    }
    public static int isodd(int num1)
    {
        if(num1%2!=0)
        {
            return 2;
        }
        return 1;
    }
}
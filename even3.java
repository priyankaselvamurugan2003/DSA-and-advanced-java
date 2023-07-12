public class even3{
    public static void main(String args[])
    {
        System.out.println(isEven(5));
    }
    public static int isEven(int num1)
    {
        if(num1%2==0)
        {
            return 2;
        }
        return 1;
    }
}
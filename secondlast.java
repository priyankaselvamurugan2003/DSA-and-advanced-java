public class secondlast{
    public static void main(String args[]){
        System.out.println(lastdigit(1));
    }
    public static int lastdigit(int a)
    {
        a = Math.abs(a);
        if(a/10!=0)
        {
        a =(a/10)%10;
        return a;
        }
        return -1;
        
    }
    
}
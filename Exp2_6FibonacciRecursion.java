class Exp2_6FibonacciRecursion
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);

        int ft=0,st=1,lt=0;

        int fact = Fibonacci(n,ft,st,lt);

        System.out.println("your term of fibinacci series is: "+fact);
    }

    public static int Fibonacci(int n,int ft,int st,int lt)
    {
        lt=ft+st;
        ft=st;
        st=lt;

        if(n==0)
            return lt;
        else
            n--;
            return (ft+st);
    }
}
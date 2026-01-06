class SuperSubCatch
{
    public static void main()
    {
        try
        {
            int a=0;
            int b=42/a;

        }

        catch(Exception e)
        {
            System.out.println("Generic exception catch");
        }

        catch(ArithmeticException e)
        {
            System.out.println("never reached");
        }
    }
}
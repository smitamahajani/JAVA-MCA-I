interface Bicycle
{
    //All the properties are final.
   public  int a=45;
    void applybrake();
    void accelearte();
}



class Priority implements Bicycle
{
    //public  int a=5;
    public void applybrake()
    {
        System.out.println("Break is applied");
    }

    public void accelearte()
    {
        System.out.println("speed up");
    }
}

class interfaceDemo
{
   public static void main(String args[]) 
   {
    Priority p1= new Priority();
    p1.applybrake();
    System.out.println(p1.a);
    //Modification is not allowed
    p1.a=234;
    System.out.println(p1.a);



   }
}
interface parentinterface
{
    void meth1();
    void meth2();
}

interface childinterface extends parentinterface
{
    void meth3();
    void meth4();
}

class mysampleclass implements childinterface
{
    public void meth1()
    {
       System.err.println("In Meth1"); 
    }

    public void meth2()
    {
       System.err.println("In Meth2"); 
    }

    public void meth3()
    {
       System.err.println("In Meth3"); 
    }

    public void meth4()
    {
       System.err.println("In Meth4"); 
    }
}


class interfaceDemo3 
{
    public static void main(String args[])
    {
        mysampleclass msc = new mysampleclass();
   
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();


    }

    
}
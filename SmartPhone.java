class CellPhone
{
 void CallNumber()
 {
    System.out.println("Calling");
 }
 
}
interface GPS
{
 void location();
    
}

interface Camera
{
void takesnap();
void recordvideo();
}
interface MediaPlayer
{
 void PlayMusic();
}

class samsung extends CellPhone implements GPS , Camera , MediaPlayer
{
    public void location()
        {
            System.out.println("Inside location");
        }

    public void takesnap()
        {
            System.out.println("Inside takesnap");
        }
    public void recordvideo()
        {
            System.out.println("Inside record video");
        }

        public void PlayMusic()
        {
            System.out.println("Inside PlayMusic");
        }


}
class SmartPhone 
{
    public static void main(String args[])
    {

        //General 
        samsung s= new samsung();
        s.CallNumber();
        s.PlayMusic();
        s.takesnap();
        s.recordvideo();
        s.location();

        //Specifically
        // Camera c= new samsung();
        // c.takesnap(); //It is allowed because takesnap method is from camera interface
        // c.PlayMusic(); //It is not allowed 
       
    }
}
public class ThreadJava2 extends Thread{

    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try
            {
                Thread.sleep(2000);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println("Thread 2");
        }
    }

}

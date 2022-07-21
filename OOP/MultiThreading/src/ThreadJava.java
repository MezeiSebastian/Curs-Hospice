import java.util.ArrayList;

public class ThreadJava extends Thread {

    ArrayList<String> a1 = new ArrayList<>();
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try
            {
                Thread.sleep(-2000);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
            print();
        }
    }

    public static void print(){
        System.out.println("Thread");
    }

    public static void main(String args[])
    {
        ThreadJava thread1=new ThreadJava();
        ThreadJava2 thread2=new ThreadJava2();
        thread1.start();
        thread2.start();
    }
}


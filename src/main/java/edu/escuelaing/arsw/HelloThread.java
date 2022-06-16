package edu.escuelaing.arsw;

/**
 * Hello world!
 *
 */
public class HelloThread extends Thread
{
    public void run(){
        System.out.println("Hello from a thread: " );
    }
    public static void main( String[] args )
    {
        System.out.println("Hello from main: " + Thread.currentThread());
        Thread t = new Thread(new HelloThread());
        t.start();
    }
}

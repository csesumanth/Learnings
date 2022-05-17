package hackerrank.morganStanley;

class A implements Runnable{
    @Override
    public void run() {
        ThreadWaitNotify.obj.notify();
    }
}
public class ThreadWaitNotify implements Runnable{

    public static ThreadWaitNotify obj;
    private int data;
    public ThreadWaitNotify(){
        data = 10;
    }

    @Override
    public void run() {
        obj = new ThreadWaitNotify();
        try {
            obj.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj.data += 20;
        System.out.println(obj.data);
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new ThreadWaitNotify());
        Thread t2 = new Thread(new A());
        t1.start();
        t2.start();
        System.out.println("test - ");
    }
}

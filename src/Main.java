public class Main {

    public static void main(String [] args) throws Exception{
    MyThread myThread = new MyThread();
    myThread.start();
        System.out.println(Thread.currentThread().getName());


    }

}
    class MyThread extends Thread{
    @Override
     public void run(){
        for (int i = 0 ; i < 300; i++){

            System.out.println("thread is  thread -"+ Thread.currentThread().getName()+" i =" + i);
        }
    }


    }
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("group");

        MyThread myThread1 = new MyThread(threadGroup, "1");
        MyThread myThread2 = new MyThread(threadGroup, "2");
        MyThread myThread3 = new MyThread(threadGroup, "3");
        MyThread myThread4 = new MyThread(threadGroup, "4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(15000);

        threadGroup.interrupt();
    }
}

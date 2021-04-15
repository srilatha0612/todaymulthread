public class Myrunn implements Runnable {
    @Override
    public void run() {
        System.out.println("run method");
    }
}
class MyDemo{
    public static void main(String[] args) {
        Myrunn m=new Myrunn();
        Thread t=new Thread(m);
        t.start();
        System.out.println("main method");
    }
}


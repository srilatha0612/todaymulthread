public class Yiel extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            Thread.yield();
            System.out.println("child thread");
        }
    }
}
class ThreadDe{
    public static void main(String[] args) {
        Yiel y=new Yiel();
        y.start();
        for (int i=0;i<5;i++){
            System.out.println("main method");
        }
    }
}
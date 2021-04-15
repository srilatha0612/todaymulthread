public class Sle extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
        System.out.println("first");
    }
    try{
        Thread.sleep(3000);
    }
    catch(InterruptedException e){
        System.out.println("second");
    }
}
}
class Threa{
    public static void main(String[] args) {
        Sle s=new Sle();
        s.start();
        s.interrupt();
        System.out.println("main thread");
    }
}


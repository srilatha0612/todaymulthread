public class MyOvrRid extends Thread {
    public void start(){
        System.out.println("first method");
    }
   public void run(){
       System.out.println("second method");
    }
}
class Th{
    public static void main(String[] args) {
        MyOvrRid m=new MyOvrRid();
        m.start();
        System.out.println("mainmethod");
    }
}


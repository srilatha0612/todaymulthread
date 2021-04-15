public class MyOvrLoad extends Thread {
    public void run(){
        System.out.println("run method");
    }
    void run(int i){
        System.out.println("child method");
    }
}
class De{
    public static void main(String[] args) {
        MyOvrLoad o=new MyOvrLoad();
        o.start();
        System.out.println("main method");
    }
}
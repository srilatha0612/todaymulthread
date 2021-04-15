public class MyExtend extends Thread {
    public void run(){
        System.out.println("run method");
    }
}
class Demo1{
    public static void main(String[] args) {
        MyExtend m=new MyExtend();
        m.start();

        System.out.println("main method");
    }
}
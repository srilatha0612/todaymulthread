public class Joi extends Thread {
    public void run(){
        System.out.println("parent thread");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){

        }
    }
}
class Demo{
    public static void main(String[] args) {
        Joi j=new Joi();
        j.start();
        System.out.println("child thread");
    }
}

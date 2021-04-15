public class GetSet {
    public static void main(String[] args) {
        Thread.currentThread().setName("adc");
        System.out.println(Thread.currentThread().getName());
    }
}

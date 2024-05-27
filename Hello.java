package Java_Course;

public class Hello {
    public static void main(String [] args) {
        Runnable runnable1 = () -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Marach");
                try{
                    Thread.sleep(10);
                } catch(Exception e){}
            }
        };

        Runnable runnable2 = () -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Emmanuel");
                try{
                    Thread.sleep(10);
                } catch(Exception e){}
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}

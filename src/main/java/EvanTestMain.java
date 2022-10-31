public class EvanTestMain {

    public static void main(String[] args) {
        while(true) {
            for(int i = 0; i < 10000; i++) {
                System.out.println("Hello! " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

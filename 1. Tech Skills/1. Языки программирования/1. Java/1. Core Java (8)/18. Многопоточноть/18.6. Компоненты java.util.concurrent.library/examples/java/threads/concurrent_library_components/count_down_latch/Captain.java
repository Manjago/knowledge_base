package threads.concurrent_library_components.count_down_latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Captain implements Runnable {
    private final CountDownLatch countDownLatch;

    public Captain(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Captain: placing mark");
            System.out.println("Captain: placing banner");
            System.out.println("Captain: buffing");
            System.out.println("Captain: starting oath breakers");
            TimeUnit.MILLISECONDS.sleep(100);
            countDownLatch.countDown();
            System.out.println("Captain: I've finished!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

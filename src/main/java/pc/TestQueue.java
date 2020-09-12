package pc;

import java.util.concurrent.*;

public class TestQueue {
    public static void main(String[] args) {
        BlockingQueue<GoodsQueue> queue = new ArrayBlockingQueue(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);
        Thread t1 = new Thread(producerQueue);
        Thread t2 = new Thread(consumerQueue);
        t1.start();
        t2.start();




    }
}

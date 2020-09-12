package pc;

import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable {
    private BlockingQueue<GoodsQueue> blockingQueue;

    public ConsumerQueue(BlockingQueue<GoodsQueue> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0;i <10; i++) {
            try {
                GoodsQueue take = blockingQueue.take();
                System.out.println("消费者消费的商品：" + take.getBrand() + "====" + take.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

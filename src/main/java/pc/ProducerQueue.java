package pc;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {
    private BlockingQueue<GoodsQueue> blockingQueue;

    public ProducerQueue(BlockingQueue<GoodsQueue> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            GoodsQueue goods = new GoodsQueue();
            if(i % 2==0) {
            goods.setBrand("哇哈哈");
            goods.setName("矿泉水");

            } else {
                goods.setBrand("旺仔");
                goods.setName("小馒头");
            }
            System.out.println("生产者开始生产商品：" +goods.getBrand() + "----" + goods.getName());
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

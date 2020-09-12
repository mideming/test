package pc;

import lombok.Data;

@Data
public class Goods {
    private String brand;
    private String name;
    private boolean flag = false;
    //消费者获取商品
    public synchronized void get () {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了" + this.getBrand() + "----" + this.getName());
        flag = false;
        notify();
    }
    //生产者生产
    public synchronized void set (String brand, String name) {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "----" + this.getName());
        this.flag = true;
        notify();
    }
}

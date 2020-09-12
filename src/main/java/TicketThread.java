
public class TicketThread implements Runnable {
    volatile int ticket = 5;

    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket-- + "张票");
        }
    }

    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();
        Thread t1 = new Thread(ticketThread);
        Thread t2 = new Thread(ticketThread);
        Thread t3 = new Thread(ticketThread);
        Thread t4 = new Thread(ticketThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

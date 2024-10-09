package bandeau;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BandeauVerrouillable extends Bandeau implements Runnable {
    @Override
    public void run() {
        
    }

    private Lock lock = new ReentrantLock();

    public void lock(){
        lock.lock();
    }

    public void unlock(){
        lock.unlock();
    }
}

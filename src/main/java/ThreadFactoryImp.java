import java.util.concurrent.ThreadFactory;

/**
 * @author jizg
 * @version 1.0.0
 * @Description ThreadFactoryImp.java
 * @createTime 2020年03月04日 16:54:00
 */
public class ThreadFactoryImp implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r,"ThreadFactoryImp.newThread");
        System.out.println("create a new Thread:ThreadFactoryImpl.newThread");
        return thread;
    }
}

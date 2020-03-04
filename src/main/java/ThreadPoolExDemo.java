import java.util.concurrent.*;

/**
 * @author jizg
 * @version 1.0.0
 * @Description ThreadPoolExDemo.java
 * 用于进行java 多线程、线程池的方法测试。
 *
 * @createTime 2020年03月04日 15:26:00
 */
public class ThreadPoolExDemo {


    public static void main(String[] args){

        //核心线程池线程数量
        int corePoolSize = 2;
        //线程池最大线程数
        int maxPoolSize = 5;
        //非核心线程执行完Task后有效（等待新Task）时间，时间单位为秒
        int keepAliveTime = 3;
        //任务队列，ArrayBlockingQueue
        ArrayBlockingQueue workQueue = new ArrayBlockingQueue(5);
        //线程工厂
        ThreadFactoryImp threadFactory = new ThreadFactoryImp();
        //被拒绝执行的任务处理
        RejectedExecutionHandlerImp handler = new RejectedExecutionHandlerImp();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (corePoolSize,maxPoolSize,keepAliveTime,TimeUnit.SECONDS,
                        workQueue,threadFactory,handler);

        TaskRunnable task = new TaskRunnable();

        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(task);
            System.out.println("当前有效的线程数:"+threadPoolExecutor.getActiveCount()+
                    "    当前WorkQueue的Task个数："+threadPoolExecutor.getQueue().size());
        }
        threadPoolExecutor.shutdown();
        System.out.println(threadPoolExecutor.getActiveCount());
    }
}

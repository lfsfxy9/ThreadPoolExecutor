import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author jizg
 * /@version 1.0.0
 * @Description RejectedExecutionHandlerImp.java
 * @createTime 2020年03月04日 17:05:00
 */
public class RejectedExecutionHandlerImp implements RejectedExecutionHandler {

    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        //TODO
        System.out.println("ThreatorPoolExcutor已经无法正常处理线程任务,当前已完成任务数："+executor.getCompletedTaskCount()+
                "   ,任务队列总数："+executor.getQueue().size());
    }
}

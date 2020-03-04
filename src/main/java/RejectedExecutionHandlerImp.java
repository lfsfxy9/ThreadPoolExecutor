import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author jizg
 * @version 1.0.0
 * @Description RejectedExecutionHandlerImp.java
 * @createTime 2020年03月04日 17:05:00
 */
public class RejectedExecutionHandlerImp implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        //TODO
        System.out.println("RejectedExecutionHandlerImp.rejectedExecution");
    }
}

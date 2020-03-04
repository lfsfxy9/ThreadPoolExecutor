/**
 * @author jizg
 * @version 1.0.0
 * @Description TaskRunnable.java
 * @createTime 2020年03月04日 16:56:00
 */
public class TaskRunnable implements  Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); //毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前Task被执行");
    }


}

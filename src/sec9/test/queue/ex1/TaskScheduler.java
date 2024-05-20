package sec9.test.queue.ex1;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

//    private int remainingTasks = 0;
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task){
        tasks.offer(task);
//        remainingTasks++;
    }

    public void processNextTask(){
        Task task = tasks.poll();
        if (task != null){
            task.execute();
        }
//        remainingTasks--;
    }

    public int getRemainingTasks() {
        return tasks.size();
    }
}

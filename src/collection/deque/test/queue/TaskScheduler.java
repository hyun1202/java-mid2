package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class TaskScheduler {
    Queue<Task> task = new ArrayDeque<>();

    public void addTask(Task task) {
        this.task.offer(task);
    }

    public int getRemainingTasks() {
        return task.size();
    }

    public void processNextTask() {
        Task task = this.task.poll();
        if (task != null) {
            task.execute();
        }
    }
}

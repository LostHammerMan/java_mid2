package sec9.test.queue.ex1;

public class BackupTask implements Task{
    @Override
    public void execute() {
        System.out.println("자료 백업....");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import dao.TaskDAO;
import model.Task;

import java.sql.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TaskDAO dao = new TaskDAO();

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Mark Complete\n4. Delete Task\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                Task t = new Task();
                System.out.print("Title: ");
                t.setTitle(sc.nextLine());
                System.out.print("Description: ");
                t.setDescription(sc.nextLine());
                System.out.print("Due Date (yyyy-mm-dd): ");
                t.setDueDate(Date.valueOf(sc.nextLine()));
                dao.addTask(t);
                System.out.println("Task added!");
            } else if (choice == 2) {
                List<Task> tasks = dao.getAllTasks();
                for (Task t : tasks) {
                    System.out.println(t.getId() + ". " + t.getTitle() + " [" + t.getStatus() + "]");
                }
            } else if (choice == 3) {
                System.out.print("Enter Task ID to mark complete: ");
                dao.markAsCompleted(sc.nextInt());
            } else if (choice == 4) {
                System.out.print("Enter Task ID to delete: ");
                dao.deleteTask(sc.nextInt());
            } else {
                break;
            }
        }
    }
}

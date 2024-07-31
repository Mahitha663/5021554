class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        this.head = null;
    }

    // Add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by taskId
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse the list of tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by taskId
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && !current.task.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task task1 = new Task("1", "Design", "In Progress");
        Task task2 = new Task("2", "Development", "Not Started");
        Task task3 = new Task("3", "Testing", "Completed");

        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for task with ID 2:");
        System.out.println(tms.searchTask("2"));

        System.out.println("\nDeleting task with ID 2:");
        tms.deleteTask("2");

        System.out.println("\nAll Tasks after deletion:");
        tms.traverseTasks();
    }
}


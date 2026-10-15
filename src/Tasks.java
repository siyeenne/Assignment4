import java.util.Scanner;

class TimeManger  {

    private String task1;
    private Integer minutes1;
    private Boolean completed1;

    public TimeManger(String task, Integer minutes) {
        this.task1 = task1;
        this.minutes1 = minutes1;
        this.completed1 = false;

        this.task2 = task2;
        this.minutes2 = minutes2;
        this.completed2 = false;

        this.task3 = task3;
        this.minutes3= minutes3;
        this.completed3 = false;

        this.task4 = task4;
        this.minutes4 = minutes4;
        this.completed4 = false;

        this.task5 = task5;
        this.minutes5 = minutes5;
        this.completed5 = false;

    }

    public String getTaskName() {
        return task1;
    }

    public Integer getMinutes() {
        return minutes1;
    }

    public Boolean getCompleted() {
        return completed1;
    }

    public void setMinutes(Integer minutes) {
        this.minutes1 = minutes;
    }

    public void setCompleted(Boolean completed) {
        this.completed1 = completed;
    }

    private String task2;
    private Integer minutes2;
    private Boolean completed2;


    public String task2() {
        return task2;
    }

    public Integer getminutes2() {
        return minutes2;
    }

    public Boolean getcompleted2() {
        return completed2;
    }

    public void setMinutes2(Integer minutes) {
        this.minutes2 = minutes;
    }

    public void setCompleted2(Boolean completed) {
        this.completed2 = completed;
    }

    private String task3;
    private Integer minutes3;
    private Boolean completed3;

    public String getTask3() {
        return task3;
    }

    public Integer getMinutes3() {
        return minutes3;
    }

    public Boolean getCompleted3() {
        return completed3;
    }

    public void setMinutes3(Integer minutes) {
        this.minutes3 = minutes;
    }

    public void setCompleted3(Boolean completed) {
        this.completed3 = completed;
    }
    private String task4;
    private Integer minutes4;
    private Boolean completed4;


    public String getTask4() {
        return task4;
    }

    public Integer getMinutes4() {
        return minutes4;
    }

    public Boolean getCompleted4() {
        return completed4;
    }

    public void setMinutes4(Integer minutes) {
        this.minutes4 = minutes;
    }

    public void setCompleted4(Boolean completed) {
        this.completed4 = completed;
    }
    private String task5;
    private Integer minutes5;
    private Boolean completed5;

    public String getTask5() {
        return task5;
    }

    public Integer getMinutes5() {
        return minutes5;
    }

    public Boolean getCompleted5() {
        return completed5;
    }

    public void setMinutes5(Integer minutes) {
        this.minutes5 = minutes;
    }

    public void setCompleted5(Boolean completed) {
        this.completed5 = completed;
    }
}


public class Tasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the date: ");
        String date = input.nextLine();

        System.out.print("Enter your task: ");
        String task1 = input.nextLine();

        System.out.print("Enter minutes it'll take to complete it: ");
        Integer minutes1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter completion status (False/True): ");
        Boolean completed1 = input.nextBoolean();
        input.nextLine();

        System.out.print("Enter your task: ");
        String task2 = input.nextLine();

        System.out.print("Enter minutes it'll take to complete it: ");
        Integer minutes2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter completion status (False/True): ");
        Boolean completed2 = input.nextBoolean();
        input.nextLine();

        System.out.print("Enter your task: ");
        String task3 = input.nextLine();

        System.out.print("Enter minutes it'll take to complete it: ");
        Integer minutes3 = input.nextInt();
        input.nextLine();

        System.out.print("Enter completion status (False/True): ");
        Boolean completed3 = input.nextBoolean();
        input.nextLine();

        System.out.print("Enter your task: ");
        String task4 = input.nextLine();

        System.out.print("Enter minutes it'll take to complete it: ");
        Integer minutes4 = input.nextInt();
        input.nextLine();

        System.out.print("Enter completion status (False/True): ");
        Boolean completed4 = input.nextBoolean();
        input.nextLine();

        System.out.print("Enter your task: ");
        String task5 = input.nextLine();

        System.out.print("Enter minutes it'll take to complete it: ");
        Integer minutes5 = input.nextInt();
        input.nextLine();

        System.out.print("Enter completion status (False/True): ");
        Boolean completed5 = input.nextBoolean();
        input.nextLine();

        System.out.println("\nYour Schedule:");
        System.out.println("Your name: " + name);
        System.out.println("The date: " + date);
        System.out.println("Task: " + task1);
        System.out.println("Time: " + minutes1 + " minutes");
        System.out.println("Completed: " + completed1);
        System.out.println("Task: " + task2);
        System.out.println("Time: " + minutes2 + " minutes");
        System.out.println("Completed: " + completed2);
        System.out.println("Task: " + task3);
        System.out.println("Time: " + minutes3 + " minutes");
        System.out.println("Completed: " + completed3);
        System.out.println("Task: " + task4);
        System.out.println("Time: " + minutes4 + " minutes");
        System.out.println("Completed: " + completed4);
        System.out.println("Task: " + task5);
        System.out.println("Time: " + minutes5 + " minutes");
        System.out.println("Completed: " + completed5);


        input.close();
    }
}

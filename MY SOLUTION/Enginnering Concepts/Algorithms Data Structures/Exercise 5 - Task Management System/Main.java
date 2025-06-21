import java.util.Scanner;

class Main
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        TaskManager tm= new TaskManager();
        while(true){
            
            System.out.println("------------------------------------------------");
            System.out.println("Task Manager Menu");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Search Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            System.out.println("------------------------------------------------");
            int choice=s.nextInt();

            switch(choice){
                case 1:
                System.out.print("Enter Task ID");
                int id=s.nextInt();
                s.nextLine();
                System.out.println("Enter Task Name");
                String name=s.nextLine();
                System.out.println("Enter Task Status");
                String status=s.nextLine();
                tm.addTask(id,name,status);
                break;

                case 2:
                tm.traverseTask();
                break;

                case 3:
                System.out.print("Enter the Id to Search");
                int searchId=s.nextInt();
                tm.searchTask(searchId);
                break;

                case 4:
                System.out.println("Enter the Id to delete:");
                int deleteId=s.nextInt();
                tm.deleteTask(deleteId);
                break;

                case 5:
                System.out.println("Exiting Task Manager.");
                return;

                default:
                System.out.println("Invalid choice");
            }
        }
    }
}
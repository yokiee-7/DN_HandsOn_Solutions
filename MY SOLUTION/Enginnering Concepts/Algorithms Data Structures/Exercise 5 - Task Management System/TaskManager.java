public class TaskManager {
    Task head=null;

    public void addTask(int id,String name,String status){

        Task newTask=new Task(id,name,status);
        if(head==null){
            head=newTask;
        }
        else{
            Task temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newTask;
        }

    }
    public void traverseTask(){
        Task temp=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            temp.display();
            temp=temp.next;
        }
    }
    public void searchTask(int id){
        Task temp=head;
        while(temp.next!=null){
            if(temp.taskId==id){
                System.out.println("Task Found: ");
                temp.display();
                return;
            }
            temp=temp.next;
        }
        System.out.println("Values not Found");
    }
    public void deleteTask(int id){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.taskId==id){
            head=head.next;
        }
        Task temp=head;
        while(temp.next!=null){
            if(temp.next.taskId==id){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    
    
}

public class Main {
    static int count=0;
    static Employee[] employees=new Employee[10];


    public static void addEmployee(Employee e){
        if(count<10){
            employees[count++]=e;
        }
        else{
            System.out.println("Employee list is full");
        }
    }
    public static void searchEmployee(int id){

        for(int i=0;i<count;i++){
            if(employees[i].employee_id==id){
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found");
    }
    public static void traverseEmployee(){

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    public static void DeleteEmployee(int id){
        for(int i=0;i<count;i++){
            if(employees[i].employee_id==id){
                for(int j=i;j<count-1;j++){
                    employees[j]=employees[j+1];
                }
                employees[--count]=null;
                System.out.println("Employee deleted.");
                return;
            }
        }

    }

    public static void main(String[] args){

        addEmployee(new Employee(1, "Alice", "Manager", 80000));
        addEmployee(new Employee(2, "Bob", "Developer", 60000));
        addEmployee(new Employee(4, "Charlie", "Analyst", 50000));
        addEmployee(new Employee(3, "Yokesh", "Developer", 50000));

        System.out.println("----------------------------------");
        System.out.println("Employee List");
        DeleteEmployee(4);
        traverseEmployee();


        System.out.println("----------------------------------");
    }
}

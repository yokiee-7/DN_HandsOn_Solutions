class Employee{

    int employee_id;
    String name;
    String position;
    int salary;

    public Employee(int employee_id, String name, String position, int salary) {
        this.employee_id = employee_id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void display(){
        System.out.println(employee_id+ " "+ name +" "+position+" "+salary);
    }
    
}
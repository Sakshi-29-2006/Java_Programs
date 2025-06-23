public class Employee {
    int id;
    String name;
    float salary;
    public Employee(int empid, String n, float sal){
        id = empid;
        name = n;
        salary = sal;
    }
    public void info(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
    }
    public static void main(String[] args){
        Employee e1 = new Employee(3, "Sakshi",25000f);
        Employee e2 = new Employee(2, "Aarya", 28500.50f);
        Employee e3 = new Employee(10, "Rakshada",20000f);
        e1.info();
        System.out.println();
        e2.info();
        System.out.println();
        e3.info();
    }
}

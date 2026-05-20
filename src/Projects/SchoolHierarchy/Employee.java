package Projects.SchoolHierarchy;
// TODO 8: Declare an abstract Employee class as extension of Person
// TODO 9: Include attributes: dateOfAppointment and salary
// TODO 10: Include abstract getter and setter for salary

abstract class Employee extends Person {
    Date dateOfAppointment;
    protected int salary;
    Employee(String n,Date d,Date dateOfAppointment,int s){
        super(n,d);
        this.salary=s;
        this.dateOfAppointment=dateOfAppointment;
    }
    abstract void setSalary(int salary);
    abstract int getSalary();
}
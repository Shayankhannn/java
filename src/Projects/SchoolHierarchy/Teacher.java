package Projects.SchoolHierarchy;
// TODO 11: Create Teacher class with attributes and constructor
// TODO 12: Override the getDetails() method
// TODO 13: Implement getSalary() and setSalary() methods

class Teacher extends Employee{
    String qualification;
    String subject;
    Teacher(String n,Date d,Date dateOfAppointment,String subject,String q,int salary){
        super(n,d,dateOfAppointment,salary);
        this.qualification=q;
        this.subject=subject;
    }

    @Override
    void getDetails() {
        System.out.println(  "Name: " + name +
                ", DOB: " + dob.getDate() +
                ", Appointment: " + dateOfAppointment.getDate() +
                ", Subject: " + subject +
                ", Qualification: " + qualification +
                ", Salary: " + getSalary());
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }
}
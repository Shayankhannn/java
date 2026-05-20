package Projects.SchoolHierarchy;

// TODO 14: Inside main(), create Date instances
// TODO 15: Declare Teacher object with initial salary 0
// TODO 16: Declare Student object
// TODO 17: Call setSalary() and assign 50000
// TODO 18: Call getDetails() for teacher and student

class Main{
    public static void main(String[] args){
        Date dobOfStudent = new Date(12,2,2000);
        Date dobOfTeacher = new Date(21,5,1980);
        Date dateOfAppointment = new Date(12,2,2009);
        Teacher teacher = new Teacher("Madhavan",dobOfTeacher,dateOfAppointment,"Electronics","MTech",0);
        Student student = new Student("Belinda",dobOfStudent,teacher,"Electronics");


        teacher.setSalary(50000);
        teacher.getDetails();
        student.getDetails();







    }
}

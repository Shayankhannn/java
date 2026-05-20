package Projects.SchoolHierarchy;
// TODO 4: Design Student class by extending Person
// TODO 5: Declare two instance attributes: subject and teacher
// TODO 6: Define a constructor for the Student class
// TODO 7: Override the getDetails() method

class Student extends Person{
    String subject;
    Teacher teacher;
    Student(String n,Date d,Teacher t,String s){
        super(n,d);
        this.teacher=t;
        this.subject=s;

    }

    @Override
    void getDetails() {
        System.out.println( "Student Name: " + name +
                ", DOB: " + dob.getDate() +
                ", Subject: " + subject +
                ", Teacher: " + teacher.name);
    }
}

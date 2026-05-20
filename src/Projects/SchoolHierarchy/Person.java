package Projects.SchoolHierarchy;
// TODO 1: Declare the abstract Person class
abstract class Person{
    String name;
    Date dob;
    Person(String n,Date d){
        this.name=n;
        this.dob=d;
    }
    abstract void getDetails();
}
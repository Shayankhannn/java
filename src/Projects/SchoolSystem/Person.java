package Projects.SchoolSystem;

abstract class Person {
    //TODO 1: declare Person attributes name and age here
    String name;
    int age;
    Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    void getDetails() {
        //TODO 2: print name and age
        System.out.println("name : " + this.name + " age : " + this.age);
    }
}

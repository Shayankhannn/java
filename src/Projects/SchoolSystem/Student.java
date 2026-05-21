package Projects.SchoolSystem;

class Student extends Person implements StudentInterface {
    //TODO 5: add subject and marks attributes
    String subject;
    int marks;

    Student(String name, int age, String subject, int marks) {
        //TODO 6: complete the constructor code
        super(name,age);
        this.marks=marks;
        this.subject=subject;
    }

    @Override
    void getDetails() {
        super.getDetails();
        //TODO 7: insert print statements for subject and marks attributes
        System.out.println(
                "Marks : " + marks + "Subject : " + subject
        );
    }

    @Override
    public void result() {
        //TODO 8: print Pass if marks>50, fail otherwise
        if (marks>50){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }
    }

    @Override
    public void fee(int fee) {
        //TODO 9: override fee() method to print the message
        System.out.println("the student has paid the specified fee " + fee);
        // the student has paid the specified fee as the argument.
    }
}

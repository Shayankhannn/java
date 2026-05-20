package Projects.SchoolHierarchy;
// TODO 2: Declare the Date class with date, month, year
// TODO 3: Include the getDate() method

class Date {
    int month;
    int date;
    int year;
    Date(int d,int m,int y){
        this.date=d;
        this.month=m;
        this.year=y;
    }
    String getDate(){
        return this.date+"-"+this.month+"-"+this.year;

    }
}
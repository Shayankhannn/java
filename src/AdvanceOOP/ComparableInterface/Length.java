package AdvanceOOP.ComparableInterface;

//Java’s standard library has several built-in interfaces, including Serialzable, Clonable, and Comparable interfaces.
//
//The Comparable interface defines how objects are compared. It is generally implemented to sort an array of objects.
//It has a compareTo() method, which needs to be implemented by a concrete class.


class Length implements Comparable<Length> {
    int cm, mm;

    Length(int cm, int mm) {
        this.cm=cm;
        this.mm=mm;
    }

    @Override
    public int compareTo(Length obj2) {
        int mmObj1 = this.cm*10+this.mm;
        int mmObj2 = obj2.cm*10+obj2.mm;

        if (mmObj1>mmObj2)
            return 1;
        else
            return 0;

    }
}

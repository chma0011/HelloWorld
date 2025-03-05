public class Person {
    String firstName;
    String middleName;
    String lastName;
    int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;

    }

    public String toString() {
        return firstName + " " + middleName + " " + lastName + " " + age;

    }
    public String getFullName(){
        return firstName + " " + middleName + " " + lastName + " ";

    }

}


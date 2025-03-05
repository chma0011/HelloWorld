public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getMiddleName(){
        return middleName;

    }

    public String toString() {
        return "Firstname: " + firstName + "\n" +
                "Middlename: " + middleName + "\n" +
                "Lastname: " + lastName + "\n" +
                "Age: " + age;
    }

    public String getLastName(){
        return lastName;

    }

    public int getAge(){
        return age;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;

    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getFullName(){
        return firstName + " " + middleName + " " + lastName;
    }


}

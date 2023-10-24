package javaprogramme;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
    public void setFirstName(String newFirstname) {//setFirstName with one parameter of type string method
        this.firstname = newFirstname;
    }
    public void setLastName(String newLastname) {
        this.lastname = newLastname;
    }
    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }
    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }
    public String getFirstName() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public int getAge() {
        return this.age;

    }
    public String getFullName() {
        return this.firstname + " " + this.lastname;
    }
}

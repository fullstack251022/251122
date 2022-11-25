public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public void printMyName() {
        System.out.println("My name is " + firstName);
    }

    public void printMyFullName() {
        System.out.println("My name is " + firstName + " and my last name is " + lastName);
    }
    public void printMyFullName(String myString) {
        System.out.println("My name is " + firstName + " and my last name is " + lastName + " I say "+myString);
    }

    public void printAllAtributes(){
        System.out.println("My name is " + firstName + " and my last name is " + lastName+ " and my age is "+age);
    }

}

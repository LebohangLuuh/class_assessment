public class Person {
    String name;
    int age;
    String gender;
    String[] interest;



    public Person(String name, int age, String gender, String[] interest) {
        this.interest = interest;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String hello()
    {
        return("Hello my name is " + name + ", my gender is " + gender + " and I am " + age + " years old. My interest are " + interest[0] + ", " + interest[1] + " and " + interest[2]);

    }
}

public class User {
    String firstName="",lastName="";
    byte age;
    int salary;

    public boolean isValidAge() {
        return (age>=18 && age<=60)?true:false;
    }

    public String getFullName(){
       return firstName + lastName;
    }
}

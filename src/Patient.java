public class Patient {
    private int age;
    private String firstName;

    //The empty constructor will be created automatically if we don't define a constructer with parameters
    public Patient(){

    }

    public Patient(int age,String firstName){
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

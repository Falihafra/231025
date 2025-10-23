public class umlperson{

    private String name;
    private int age;
    private char Gender;

    public umlperson() {
        name = "Fatih";
        age = 30;
        Gender = 'M';
    }
    public umlperson(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.Gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return Gender;
    }
    public void setGender (char gender) {
        this.Gender = gender;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + Gender);
    }
    } 
    

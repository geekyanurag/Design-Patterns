public class Student implements Prototype {
    String name;
    int age;
    private String rollNo;

    public Student(){}

    public Student (String name, int age, String rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public Prototype clone(){
        return new Student(this.name, this.age, this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}

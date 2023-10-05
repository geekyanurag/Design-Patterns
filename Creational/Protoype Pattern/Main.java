public class Main {

    public static void main(String args[]){
        Student student = new Student("anurag", 23, "1760");
        Student studentClone = (Student) student.clone();

        String clonedDetails = studentClone.toString();
        String originalDetails = student.toString();
        System.out.println(originalDetails);
        System.out.println(clonedDetails);
    }
}

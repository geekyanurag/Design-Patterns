public class Main {

    public static void main(String args[]){
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN", new EmployeeDo());
            employeeDao.get("USER", 1010);
            System.out.println("Operation completed Successfully");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

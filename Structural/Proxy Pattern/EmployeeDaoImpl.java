public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception{
        System.out.println("Created new row in employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception{
        System.out.println("Deleted row with employeeId : " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception{
        System.out.println("Get the details of the employee with id : " + employeeId);
        return new EmployeeDo();
    }
}

public class Main {

    public static void main(String args[]){
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdaptor.getWeightInKg());
    }
}

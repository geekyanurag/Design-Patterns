public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

    WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKg(){
        return weightMachine.getWeightInPounds() * 10;
    }
}

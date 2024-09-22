public class GasBurner extends Burner{
    
    private String gasType;

    public GasBurner(){
        super(null);
    }

    public boolean spark(){
        return true;
    }

    public String getGasType(){
        return this.gasType;
    }

    private void increaseGasFlow(){

    }

    private void decreaseGasFlow(){

    }

}

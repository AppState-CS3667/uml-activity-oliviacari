public class ElectricBurner extends Burner {
    private double voltReq;
    private double ampReq;

    public ElectricBurner(double voltReq){
        super(null);
        this.voltReq = voltReq;
    }

    public void increaseCurrent(){

    }

    public void decreaseCurrent(){

    }

    public double getVoltReq(){
        return this.voltReq;
    }
}

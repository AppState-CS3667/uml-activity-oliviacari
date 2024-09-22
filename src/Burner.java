public abstract class Burner{
    private double diameter;
    private double maxTemp;
    private double minTemp;
    private boolean isHot;

    public Burner(double maxTemp, double minTemp, double diameter){
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.diameter = diameter;

    }
    
    public Burner(Burner burner) {
        
    }

    public boolean turnOn(){
        return true;
    }

    public boolean turnOff(){
        return true;
    }

    public void increaseTemp(){

    }

    public void decreaseTemp(){

    }

    public double getDiameter(){
        return this.diameter;
    }

    public double getMaxTemp(){
        return this.maxTemp;
    }

    public double getMinTemp(){
        return this.minTemp;
    }

    public boolean isHot(){
        return isHot;
    }
}
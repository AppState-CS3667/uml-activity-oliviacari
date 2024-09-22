public class Stove {
    
    private Burner[] burners;

    public boolean hookUp(){
        return true;
    }

    public void setBurnerTemp(int burner, double temp){
        burner = 0;
        temp = 0;

    }

    public boolean isHot(){
        return false;
    }

    public boolean isHot(int burner){
        return true;
    }

    public double getBurnerTemp(int burner){
        return 0;
    }

    public Burner getBurner(int burner){
        return burners[burner];
    }
}

public class Fan {
    private boolean isOn;
    private int speed;
    public Fan() {
        isOn = false;
        speed = 0;
    }

    public void turnOn(){
        isOn = true;
        speed = 1;
    }

    public void turnOff(){
        isOn = false;
        speed = 0;
    }

    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    public boolean getFanIsOn(){
        return isOn;
    }
}


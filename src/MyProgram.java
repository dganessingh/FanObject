class MyProgram
{
    public static void main(String []args)
    {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("\n");
        System.out.println("Fan #1:\n" + fan1.toString());
        System.out.println("Fan #2:\n" + fan2.toString());
    }
}


class Fan
{
    public static final int SLOW = 1, MEDIUM = 2,  FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    ////////////////////////////////////////////////////////////////////////////////////
    // accessor and mutator methods

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case 1: 
                s = "SLOW";
                break; 
            case 2: 
                s = "MEDIUM";
                break; 
            case 3: 
                s = "FAST";
                break; 
        }
        return s;
    }
    public void setSpeed(int value) {
        if(value < 1 || value > 3){
            System.out.println("\nValue requested for speed is invalid. Will use SLOW which is the default.");
            return;
        }
        this.speed = value;
    }

    public boolean getOn() {
        return on;
    }
    public void setOn(boolean value) {
        this.on = value;
    }
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double value) {
        this.radius = value;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String value) {
        this.color = value;
    }
    ////////////////////////////////////////////////////////////////////////////////////

    // constructor with no arguments. Fan will be created with defaults
    public Fan(){
        setSpeed(SLOW);
        setOn(false);
        setRadius(5);
        setColor("blue");
    }

    public String toString() {
        String description = "";
        if(on){
            description += "Speed: " + getSpeed() + "\n";
            description += "Color: " + getColor() + "\n";
            description += "Radius: " + getRadius() + "\n";
        }
        else {
            description += "Color: " + getColor() + "\n";
            description += "Radius: " + getRadius() + "\n";
            description += "Fan is off.\n";
        }
        return description;
    }
}



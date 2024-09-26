package theme2;

public class curriculum1_23 {  
	
    private String name;    // 動物名
    private double length;  // 体長
    private double speed;   // 速度

    
    public curriculum1_23(String name, double length, double speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }

    // 動物名のsetter
    public void setName(String name) {
        this.name = name;
    }

    // 動物名のgetter
    public String getName() {
        return name;
    }

    // 体長のsetter
    public void setLength(double length) {
        this.length = length;
    }

    // 体長のgetter
    public double getLength() {
        return length;
    }

    // 速度のsetter
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // 速度のgetter
    public double getSpeed() {
        return speed;
    }

    
    public void displayInfo() {
        System.out.println("動物名：" + getName());
        System.out.println("体長：" + getLength() + "m");
        System.out.println("速度：" + getSpeed() + "km/h");
    }

    public static void main(String[] args) {
        
        curriculum1_23 lion = new curriculum1_23("ライオン", 2.1, 80);
        
        lion.displayInfo();
    }
}

public class Person {
    public String name;
    public int age;
    public double height; 
    public double weight; 
    
    
    private static int count = 0; // 初期値 0

    // コンストラクタ
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++; 
    }

    // BMI
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
        System.out.println();
    }

    // クラスメソッド printCount
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}

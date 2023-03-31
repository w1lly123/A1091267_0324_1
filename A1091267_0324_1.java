import java.util.Scanner;

class animal{
    private String name;
    private float height;
    private int weight;
    private int age;

    public animal(String name,float height,int weight,int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
    public String getNmae(){
        return name;
    }
    public void show(){
        System.out.println("Name:" + name + ",Height:"+ height + ",Weight" + weight +",Age" + age);
    }
    public double distance(int time,double acceleration){
        return 0.4 * acceleration * Math.pow(time, 3);
    }
    public double distance(int time){
        return distance(time, 3.5)
    }

}
public class A1091267_0324_1{
    public static void main (String[] args){
        Animal[] animals = {
            new Animal("青蛙", 20, 15, 3),
            new Animal("鴨子", 15, 10 , 2),
            new Animal("鱷魚", 60 , 70 , 5 ),
        };
        for (Animal animal : animals){
            animal.show();
        }
        Scanner scanner = new  Scanner(system.in);
        for(Animal  animal : animals){
        System.out.print("請輸入"+animal.getName()+"時間(min):");
        int x = scanner.nextInt();
        System.out.print("請輸入 " + animal.getName() + " 加速度: ");
        double y = scanner.nextDouble();

        double distance = animal.distance(x, y);
        System.out.println(animal.getName() + " 奔跑了 " + distance + " m");
        }
        scanner.close();
        }
    }
}

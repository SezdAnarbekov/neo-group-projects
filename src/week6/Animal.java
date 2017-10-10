package week6;

/**
 * Created by syezdsultanov on 2/11/17.
 */
public class Animal {
    private String name, color;
    private int age;
    public static void main(String[] args) {
        Animal it = new Animal("Sharik", "sary", 5);
        Animal mishik = new Animal("Murka", "kok", 13);
        Animal uy = new Animal("Sarala", "ala", 2);

        it.printAnimals();
       // System.out.println(Animal.setColor("kara"));
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;}

        public String getName() {
           return name;
        }
        public String getColor() {
            return color;
        }
        public int getAge() {
        return  age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setColor(String color){
            this.color = color;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void printAnimals(){
            System.out.println("Name is " + getName() + "/n" + "Color is " + getColor() + "/n" + "Age is " + getAge());
        }


}
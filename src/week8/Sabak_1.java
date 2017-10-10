package week8;
enum level {
    HIGH(180, "Uzun"),
    LOW(150,"Kyska"),
    MEDIUM(165, "Orto");
    private int num;
    private String boy;
   private level(int num, String boy){
        this.num = num;
        this.boy = boy;
    }
    public int getSan(){
        return num;
    }

}
public class Sabak_1 {
public static void main(String[] args) {
level high = level.HIGH;
level low = level.LOW;
level b = level.LOW;
level medium = level.MEDIUM;
printLevels();
    System.out.println(low == b);
    }
    public static void printLevels(){
    for (level l : level.values())
        System.out.println(l + " number value is: " + l.getSan());
    }
}




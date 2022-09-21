import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println( funkc(generateRandomAge(), 40));
        System.out.println( funkc(generateRandomAge(), 5));
        System.out.println( funkc(generateRandomAge(), 60));
        System.out.println( funkc(generateRandomAge(), -7));
        System.out.println( funkc(generateRandomAge(), 8));
    }
    public static String funkc (int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30){
            return "can go for a walk";
        }else if (age < 20 && temp > 0 && temp < 28){
            return "can go for a walk";
        } else if ( age > 45 && temp > -10 && temp < 25){
            return "can go for a walk";
        }else {
            return "stay at home";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int a = random.nextInt(200);
        return a;
    }
}
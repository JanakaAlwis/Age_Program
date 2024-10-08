public class App {
    public static void main(String[] args) throws Exception {
        int age = 18; 
        if (age > 0 && age < 18) 
        { 
            if (age >= 15) 
            {
                System.out.println("You can drive a moped."); 
            }
            System.out.println("You are underage."); 
        } 
        else if (age >= 65) 
        { 
            System.out.println("You are retired."); 
        }
        else if (age == 18)
        {
            System.out.println("You can drive a car."); 
        }
        else
        { 
            System.out.println("You are an adult."); 
        } 
        System.out.println("Press space to exit.");
    }
}

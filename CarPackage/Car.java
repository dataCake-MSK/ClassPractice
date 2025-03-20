package CarPackage;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static int totalCars = 0;  // Class Field  // Public not recommended
    static List<String> nicknames = new ArrayList<>();  // static String[] nicknames = {}; makes a fixed size array

    String nickname = "Undefined";  // Instance Field
    String color = "White";

    public Car() {  // Default Constructor
        System.out.println("Default Car Made");
        totalCars = totalCars + 1;
        nicknames.add(this.nickname);
    }

    public Car(String nickname, String color) {
        System.out.println("Custom Car Made");
        this.nickname = nickname;  // Needed to assign instance variable
        this.color = color;
        this.carInfo();
        totalCars = totalCars + 1;
        nicknames.add(this.nickname);
    }

    public void carInfo(){
        System.out.println("[INFO] Nickname: " + nickname + ", Color: " + color);
    }

    public static void carsInfo(){
        System.out.println(totalCars);
        System.out.println(nicknames);
    }
}

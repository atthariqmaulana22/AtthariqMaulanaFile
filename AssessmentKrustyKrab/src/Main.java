import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner printInput = new Scanner(System.in);

        Map<Integer, String> Resep = new HashMap<>();

        Resep.put(0, "Preheat Oven");
        Resep.put(2, "Bake Bread");
        Resep.put(4, "Serve Bread");
        Resep.put(10, "Eat");
        Resep.put(1, "PreHeat Pan");
        Resep.put(3, "Set Plate");
        Resep.put(6, "Add Some Pickles");
        Resep.put(5, "Add Krabby Patty");
        Resep.put(7, "Serve Patty");
        Resep.put(9, "Pour Sauce Over Patty");
        Resep.put(8, "Add Tartar Sauce");

        for (int i = 0; i < 11; i++) {
            String urutanResep = Resep.get(i);
            System.out.println(urutanResep);
        }
    }
}



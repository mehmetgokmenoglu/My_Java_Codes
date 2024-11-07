import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("Bread");
        food.add("Cheese");
        food.add("Fish");

        food.set(0,"Egg");
        food.remove(2);
        //food.clear();
        
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}


//2nd solution

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();
        food.add("Bread");
        food.add("Cheese");
        food.add("Fish");

        food.set(0,"Egg");
        food.remove(2);
        //food.clear();

        for (String s : food) {
            System.out.println(s);
        }
    }
}

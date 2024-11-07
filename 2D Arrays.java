public class Main {
    public static void main(String[] args) {
        String[][] cars = {{"Bayerische Motoren Werke","Audi","Mercedes"},
                {"Aston Martin","Maserati","Porsche"},
                {"Rolls-Royce","Ferrari","Lamborghini"}};

        cars[0][0] = "Bayerische Motoren Werke";
        cars[0][1] = "Audi";
        cars[0][2] = "Mercedes";
        cars[1][0] = "Aston Martin";
        cars[1][1] = "Maserati";
        cars[1][2] = "Rolls-Royce";
        cars[2][0] = "Rolls-Royce";
        cars[2][1] = "Ferrari";
        cars[2][2] = "Lamborghini";

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j]+" /// ");
            }
        }

    }
}

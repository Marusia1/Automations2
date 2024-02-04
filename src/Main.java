public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("SuperKoer");
        System.out.println(dog1.breed);

        // 3 rd c
        // 4commit
        //5 commit

// Homework 4
//4. Calculate and display in the console figure volume

        Figure volume = new Figure(4, 5, 6);
        double volume1 = volume.calculateVolume();
        System.out.println("Figure volume is: " + volume1);


        // 5. Calculate and display in the console figure surface area
        Figure area = new Figure(2, 3, 4);
        double area2 = area.calculateSurfaceArea();
        System.out.println("Figure surface area is: " + area2);
    }
}










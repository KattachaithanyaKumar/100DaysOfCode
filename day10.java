/* 
    Day 10:
    Classes in java
*/



public class day10 {
    public static class Dog {
        String name;
        String breed;
        int age;
        String color;
    
        public Dog(String name, String breed, int age, String color)  {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
        }
    
        public void showDog()  {
            System.out.println("The dog name is " + name + " it's a " + breed + " breed, it's age is " + age + " and it is " + color + " color.");
        }
    }

    public static void main(String[] args) {
        Dog snuffy = new Dog("snuffy", "pomeranian", 5, "white");
        snuffy.showDog();
    }
}

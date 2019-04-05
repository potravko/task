package lesson6;
 public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name,age);
    }
     @Override
     public void jump() {
         System.out.println(name +  " прыгнул на 0,5м");

     }
     @Override
     public void swim() {
         System.out.println(name + " уплыл на 10м ");


     }
     @Override
     public void run() {
         System.out.println(name + " убежал на 500м ");

     }

 }




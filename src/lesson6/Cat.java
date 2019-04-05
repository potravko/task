package lesson6;


    public class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }
        @Override
            public void jump() {
        System.out.println(name +  " прыгнула на 2м");

   }
        @Override
        public void swim() {
            System.out.println("Кошки не плавают ");


        }
        @Override
        public void run() {
            System.out.println(name + " убежала на 200м ");

        }

    }


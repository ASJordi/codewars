package kyu8;

public class ClassyExtentions {

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return name + " meows.";
        }

    }

    public static class Animal {

        public String name;

        public Animal(String name) {
            this.name = name;
        }

        public String speak() {
            return name;
        }

    }

}

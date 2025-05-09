package kyu7;

public class LombokBuilder {

    static class People{
        private final int age;
        private final String name;
        private final String lastName;
        private final String city;
        private final String job;
        private final String GREET = "hello";

        private People(Builder builder) {
            this.age = builder.age;
            this.name = builder.name;
            this.lastName = builder.lastName;
            this.city = builder.city;
            this.job = builder.job;
        }

        public static Builder builder() {
            return new Builder();
        }

        public String greet(){
            return GREET + " my name is " + this.name;
        }

        public static class Builder {
            private int age;
            private String name;
            private String lastName;
            private String city;
            private String job;

            public Builder age(int age) {
                this.age = age;
                return this;
            }

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder city(String city) {
                this.city = city;
                return this;
            }

            public Builder job(String job) {
                this.job = job;
                return this;
            }

            public People build() {
                return new People(this);
            }
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getCity() {
            return city;
        }

        public String getJob() {
            return job;
        }
    }

}

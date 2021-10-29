package ru.job4j.stream;

public class Account {

    private String name;
    private byte age;
    private String birthday;
    private String gender;
    private boolean family;

    @Override
    public String toString() {
        return "Account{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", birthday='" + birthday + '\''
                + ", gender='" + gender + '\''
                + ", family=" + family + '}';
    }

    static class Builder {
        private String name;
        private byte age;
        private String birthday;
        private String gender;
        private boolean family;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        Builder buildFamily(boolean family) {
            this.family = family;
            return this;
        }

        Account build() {
            Account account = new Account();
            account.name = name;
            account.age = age;
            account.birthday = birthday;
            account.gender = gender;
            account.family = family;
            return account;
        }
    }

    public static void main(String[] args) {
        Account account = new Builder().buildName("Fedor")
                .buildAge((byte) 50)
                .buildBirthday("23.10.1950")
                .buildGender("male")
                .buildFamily(false)
                .build();
        System.out.println(account);
    }
}

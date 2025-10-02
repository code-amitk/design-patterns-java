package org.example.patterns.builder;

public class User {

    private final String name;
    private final String emailId;
    private final int phoneNum;

    User( UserBuilder userBuilder) {
      this.name = userBuilder.name;
      this.emailId = userBuilder.emailId;
      this.phoneNum = userBuilder.phoneNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }

    static class UserBuilder {

        private  String name;
        private  String emailId;
        private int phoneNum;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setPhoneNum(int phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}

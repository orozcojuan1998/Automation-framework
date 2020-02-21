package builders;

public class UserBuilder {
    public UserBuilder(){
        System.out.println("I build the users with the email/phone and password read from the text file");
    }
    private String userEmail;
    private String password;
    private String cellphoneNumber;
    public static class Builder {
        private String userEmail;
        private String password;
        private String cellphoneNumber;
        private static final String DEFAULT_CELLPHONE = "3001234567";
        private static final String DEFAULT_USEREMAIL = "test@email.com";

        public Builder(String password) {
            this.password = password;
            this.userEmail = DEFAULT_USEREMAIL;
            this.cellphoneNumber=DEFAULT_CELLPHONE;
        }

        public UserBuilder.Builder withUserEmail(String email) {
            this.userEmail = email;
            return this;
        }

        public UserBuilder.Builder withPhone(String phone) {
            this.cellphoneNumber = phone;
            return this;
        }

        public UserBuilder Build() {
            UserBuilder account = new UserBuilder();
            account.userEmail = this.userEmail;
            account.cellphoneNumber=this.cellphoneNumber;
            account.password = this.password;
            return account;
        }
    }
}
public class PasswordCheck {
    boolean exist = true, length = true, lowerCase = true, upperCase = true, number = true, chara = true;

    int count = 6;

    Validator validations = new Validator();

    void passwordIsValid(String password)  {

        if (!validations.existence(password)) {
            System.out.println("1. Password should exist.");
            exist = false;
            count --;
        }
        if (!validations.longer(password)) {
            System.out.println("2. Password should be longer than than 8 characters.");
            length = false;
            count --;
        }
        if (!validations.lowerCase(password)) {
            System.out.println("3. Password should have at least one lowercase letter.");
            lowerCase = false;
            count --;
        }
        if (!validations.upperCase(password)) {
            System.out.println("4. Password should have at least one uppercase letter.");
            upperCase = false;
            count --;
        }
        if (!validations.digit(password)) {
            System.out.println("5. Password should have at least have one digit.");
            number = false;
            count --;
        }
        if (!validations.character(password)) {
            System.out.println("6. Password should have at least one special character.");
            chara = false;
            count --;
        }
        if (exist && length && lowerCase && upperCase && number && chara) {
            System.out.println("Password meets all the minimum requirements.");
        }
    }

    boolean passwordIsOk() {

        boolean results = true;
        if (count < 3) {
            results = false;
        }
        return results;
    }

}

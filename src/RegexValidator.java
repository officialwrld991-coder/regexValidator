public class RegexValidator {
    public static boolean validateEmail(String email) {
        String valid = email.trim().toLowerCase();

        String validEmail = "[a-z]\\.[a-z]+@native\\.semicolon\\.africa";

        return valid.matches(validEmail);
    }

    public static boolean validatePassword(String password) {

        String value = password.trim();

        String validPassword = "(?=.*[@+#_]).{8,16}";

        return value.equals(validPassword);



    }
}

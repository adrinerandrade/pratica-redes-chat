package login;

public class Login {

    private static String username = "1505";
    private static String password = "yjteo";

    public static String getUserId() {
        return username;
    }

    public static void setUsername(String username) {
        Login.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Login.password = password;
    }

}

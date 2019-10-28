package login;

public class Login {

//    Adriner
    private static String username = "1505";
    private static String password = "yjteo";
//    
//    Cleber
//    private static String username = "8235";
//    private static String password = "cwmya";
//    
//    Pedro
//    private static String username = "7778";
//    private static String password = "xjrju";
//    
//    Gabriel
//    private static String username = "";
//    private static String password = "";

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

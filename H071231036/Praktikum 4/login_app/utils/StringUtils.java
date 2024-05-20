package login_app.utils;

public class StringUtils {
    
    public static String generateNickName(String fullName) {
        String[] names = fullName.split(" ");
 
        StringBuilder nickNameBuilder = new StringBuilder();
        for (String name : names) {
            nickNameBuilder.append(name.charAt(0));
        }
        
        return nickNameBuilder.toString().toUpperCase();
    }
}

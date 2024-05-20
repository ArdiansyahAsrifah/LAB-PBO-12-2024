package login_app.utils;

public class StringUtils {
    
    public static String generateNickName(String fullName) {
        String[] names = fullName.split(" ");
        
        // Mengambil huruf pertama dari setiap kata dalam nama lengkap
        StringBuilder nickNameBuilder = new StringBuilder();
        for (String name : names) {
            nickNameBuilder.append(name.charAt(0));
        }
        
        return nickNameBuilder.toString().toUpperCase();
    }
}

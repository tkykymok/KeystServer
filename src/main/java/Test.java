import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Test {
    public static void main(String[] args) {


        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String pass = "pass";
        String encoded = passwordEncoder.encode(pass);

        System.out.println(encoded);

    }
}

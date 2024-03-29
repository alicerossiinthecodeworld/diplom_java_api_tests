import org.apache.commons.lang3.RandomStringUtils;

public class User {
    public final String email;
    public final String password;
    public final String name;

    public User(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
}

   public static User getRandomUser(){
           final String email = RandomStringUtils.randomAlphabetic(10)+"@yandex.ru";
           final String password = RandomStringUtils.randomAlphabetic(10);
           final String name = RandomStringUtils.randomAlphabetic(10);
           return new User(email, password, name);
   }

    public static String getRandomEmail(){
        return RandomStringUtils.randomAlphabetic(10)+"@yandex.ru";
    }
    public static String getRandomData(){
        return RandomStringUtils.randomAlphabetic(10);
    }

}

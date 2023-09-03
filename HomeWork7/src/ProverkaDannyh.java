import java.util.regex.Pattern;

public class ProverkaDannyh  {
    private String[] userInfo;
    private StringBuilder pars = new StringBuilder();
    private Integer  age;
    private int dlina = 0;

    public ProverkaDannyh (String userInfof) throws  IncorrectInfoException{
        setUserInfo(userInfof);
        for (int i = 0; i < getUserInfo().length; i++){
            if (0 <= i && i < (getUserInfo().length - 1)) {
                pars.append(getUserInfo()[i] + " ");
                dlina += getUserInfo()[i].length();
                //System.out.println(getUserInfo()[i]+ " "+ dlina);
            } else {
                age = Integer.parseInt(getUserInfo()[i]);
                dlina += getUserInfo()[i].length();
            }
        }

        if (Pattern.compile("[\\d,*%/+:]\\\\*").matcher(pars).find() || dlina >200 || dlina == 0) {
                throw new IncorrectInfoException("Неверен формат ФИО  ", pars.toString() );
        } else if  (age > 100 || age < 0) {
            throw new IncorrectInfoException("Веден неверный возраст ", age);
        }
    }

    public String[] getUserInfo() {
        return userInfo;
    }

    private void setUserInfo(String userInfoff) {
        this.userInfo= userInfoff.split(" ");
    }
}

public class User {

    private  String login;
    private  String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        // Реализация проверки на корректность email адреса
        // Здесь можно использовать регулярные выражения, библиотеки для валидации email адресов и т.п.
        // В данном примере просто проверяем наличие символа @ и точки
        return email != null && email.contains("@") && email.contains(".");
    }

}

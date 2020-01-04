package day34;

public class LoginMethod {

    public static void main(String[] args) {

        Login("name1","asd12");

        System.out.println(login2("user", "abc123"));




        if (login2("user", "abc123")){
            System.out.println("add book to cart");
            System.out.println("pay for book");
            System.out.println("view the order ");
        }else{
            System.out.println("No shopping");
        }



    }

    public static void Login (String login, String password){

        if (login.equals("name")&&password.equals("asd123")){
            System.out.println("login successful");
        }else if (login.equals("name")&&!password.equals("asd123")){
            System.out.println("password error");
        }else if (!login.equals("name")&&password.equals("asd123")){
            System.out.println("login error");
        }
        else {
            System.out.println("login failed");
        }
    }


    public static boolean login2 (String name, String password1) {

        if (name.equals("user")&&password1.equals("abc123")){
            return true;
        }else {
            return false;
        }
    }
}

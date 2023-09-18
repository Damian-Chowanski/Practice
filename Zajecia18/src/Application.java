import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Accounts konta = new Accounts();
        konta.getUsersList().add(new User("Rafał", "Kowalski", 24,"rak123@gmail.com"));
        konta.getUsersList().add(new User("Jerzy", "Świder", 18,"tes33@gmail.com"));
        konta.getUsersList().add(new User("Agata", "Pączek", 45,"wes31@gmail.com"));
        konta.getUsersList().add(new User("Karol", "Mlask", 32,"kghr231@gmail.com"));


        ArrayList<User> usersList = konta.getUsersList();

        for (User user: usersList){
            user.toString();
        }



    }
}

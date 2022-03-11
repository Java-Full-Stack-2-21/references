package codingchallenges.loginconsole.services;


import codingchallenges.loginconsole.db.Database;
import codingchallenges.loginconsole.models.User;

public class LoginService {
    private static LoginService obj = null;

    private LoginService() {}

    public Boolean validateCredentials(String username, String password){

        for(int i = 0; i < Database.accounts.size(); i++){
            if (Database.accounts.get(i).getUsername().equals(username) && Database.accounts.get(i).getPassword().equals(password)) {
                    return true;
            }
        }

        return false;

    }

    public void addUser(User user){
        Database.accounts.add(user);
    }


    public static LoginService getInstance(){
        if(obj == null){
            obj = new LoginService();
        }

            return obj;
    }

}

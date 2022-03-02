package codingchallenges.loginconsole.services;


import codingchallenges.loginconsole.db.Database;
import codingchallenges.loginconsole.models.User;

public class LoginService {

    public Boolean validateCredentials(String username, String password){

        for(int i = 0; i < Database.accounts.length; i++){
            if(Database.accounts[i] != null ) {
                if (Database.accounts[i].getUsername().equals(username) && Database.accounts[i].getPassword().equals(password)) {
                    return true;
                }
            }
        }

        return false;

    }

    public void addUser(User user){
        Database.accounts[Database.accountSize++] = user;
    }

}

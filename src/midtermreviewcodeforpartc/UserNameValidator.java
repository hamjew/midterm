/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author 82103
 */
public class UserNameValidator {
    
    public boolean userNameChecking(User user){
        if(user.getName()==null){
            return false;
        }else{
            return true;
        }
    }
}

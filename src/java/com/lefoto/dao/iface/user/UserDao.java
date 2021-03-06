/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lefoto.dao.iface.user;

import com.lefoto.model.user.LeUser;
import com.lefoto.model.user.LeUserInfo;

/**
 *
 * @author Eric
 */
public interface UserDao {

    public void addUser(LeUser user);

    public void delUser(LeUser user);

    public LeUser findUserByEmail(String email);

    public void updateUser(LeUser user);

    public boolean checkUser(String email, String password);

    public boolean checkEmailExist(String email);
    
    public LeUserInfo findUserInfoByUserId(String userId);

    public void addOrUpdateUserInfo(LeUserInfo userInfo);
}

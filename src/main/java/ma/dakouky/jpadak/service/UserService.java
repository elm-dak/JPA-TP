package ma.dakouky.jpadak.service;

import ma.dakouky.jpadak.entites.Role;
import ma.dakouky.jpadak.entites.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username , String roleName);

    User authenticate(String userName,  String password);

}

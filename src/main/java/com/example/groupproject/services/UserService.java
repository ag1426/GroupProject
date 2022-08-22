package com.example.groupproject.services;

import com.example.groupproject.dao.RoleDao;
import com.example.groupproject.dao.UserDao;
import com.example.groupproject.entity.Role;
import com.example.groupproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;
    public User registerNewUser(User user) {
        return userDao.save(user);
    }

       public void initRolesAndUser(){
           Role adminRole = new Role();
           adminRole.setRoleName("Admin");
           adminRole.setRoleDescription("Admin Role");
           roleDao.save(adminRole);

           Role userRole = new Role();
           userRole.setRoleName("User");
           userRole.setRoleDescription("Default role for newly created record");
           roleDao.save(userRole);

           Role merchantRole = new Role();
           merchantRole.setRoleName("Merchant");
           merchantRole.setRoleDescription("Default role for newly created seller record");
           roleDao.save(merchantRole);

           User adminUser = new User();
           adminUser.setUserName("admin");
           adminUser.setUserFullName("Anjal Giri");
           adminUser.setEmail("anjal@gmail.com");
           adminUser.setUserPassword("admin");
           Set<Role> adminRoles = new HashSet<>();
           adminRoles.add(adminRole);
           adminUser.setRole(adminRoles);
           userDao.save(adminUser);

           User user = new User();
           user.setUserName("Zodiac_God");
           user.setUserFullName("Suyog Dhakal");
           user.setEmail("suyog@gmail.com");
           user.setUserPassword("Suyog@123");
           Set<Role> userRoles = new HashSet<>();
           userRoles.add(userRole);
           user.setRole(userRoles);
           userDao.save(user);

           User merchant = new User();
           merchant.setUserName("Rikrish");
           merchant.setUserFullName("Rikrish Shrestha");
           merchant.setEmail("rikrish@gmail.com");
           merchant.setUserPassword("Rikrish@123");
           Set<Role> merchantRoles = new HashSet<>();
           merchantRoles.add(merchantRole);
           merchant.setRole(merchantRoles);
           userDao.save(merchant);

        }

    }


package com.demo.LoanApp.Service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.LoanApp.Model.usermodel;
import com.demo.LoanApp.Repository.userrepo;

 



 


@Service
public class userservice implements Iuserservice {
    @Autowired
    private userrepo repo;

 

    @Override
    public List<usermodel> findAll() {
        // TODO Auto-generated method stub
        List<usermodel> users=(List<usermodel>) repo.findAll();
        return users;
    }

 

    @Override
    public usermodel findUser(String customerid, String password) {
        // TODO Auto-generated method stub
        usermodel user=repo.findUser(customerid, password);
        return user;
    }

 

    

 

}
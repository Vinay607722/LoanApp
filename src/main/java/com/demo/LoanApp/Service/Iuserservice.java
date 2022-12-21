package com.demo.LoanApp.Service;

import java.util.List;

import com.demo.LoanApp.Model.usermodel;






public interface Iuserservice {
List<usermodel> findAll();
usermodel findUser(String customerid, String password);
}



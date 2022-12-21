package com.demo.LoanApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.demo.LoanApp.Model.usermodel;

 



 

@Repository
public interface userrepo extends JpaRepository<usermodel, Long>{
    //BusDetail findById(int id);
    @Query("SELECT b FROM usermodel b WHERE b.customerid = ?1 and b.password = ?2")
    usermodel findUser(String customerid, String password);
}
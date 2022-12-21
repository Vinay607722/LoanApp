package com.demo.LoanApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LoanApp.Model.edtest;
import com.demo.LoanApp.Repository.edrepo;



@Service
public class edser implements Iedser {
    @Autowired
    private edrepo repo;
    @Override
    public List<edtest> findAll() {
          List<edtest> hospital = (List<edtest>) repo.findAll();
          return hospital;
    }
    
}

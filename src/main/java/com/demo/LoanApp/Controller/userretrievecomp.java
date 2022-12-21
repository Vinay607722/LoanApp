package com.demo.LoanApp.Controller;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.LoanApp.Model.usermodel;
import com.demo.LoanApp.Service.Iuserservice;


@Component
public class userretrievecomp implements JavaDelegate {
@Autowired
private Iuserservice userService;
public void execute(DelegateExecution execution) throws Exception {
    // TODO Auto-generated method stub
    String usercid=(String) execution.getVariable("m");
    String userPassword=(String) execution.getVariable("password");
    usermodel findUser=userService.findUser(usercid, userPassword);
    if(findUser==null)
    {
        execution.setVariable("findUser","notfinded");
    }
    else
    {
        execution.setVariable("name", findUser.getName());
        execution.setVariable("mobilenumber", findUser.getMobilenumber());
        execution.setVariable("email", findUser.getEmail());
        execution.setVariable("age", findUser.getAge());
        execution.setVariable("m", findUser.getCustomerid());
        execution.setVariable("a", findUser.getAccountnumber());
        execution.setVariable("c", findUser.getIfsccode());
        execution.setVariable("s", findUser.getCibilscore());
        execution.setVariable("gender", findUser.getGender());


        execution.setVariable("findUser","finded");
    }
    System.out.println(findUser);
}



}

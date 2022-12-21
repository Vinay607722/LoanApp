package com.demo.LoanApp.Controller;



import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.LoanApp.Model.edtest;
import com.demo.LoanApp.Repository.edrepo;
import com.demo.LoanApp.Service.Iedser;



@Component
public class edtestcomp implements JavaDelegate{
       @Autowired
       private Iedser hospitalServices;
       @Autowired
       private edrepo repo;
       @Override
       public void execute(DelegateExecution execution) throws Exception {
    	   String cid=(String) execution.getVariable("m");
    	   String name=(String) execution.getVariable("name");
    	   String lt=(String) execution.getVariable("loantype");
    	   String et=(String) execution.getVariable("employmenttype");
    	   double la=(double) execution.getVariable("loanAmount");
    	   double t=(double) execution.getVariable("loanRuntime");
    	   String ir=(String) execution.getVariable("loanType");
    	   String mp=(String) execution.getVariable("monthlyPayment");
    	   boolean a=(boolean) execution.getVariable("approved");
    	   String cn=(String) execution.getVariable("collegename");
    	   String q=(String) execution.getVariable("qualification");
    	   String b=(String) execution.getVariable("branch");
    	   String p=(String) execution.getVariable("percentage");
    	   String py=(String) execution.getVariable("passingyear");
    	   String rn=(String) execution.getVariable("referalname");
    	   String cno=(String) execution.getVariable("contactnumber");
    	   String lri=(String) execution.getVariable("r");
    	   
    	   edtest savepatient=new edtest(cid,name,lt,et,la,t,ir,mp,a,cn,q,b,p,py,rn,cno,lri);
    	   repo.save(savepatient);
    	   
    	   
       }
       
}

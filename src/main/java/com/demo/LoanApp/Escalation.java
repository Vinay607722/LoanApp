package com.demo.LoanApp;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Named;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.identity.User;
import org.camunda.bpm.engine.impl.context.Context;



public class Escalation implements JavaDelegate {



 // TODO: Set Mail Server Properties
//  protected static final String HOST = "mail.example.org";
//  protected static final String USER = "admin@example.org";
//  protected static final String PWD = "toomanysecrets";
	protected static final String HOST = "smtp.gmail.com";
    protected static final String USER = "managementhospital83@gmail.com";
    protected static final String PWD = "fqrrlmwoqduhharu";
    protected final static Logger LOGGER = Logger.getLogger(Escalation.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // TODO Auto-generated method stub



       String recipient =(String) execution.getVariable("emailaddress");
        String sub=" Complete the loan request form of " + execution.getVariable("loantype") + " within the given time";
        


       if (recipient != null && !recipient.isEmpty()) {
          Email email = new SimpleEmail();
           email.setCharset("utf-8");
           email.setHostName(HOST);
           email.setSmtpPort(587);
           email.setAuthentication(USER, PWD);      
           email.setStartTLSEnabled(true);
          try {
             email.setFrom("managementhospital83@gmail.com");
             email.setSubject("Approval Mail");
             email.setMsg(sub);
             email.addTo(recipient);
             email.send();
              LOGGER.info(
                "Task Assignment Email successfully sent to user '" + recipient + "' with address '" + recipient + "'.");
           } catch (Exception e) {
              LOGGER.log(Level.WARNING, "Could not send email to assignee", e);
            }
         } else {
            LOGGER.warning("Not sending email to user " + recipient + "', user has no email address.");
          }
       }
}




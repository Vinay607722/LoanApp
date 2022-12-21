package com.demo.LoanApp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class cibilscore implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Random rd =new Random();
        int rdnum ;
        rdnum = rd.nextInt(3);
        System.out.println("Random Number is" +rdnum);
        char s[] = new char[3];
        
       
        for(int i =0; i<3; i++) {
            rdnum = rd.nextInt(10);
            s[i] = Integer.toString(rdnum).charAt(0);
            
            }
        System.out.println("This patient id is " +s);
        System.out.println(s.toString()+"\n"+String.copyValueOf(s));
        execution.setVariable("s",String.copyValueOf(s));
        


	}

}

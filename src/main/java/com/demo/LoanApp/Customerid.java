package com.demo.LoanApp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class Customerid implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Random rd =new Random();
        int rdnum ;
        rdnum = rd.nextInt(10);
        System.out.println("Random Number is" +rdnum);
        char m[] = new char[10];
        m[0]='1';
        m[1]='6';
        m[2]='2';
        m[3]='8';
        m[4]='1';
        
        for(int i =5; i<10; i++) {
            rdnum = rd.nextInt(10);
            m[i] = Integer.toString(rdnum).charAt(0);
            
            }
        System.out.println("This patient id is " +m);
        System.out.println(m.toString()+"\n"+String.copyValueOf(m));
        execution.setVariable("m",String.copyValueOf(m));
        
        }






	}



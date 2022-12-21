package com.demo.LoanApp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class Ifsccode implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Random rd =new Random();
        int rdnum ;
        rdnum = rd.nextInt(10);
        System.out.println("Random Number is" +rdnum);
        char c[] = new char[10];
        c[0]='H';
        c[1]='D';
        c[2]='F';
        c[3]='C';
       
        for(int i =4; i<10; i++) {
            rdnum = rd.nextInt(10);
            c[i] = Integer.toString(rdnum).charAt(0);
            
            }
        System.out.println("This patient id is " +c);
        System.out.println(c.toString()+"\n"+String.copyValueOf(c));
        execution.setVariable("c",String.copyValueOf(c));
        
        }





	}



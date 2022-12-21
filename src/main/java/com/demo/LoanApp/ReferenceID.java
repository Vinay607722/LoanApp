package com.demo.LoanApp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class ReferenceID implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Random rd =new Random();
        int rdnum ;
        rdnum = rd.nextInt(10);
        System.out.println("Random Number is" +rdnum);
        char r[] = new char[10];
        for(int i =0; i<10; i++) {
            rdnum = rd.nextInt(10);
            r[i] = Integer.toString(rdnum).charAt(0);
            
            }
        System.out.println("This loan refrence id is " +r);
        System.out.println(r.toString()+"\n"+String.copyValueOf(r));
        execution.setVariable("r",String.copyValueOf(r));
        
        }





	




	}



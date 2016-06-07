/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import com.leapfrog.sms.DAO.impl.StudentDAOImpl;
import com.leapfrog.sms.entity.Student;

/**
 *
 * @author Annoyin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudentDAOImpl stdDAO=new StudentDAOImpl();
        stdDAO.insert(new Student(1, "Ram","kumar", "rk@gmail.com", "0934859", false));
        stdDAO.insert(new Student(2, "laxman", "stha", "9494", "ls@yahoo.com", true));
        
        
        
        Student[] stdlist=stdDAO.getall();
  
        for(int i=0;i<stdlist.length;i++){
            if(stdlist[i]!=null){
            System.out.println(stdlist[i].getFullName());
        }
        }
            
    
    
    }
    
    }


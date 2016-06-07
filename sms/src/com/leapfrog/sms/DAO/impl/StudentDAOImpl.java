/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms.DAO.impl;

import com.leapfrog.sms.entity.Student;

/**
 *
 * @author Annoyin
 */
public class StudentDAOImpl {

    Student[] stdlist = new Student[10];
    int counter=0;

    public void insert(Student s) {
        stdlist[counter]=s;
        counter++;

    }
    
    public boolean delete(int id){
        for(int i=0;i<stdlist.length;i++){
            if (stdlist[i]!=null && stdlist[i].getId()==id){
                stdlist[i]=null;
                return true;
                }
                      
        }
        return false;
        
    }
    
    public Student getbyid(int id){
        for(int i=0;i<stdlist.length;i++){
            Student s=stdlist[i];
            if(s!=null && s.getId()==id){
                return s;
            }
                
        }
        return null;
    }
    
    public Student[] getall(){
        return stdlist;
           }
        
    

}

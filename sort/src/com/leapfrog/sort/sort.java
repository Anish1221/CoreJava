/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sort;

/**
 *
 * @author Annoyin
 */
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num={2,1,5,15,7,4,12};
        
        
        for (int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                    
                }
                
            }
        }
        for(int z=0;z<num.length;z++){
        System.out.println(num[z]);
                
    }
    }
}

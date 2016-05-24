/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annoyin
 */
public class mulsum {
    public static void main(String[] args){
    int sum=0,k;
       for(int i=1;i<=10;i++){
           for(int j=1;j<=10;j=j+2){
               k=i*j;
               sum=sum+k;
               System.out.println(i+"*"+j+"="+k);
        
          }
           System.out.println("sum="+sum);
       }
           
    }
          
}

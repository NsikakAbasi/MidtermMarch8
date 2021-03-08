/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * March 8th
 * @author srinivsi
 */
public class StausUser 
{
   public enum statusDetail{ZERO(0), ONE(1), TWO(2), THREE(3);
   
   private int num;
   
   statusDetail(int num){
       this.num = num;
   }
   public int getNum(){
       return num;
   }
   
   public void statusDetail(int code){
       statusDetail statCode = statusDetail.values()[code];
   
switch(statCode)
        {
        case ZERO: System.out.println("REJECTED");
        break;
        case ONE: System.out.println("PENDING");
        break;
        case TWO:
        System.out.println("PROCESSING");
        break;
        case THREE: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
   }
}
 
}

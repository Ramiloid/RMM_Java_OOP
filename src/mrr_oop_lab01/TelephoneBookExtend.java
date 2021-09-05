/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrr_oop_lab01;

/**
 *
 * @author ADMIN
 */
public class TelephoneBookExtend extends TelephoneBook {
    
    public void IsThisOurClient(String NeedMan){
         
        if(NeedMan.equals(this.name)){
            System.out.println("Human finded");
        }
        else {
            System.out.println("This is not man u wan't found");
        }
        
    }
}


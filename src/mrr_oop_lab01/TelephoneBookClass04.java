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
abstract class TelephoneBookClass04 extends TelephoneBookMoreExtend  {
    
    
    public String IsThisOurAuthor(String NeedAuthor){
        if(NeedAuthor.equals(this.author)){
            return("It's him");
        }
        else{return("Try again, we don't have author like u want");}
    }
    
    @Override
    public void WriteAuthor(){
        System.out.println(this.author + " Hi it's author get from Class04");
    }
    
}

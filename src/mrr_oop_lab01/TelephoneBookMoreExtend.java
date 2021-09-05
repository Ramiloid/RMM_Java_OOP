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
abstract class TelephoneBookMoreExtend extends TelephoneBookExtend implements TelephoneBookMoreExtendInterface {
    
    
    public void WriteName(){
        System.out.println(this.name);
    }
    abstract String IsThisOurAuthor();
    public void WriteAuthor(){
        System.out.println(this.author);
    }
    
}

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
public class TelephoneBook {
    public String name = null;
    public String author = null;
    public String izdanie = null;
   
    
    public TelephoneBook(){
        this.name = " Not found";
        this.author = " Not found";
        this.izdanie = " Not found";
    }
    public TelephoneBook(String name){
        this.name = name;
        this.author = " Not found";
        this.izdanie = " Not found";
    }
     public TelephoneBook(String name,String author){
        this.name = name;
        this.author = author;
        this.izdanie = " Not found";
    }
     public TelephoneBook(String name,String author,String izdanie){
        this.name = name;
        this.author = author;
        this.izdanie = izdanie;
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getIzdanie(){
        return izdanie;
    }
    public void setIzdanie(String izdanie){
        this.izdanie = izdanie;
    }
    public void ToString(){
        System.out.print(this.name + " " + this.author + " " + this.izdanie);
    }
    
}

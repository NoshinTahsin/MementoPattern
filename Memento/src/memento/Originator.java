package memento;

import java.util.List; 
import java.util.ArrayList; 

public class Originator {
 
	    private String text; 
	   
	    public void set(String text)  
	    { 
	        System.out.println("Setting String to " + text); 
	        this.text = text; 
	    } 
	   
	    public Memento1 saveToMemento()  
	    { 
	        System.out.println("Saving string to Memento"); 
	        return new Memento1(text); 
	    } 
	   
	    public void restoreFromMemento(Memento1 memento)  
	    { 
	        text = memento.getSavedText(); 
	        System.out.println("String restored from Memento: " + text); 
	    } 
	   
	    public static class Memento1  
	    { 
	        private final String text; 
	   
	        public Memento1(String timeToSave)  
	        { 
	            text = timeToSave; 
	        } 
	   
	        public String getSavedText()  
	        { 
	            return text; 
	        } 
	    } 


}

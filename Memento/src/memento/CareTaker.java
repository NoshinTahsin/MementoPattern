package memento;


import java.util.List; 
import java.util.ArrayList; 

public class CareTaker {
	
	
	    
	    public static void main(String[] args)  
	    { 
	          
	        List<Originator.Memento1> savedString = new ArrayList<Originator.Memento1>(); 
	   
	        Originator memento = new Originator(); 
	   
	        //time travel and record the eras 
	        memento.set("MIT"); 
	        savedString.add(memento.saveToMemento()); 
	        memento.set("Cambridge"); 
	        savedString.add(memento.saveToMemento()); 
	        memento.set("Carnegie Mellon"); 
	         
	   
	        memento.restoreFromMemento(savedString.get(0));    
	   
	    } 
	
}

package com.serializableTest3;

import java.io.Serializable;

public class SubClasa extends SuperClasa implements Serializable {

		private static final long serialVersionUID = 1L;
		private String name;
		
	  
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	     
	    @Override
	    public String toString(){
	        return "SubClass{id="+getId()+",value="+getValue()+",name="+getName()+"}";
	    }
	
}

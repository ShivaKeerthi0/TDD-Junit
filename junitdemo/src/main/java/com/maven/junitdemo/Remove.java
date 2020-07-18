package com.maven.junitdemo;

public class Remove {

	public String modify(String s) {
		
		String res=s;
        if(s.length()>1)
        {
        if(s.charAt(0)=='A' && s.charAt(1)=='A')
        {
            res=s.substring(2,s.length());
        }      
        else if(s.charAt(0)=='A')
        {
            res=s.substring(1,s.length());
        }
        else if(s.charAt(1)=='A')
        {
            res=s.charAt(0)+s.substring(2,s.length());
        }
        else
        {
        res=s;
        }
        
        }
        else
        {
        	if(s.charAt(0)=='A') {
        		res="";
        	}
        	else
        	{
        		res=s;
        	}
        }

		return res;
		
		
	}

}

package com.maven.junitdemo;

public class Remove {

	public String modify(String a) {
		
		String result=a;
        if(a.length()>1)
        {
        if(a.charAt(0)=='A' && a.charAt(1)=='A')
        {
            result=a.substring(2,a.length());
        }      
        else if(a.charAt(0)=='A')
        {
            result=a.substring(1,a.length());
        }
        else if(a.charAt(1)=='A')
        {
            result=a.charAt(0)+a.substring(2,a.length());
        }
        else
        {
        result=a;
        }
        
        }
        else
        {
        	if(a.charAt(0)=='A') {
        		result="";
        	}
        	else
        	{
        		result=a;
        	}
        }

		return result;
		// TODO Auto-generated method stub
		
	}

}

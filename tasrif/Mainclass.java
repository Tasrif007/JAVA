/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasrif;

import java.util.*;
public class Mainclass {

	public static void main(String[] args) throws Experiment {
		  try{
	            Myexception m = new Myexception();
	            Scanner p = new Scanner(System.in);
	            System.out.println("Enter the value: ");
	            int n = p.nextInt();
	            m.compute(n);
	            
	        }
	        catch(Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	       
	    }
	    
	    
	     
	}

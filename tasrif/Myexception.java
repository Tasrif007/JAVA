/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasrif;

public class Myexception {
	void compute(int n)
	throws Experiment
	{
			if(n<100 || n>500)
				throw new Experiment("well caught");
		
	}
	

}

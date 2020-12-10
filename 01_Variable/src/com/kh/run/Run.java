package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.D_Cast;
import com.kh.variable.E_Overflow;
import com.kh.variable.F_printf;

public class Run {

	public static void main(String[] args) {
		
		String line = "-------------------------------";
		
		A_Variable var = new A_Variable(); // A_Variable 梓端持失
		// var.printValue();
		// var.declareVariable();
		// var.initVariable();
		
		//System.out.println(line);
		B_KeyboardInput input = new B_KeyboardInput(); // B_KeyvoartInput 梓端持失
		//input.inputScanner1();
		
		//System.out.println(line);
		//input.inputScanner2();
		
		System.out.println(line);
		//input.inputScanner3();
		
		//System.out.println(line);
		D_Cast cast = new D_Cast();
		// cast.rule1();
		// cast.rule2();
		//cast.dataLoss();
		
		E_Overflow e = new E_Overflow();
		//e.overflow();
		// e.calc();
		
		F_printf printf = new F_printf();
		printf.printfMethod();
		
		
		
	}

}

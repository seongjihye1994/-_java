package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Triple;

public class Run {

	public static void main(String[] args) {
		
		A_LogicalNegation ln = new A_LogicalNegation();
		//ln.method1();
		
		B_InDecrease id = new B_InDecrease();
		//id.method1();
		
		C_Arithmetic ar = new C_Arithmetic();
		//ar.method1();
		
		D_Comparison co = new D_Comparison();
		//co.method1();
		
		E_Logical log = new E_Logical();
//		log.method1();
//		log.method2();
//		log.method3();
//		log.method4();
		
		F_Compound cp = new F_Compound();
//		cp.method1();
		
		G_Triple tri = new G_Triple();
		//tri.method1();
//		tri.method2();
		tri.method3();

	}

}

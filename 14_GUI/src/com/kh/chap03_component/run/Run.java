package com.kh.chap03_component.run;

import com.kh.chap03_component.view.A_TextField;
import com.kh.chap03_component.view.B_TextArea;
import com.kh.chap03_component.view.C_TextTest;
import com.kh.chap03_component.view.D_RadioButton;
import com.kh.chap03_component.view.E_CheckBox;
import com.kh.chap03_component.view.F_ImageLabel;
import com.kh.chap03_component.view.G_ComboBox;
import com.kh.chap03_component.view.H_List;
import com.kh.chap03_component.view.I_Spinner;
import com.kh.chap03_component.view.J_Slider;
import com.kh.chap03_component.view.K_Dialog;

public class Run {

	public static void main(String[] args) {
		
		A_TextField a = new A_TextField();
//		a.textFieldTest();
		
		B_TextArea b = new B_TextArea();
//		b.textAreaTest();
		
		C_TextTest c = new C_TextTest();
//		c.loginFrame();
		
		D_RadioButton d = new D_RadioButton();
//		d.radioButtonTest();
		
		E_CheckBox e = new E_CheckBox();
//		e.CheckBoxTest();
		
		F_ImageLabel f = new F_ImageLabel();
//		f.imageLabelTest();
		
		G_ComboBox g = new G_ComboBox();
//		g.comboBoxTest();
		
		H_List h = new H_List();
//		h.listTest();
		
		I_Spinner i = new I_Spinner();
//		i.spinnerTest();
		
		J_Slider j = new J_Slider();
//		j.sliderTest();
		
		K_Dialog k = new K_Dialog();
		k.dialogTest();
		
		

	}

}

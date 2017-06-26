package com.practice.singleton;

import java.io.IOException;

public class MyClassTwo {
	public static void main(String[] args) throws IOException {
		/*MySingleTon st = new MySingleTon();
		System.out.println("Hash code is : "+st.hashCode());
		MySingleTon st1 = new MySingleTon();
		System.out.println("Hash code is : "+st1.hashCode());*/
		
		System.out.println(MySingleTon.getIstance().hashCode());
		System.out.println(MySingleTon.getIstance().hashCode());
		MySingleTon.getIstance().display("Welcome to My class");
	}
}

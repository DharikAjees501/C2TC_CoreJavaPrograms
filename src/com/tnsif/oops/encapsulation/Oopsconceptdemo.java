package com.tnsif.oops.encapsulation;

public class Oopsconceptdemo {
	//VAR declaration
		private int SerialNum; // integer ,string, boolean,float
		private  String name;
		private int age;
		
		// getter and setter method
		public int getSerialNum() {
			return SerialNum;
		}
		public void setSerialNum(int serialNum) {
			SerialNum = serialNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "OopsConceptDemo [serial Number =" + SerialNum + ","+ "name ="+ name + ", " + "age =" + age + "]";
		
		
	}

	}

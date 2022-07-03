package com.gl.departmentserviceMain;

import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HRDepartment;
import com.gl.departmentservice.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment d1 = new AdminDepartment();
		HRDepartment    d2 = new HRDepartment();
		TechDepartment  d3 = new TechDepartment();
		
		System.out.println("Welcome to the "+d1.departmentname());//AdminDepartment
		System.out.println("getTodaysWork");
		System.out.println("getWorkDeadline");
		System.out.println("isTodayaHoliday \n ");
		
		
		System.out.println("Welcome to the "+d2.departmentname());//HRDepartment
		System.out.println("Fill todays worksheet and mark your attendance");
		System.out.println("complete by EOD");
		System.out.println("team lunch");
		System.out.println("isTodayaHoliday \n");
		
		
		System.out.println("Welcome to the "+d3.departmentname());//TechDepartment
		System.out.println("complete coding of module 1");
		System.out.println("complete by EOD");
		System.out.println("Core Java");
		System.out.println("isTodayaHoliday \n");
		


	}

}

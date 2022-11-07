package com.xworkz.casting.boot;

import com.xworkz.casting.things.*;

public class DoctorRunner {

	
	public static void main(String[] args) {
		

		Dentist doctor = new Dentist();   // if we make a copy of child class with same class datatype,it will call both the constructor and properties of both parent and child class can be accessed
		System.out.println(doctor.name);
		System.out.println(doctor.age);
		System.out.println(doctor.hospital);
		System.out.println(doctor.fees);
		
		

		Doctor doctor1 = new Dentist(); // if we make a copy of child class with parent class datatype,it will call both the constructor but only the properties of parent class can be accessed
		System.out.println(doctor1.name);
		System.out.println(doctor1.age);
		
		//  in order to access properties of child class ,casting is done
		
		Dentist doc=(Dentist)doctor1; // -->casting: conversion of parent class ref   to child class ref
		System.out.println(doc.hospital);
		System.out.println(doc.fees);
		
		Doctor ent=new ENT();
		System.out.println(ent.name);
		System.out.println(ent.age);
		
		ENT ent1=(ENT)ent;
		System.out.println(ent1.operation);
		System.out.println(ent1.hours);
		
		Doctor cardio=new Cardiologist();
		System.out.println(cardio.name);
		System.out.println(cardio.age);
		
		Cardiologist cardio1=(Cardiologist)cardio;
		System.out.println(cardio1.disease);
		System.out.println(cardio1.assistants);
		


	}

}

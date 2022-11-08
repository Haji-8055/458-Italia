package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.BirthdayInvitation;

public class InvitationRunner {

	public static void main(String[] args) {
		
		BirthdayInvitation bday=new BirthdayInvitation("on call", "Furqan ", false);
		System.out.println(bday.type);
		System.out.println(bday.inviter);
		System.out.println(bday.isGood);

		
	}

}

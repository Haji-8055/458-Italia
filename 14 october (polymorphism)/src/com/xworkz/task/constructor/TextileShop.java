package com.xworkz.task.constructor;

public class TextileShop {

	public String ownerName;
	public String ownerwifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWives;
	public int shopNo;
	public long contactNo;

	public TextileShop() {

	}

	public TextileShop(String ownerName, String ownerwifeName, String ownerDaughterName, long ownerDaughterNumber,int ownerNoOfWives, int shopNo, long contactNo)
	{
		this(ownerName, ownerwifeName, ownerDaughterName, ownerDaughterNumber, ownerNoOfWives, shopNo);
		this.contactNo = contactNo;
	}

	public TextileShop(String ownerName, String ownerwifeName, String ownerDaughterName, long ownerDaughterNumber,
			int ownerNoOfWives, int shopNo) 
	{
		this(ownerName, ownerwifeName, ownerDaughterName, ownerDaughterNumber, ownerNoOfWives);
		this.shopNo = shopNo;
	}

	public TextileShop(String ownerName, String ownerwifeName, String ownerDaughterName,long ownerDaughterNumber,int ownerNoOfWives)
	{
		this(ownerName, ownerwifeName, ownerDaughterName, ownerDaughterNumber);
		this.ownerNoOfWives = ownerNoOfWives;
	}
	
	public TextileShop(String ownerName, String ownerwifeName, String ownerDaughterName,long ownerDaughterNumber)
	{
	this(ownerName, ownerwifeName, ownerDaughterName);
	this.ownerDaughterNumber = ownerDaughterNumber;
    }
	
	public TextileShop(String ownerName, String ownerwifeName,long ownerDaughterNumber)
	{
	this(ownerName, ownerwifeName);
	this.ownerDaughterNumber = ownerDaughterNumber;
    }
	
	public TextileShop(String ownerName, String ownerwifeName, String ownerDaughterName)
	{
	this(ownerName, ownerwifeName);
	this.ownerDaughterName = ownerDaughterName;
    }
	
	public TextileShop(String ownerName, String ownerwifeName)
	{
	this(ownerName);
	this.ownerwifeName = ownerwifeName;
    }
	
	
	public TextileShop(String ownerName)
	{
	this();
	this.ownerName=ownerName;

    }


}

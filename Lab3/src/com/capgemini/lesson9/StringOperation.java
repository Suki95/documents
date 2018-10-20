package com.capgemini.lesson9;

import java.util.Scanner;

class string
{
	String object;
	private Scanner sC;
	string()
	{
		sC = new Scanner(System.in);
		System.out.print("Enter String: ");
		object=sC.nextLine();
	}
	void stringAdd()
	{
		String c=object+object;
		System.out.println("Concatenated String is: " +c);
	}
	void replaceOdd()
	{
		String replace = null;
		replace=object;
		for(int i=1;i<=replace.length();i++)
		{
			if(i%2!=0)
			{
				replace=replace.substring(0,i-1)+ "#" +replace.substring(i,replace.length());
			}
		}
		System.out.println("Replaced String is: " +replace);
	}
	String removeDuplicateChars()
	{
		char[] chararray= object.toCharArray();
		String finalStr="";
		for(char value : chararray)
		{
			if(finalStr.indexOf(value)==-1)
			{
				finalStr+=value;
			}
		}
		return finalStr;
	}
	void oddUpperCase()
	{
		String odd=null;
		odd=object;
		System.out.println("Upper Cased String is: ");
		for(int i=0;i<odd.length();i++)
		{
			char ch=odd.charAt(i);
			if(i%2!=0)
			{
			    ch = Character.toLowerCase(ch);
			}
			
			else
			{
			    ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
		
	}
	boolean positiveString()
	{
		String pos=null;
		pos=object;
		char[] chars=pos.toCharArray();
		boolean alphabetical = false;
		for(int i=0;i<(pos.length()-1);i++)
		{
		if(chars[i]<=chars[i+1])
		{
			alphabetical=true;
			System.out.println(alphabetical);
		}
		else if(chars[i]>chars[i+1])
		{
			alphabetical=false;
			System.out.println(alphabetical);
			break;
		}	
		}
	return alphabetical;
	}
	}

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string obj=new string();
		String removeChar=new String();
		int choice=0;
		char c;
		Scanner sC=new Scanner(System.in);
		for(;;)
		{
		System.out.println("Enter choice(1/2/3/4):"
				+ "\n1.Add string to itself "
				+ "\n2.Remove odd positios with #"
				+ "\n3.Remove duplicate characters in the String"
				+ "\n4.Change odd characters to upper case");
		
		choice=sC.nextInt();
		switch(choice)
		{
		case 1:
			obj.stringAdd();
			break;
		case 2:
			obj.replaceOdd();
			break;
		case 3:
			removeChar=obj.removeDuplicateChars();
			System.out.println("Removed Letters String is: " +removeChar);
			break;
		case 4:
			obj.oddUpperCase();
			break;
		default:
			break;
		}
		}
	}

}

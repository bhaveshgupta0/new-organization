package org.big.lambda;

public class Program2 {

	public static void main(String[] args)
	{
		UserValidator minLenthV2=(String string1)->
		
		{if(string1.length()>5)
			return true;
		else
			return false;
			
		};
		
		System.out.println(minLenthV2.isValid("Bhavesh"));
		
		UserValidator specialCharacter=(String string1)->
				{
					char[] special= {'@','$','#','%'};
			for(int iTmp=0;iTmp<special.length;iTmp++)
				if(string1.indexOf(special[iTmp])!=-1)
					return true;
			
					return false;
			
				
				};
				System.out.println(specialCharacter.isValid("Bhavesh@"));
				
				
				UserValidator specialCharacterNV2=(String string1)->
				{
					if(minLenthV2.isValid(string1)&& specialCharacter.isValid(string1)) {
						return true;
					}
					
					return false;
				};
				
				System.out.println(specialCharacterNV2.isValid("Bhav@esh"));
	}

}

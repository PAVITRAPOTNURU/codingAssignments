package com.pi.product;
class Repository{
	static String getCountryName(String countryCode) throws InvalidCodeException{ 
		String country = null;
//70 to 99  -India
		int cc=Integer.parseInt(countryCode);
		if(cc>=70 && cc<=99)
			country="India";
//908 = US
		else if(cc==908)
			country="US";
//011      -Dial somewhere outside of USA 
		else if(countryCode.equals("011"))
			country="Dail somewhere outside of USA";
// No country with given code found
		else
		{
			try{
				throw new InvalidCodeException("Enter a validcode");
			}catch(InvalidCodeException e){
				country="No country with given code";
			}
				
		}	
		return country;

 }
	
}

public  class RepositoryImplementation {
	
	public static void main(String[] args)throws InvalidCodeException {
		Repository r=new Repository();
		System.out.println("country code between 70 to 99"+"  "+r.getCountryName("78"));
		System.out.println("country code of 908" +"   "+r.getCountryName("908"));
		System.out.println(r.getCountryName("011"));
		System.out.println(r.getCountryName("123"));
	
	}
}



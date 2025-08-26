import java.util.Scanner; 
class swiggy
{
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String []args) throws Exception
	{
		System.out.println("\t\t\t====!WELCOME TO SWIGGY!====");
		
		System.out.println();
		System.out.println("\t\t\t\t ...SIGNUP...");
		
		System.out.print("Enter Your Phone Number :");
		Long phone = scan.nextLong();
		scan.nextLine();
		System.out.print("Enter Your Own Password :");
		String pass = scan.nextLine();
			
			System.out.println();
			
		System.out.println("OTP GENERATING......");
		Thread.sleep(3000);
		System.out.println("Otp Generated");
		
		int otp_generate =(int)(Math.random()*9999+9999);
			System.out.println(otp_generate);
			
			System.out.print("Enter Your Otp :");
			int enter_otp = scan.nextInt();
			
			if (enter_otp==otp_generate)
			{
				System.out.println("Redirect To Login Page......");
				Thread.sleep(3000);
			}
			
			else{
				System.out.println("Invalid Otp!!!");
			}
			
			
			System.out.println("...LOGIN...");
			
			System.out.print("Enter Your Registered Mobile Number :");
			Long reg_phone = scan.nextLong();
			
			
			
			if (reg_phone.equals(phone))
			{
				scan.nextLine();
				System.out.print("Enter Your Password :");
				String reg_pass = scan.nextLine();
				
				if (reg_pass.equals(pass))
				{
					
					System.out.println("*_|.......Login Successfull......|_*");
					Thread.sleep(3000);
					System.out.println("***************==WELCOME TO SWIGGY==***************");
				}
				else{
				   System.out.println("Wrong password!!!");	
				}
			}
			else {
				System.out.println("invalid Mobile Number!!!");
				
			}
			
			
			
			
			
			
		
		
		
		
		
	}
	
}
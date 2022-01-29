interface Bank {
  
  int accountno=1234;  // interface varible is by default static 
   void userinfo(); 
  
}


class Test implements Bank{
  
  public void userinfo(){
    
    System.out.println("user info");
    
  }
  
  public static void main(String [] args ){
    
	Test t = new Test();
	t.userinfo();
	System.out.println(Bank.accountno);  // Static varible directly call with using class name
   
    
    
  }
  
}
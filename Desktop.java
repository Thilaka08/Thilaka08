package week3.day2;

public class Desktop implements Software

{
public void desktopmodel()
{
	System.out.println("i3 processor");

}

                                              
public void hardwareResource() {            
System.out.println("1GB harddrive");      
	                                        
}                                           
                                            
public void softwareResources()
{           
System.out.println("windows 10");      
}


public static void main(String[] args)
{     

Desktop soft = new Desktop();            
soft.hardwareResource();                 
 soft.softwareResources();                
soft.desktopmodel();                     
                 	}                                            
	}                                                             



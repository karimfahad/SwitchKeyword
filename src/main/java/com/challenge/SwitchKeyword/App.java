package com.challenge.SwitchKeyword;

/**
 * Hello world!
 * byte, short, char, int and java 7 also support String
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	printDayOftheWeek(2);
    	
    	char switchVariable = 'D';
        
        switch(switchVariable){
        
        case 'A':
        	System.out.println("this is " + switchVariable);
        	break;
        	
        case 'B':
        	System.out.println("this is " + switchVariable);
        	break;
        	
        case 'C': case 'D': case 'E':
        	System.out.println("this is " + switchVariable);	
        	break;
        	
        default:
        	System.out.println("Not defined ");
        	break;
        }
        
        String switchString = "Jan";
        
        switch(switchString.toLowerCase()){
        
        case "jan":
        	System.out.println("this is " + switchString);
        	break;
        	
        case "feb":
        	System.out.println("this is " + switchString);
        	break;
        	
        case "mar": case "apr": case "may":
        	System.out.println("this is " + switchString);	
        	break;
        	
        default:
        	System.out.println("Not defined ");
        	break;
        }
        
       
        	
    }
    
    
		public static void printDayOftheWeek (int day){
	
			switch(day){
				case 1:
					System.out.println("this is Sunday");
					break;
				case 2:	
					System.out.println("this is Monday");
					break;
				case 3:	
					System.out.println("this is Tuesday");
					break;
				default: 	
					System.out.println("Not defined ");
					break;
			}
		}		
}

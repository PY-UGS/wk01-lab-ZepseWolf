public class Question1{

    public static void main( String[] args){
        System.out.println("Hello, I am Kai Cong");
        String course = "CSC1009"; 
        System.out.println("====Start switch====");
        switch(course)   
        {   
            case "CSC1006":   
                System.out.println("Course 1006"); 
                break;   
            case "CSC1007":   
                System.out.println("Course 1007"); 
                break;   
            case "CSC1008":   
                System.out.println("Course 1008"); 
                break;   
            case "CSC1009":   
                System.out.println("Object-Oriented Programming"); 
                break;
            case "CSC2902":   
                System.out.println("Course CSC2902"); 
                break;      
            default:    
                System.out.println("No such course!"); 
                break;   
        }   
        System.out.println("====End switch====");   
        System.out.println("====Start loop====");   
        for(int x = 101; x > 66 ; x = x-2){
            System.out.println(x);   
        }
        System.out.println("====End loop====");   
    } 
}
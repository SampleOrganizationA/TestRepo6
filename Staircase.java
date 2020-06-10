import java.io.*; 
  
  
class GFG { 
      
    // Function definition 
    static void pattern(int n) 
    { 
        // for loop for rows 
        for (int i = 1; i <= n; i++) { 
      
            // conditional operator 
            int k ; 
              
            if(i % 2 != 0) 
                k = i + 1 ; 
            else 
                k = i ; 
      
            // according to value of k carry 
            // out further operation 
            for (int j = 0; j < k; j++) 
                System.out.print(" * "); 
            System.out.println(); 
        } 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 6; 
        pattern(n); 
    } 
} 
  
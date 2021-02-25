package pattern1;

public class Pattern1 {

    public static void main(String[] args) {
        
        int line=5;
        
        for (int row=1; row<=line; row++){  // this loop is used to print the rowes  
            for (int num=line; num>=1; num--){   // this loop is used to print the numberss  
                if (row!=num){
                    System.out.print(num);
                }
                else {
                System.out.print("*");
                }
            }
            System.out.println("");
        }                
    }    
}
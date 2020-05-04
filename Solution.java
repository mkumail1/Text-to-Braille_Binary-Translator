import java.util.Scanner;

public class Solution{
    
    public static String solution(String s)
    {
        char alphas[] = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z'};
                      
        int ba[][] = new int[][] {{1,0,0,0,0,0}, {1,1,0,0,0,0}, {1,0,0,1,0,0}, {1,0,0,1,1,0}, {1,0,0,0,1,0}, {1,1,0,1,0,0}, {1,1,0,1,1,0}, {1,1,0,0,1,0}, {0,1,0,1,0,0}, {0,1,0,1,1,0}, {1,0,1,0,0,0}, {1,1,1,0,0,0}, {1,0,1,1,0,0}, {1,0,1,1,1,0}, {1,0,1,0,1,0}, {1,1,1,1,0,0}, {1,1,1,1,1,0}, {1,1,1,0,1,0}, {0,1,1,1,0,0}, {0,1,1,1,1,0}, {1,0,1,0,0,1}, {1,1,1,0,0,1}, {0,1,0,1,1,1}, {1,0,1,1,0,1}, {1,0,1,1,1,1}, {1,0,1,0,1,1}};

        String str = "";
        
        for (int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == ' '){
                
                str += "000000";
                
            } 
            
            else {
                
                for (int x=0; x < ba.length; x++){
                    
                    if(Character.toUpperCase(s.charAt(i)) ==  alphas[x]){
                        
                        if(Character.isUpperCase(s.charAt(i))){
                            str += "000001";
                        }
                        
                        for(int y=0; y < 6; y++){
                            str += ba[x][y];
                        }
                    
                    break;
                
                    }
                }
            }
        }
        
        return str;
    }    
        
     public static void main(String []args){

         Scanner in = new Scanner(System.in);
        
        System.out.println("Input:\n");
        String str = in.nextLine();

        System.out.println("Output:\n" + Solution.solution(str)); 
     }
     
}

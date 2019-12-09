
package pyramid;


public class Pyramid {
    public int pyramid(int a){
        
                int rows = 4;
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }   
        int line = 3;
        for(int i = line; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
               {
                System.out.print("* ");
                }
               
            }
            System.out.println();
        }
      return a;
    }
    public void pyramid(){
    
        int rows=4;
        int q=1;
        int w=1;
    while(q<=rows){  
    System.out.println();  
    ++q;  
    }
    int lines =3; 
    while(w<=rows){  
    System.out.println();  
    w--;  
    }
    return ;
    }
    public void pyramid(byte a){
        int rows=4;  
        int z=1;
        do{  
        System.out.println();  
        z++;     
        }while(z<=rows);
    
    int lin=3;  
        int x=1;
        do{  
        System.out.println();  
        x--;     
        }while(x<=rows);
}
    
    public static void main(String[] args) {
        
        Pyramid p = new Pyramid();
        System.out.println(p.pyramid(0));
        System.out.println(p.pyramid(1));
        System.out.println(p.pyramid(2));
        
    }
}   
   
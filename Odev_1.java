/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayrik_yapilar;


/**
 *
 * @author Muaz Ahmed
 */
public class Odev_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int add=0;
         int [][]a={{68,52,45,93,88},{76,58,84,53,64},{71,65,96,75,65},{87,55,75,52,94},{72,85,85,50,96}};
        for (int l = 0; l < a.length; l++) {
            for (int k = 0; k < a[l].length; k++) {
                if(add%6==0)
                    {
                        System.out.println(" ");
                        System.out.print(a[l][k]+"  ");
                        add++;
                    }
                else
                    System.out.print(a[l][k]+"  ");
                    add++;
            }
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        for ( int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
              
                if(a[i][j]%2==0)
                    if(add%5==0)
                    {
                        System.out.println(" ");
                        System.out.print(a[i][j]+"  ");
                        add++;
                    }
                    else{
                    System.out.print(a[i][j]+"  ");
                    add++;}
                
            }
        }
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < a[m].length; n++) {
                if(a[m][n]%2!=0)
                    if(add%5==0){
                        System.out.println(" ");
                        System.out.print(a[m][n]+"  ");
                        add++;
                    }
                    else{
                    System.out.print(a[m][n]+"  ");
                    add++;}
            }
        }
        System.out.println("");
    }
    
}

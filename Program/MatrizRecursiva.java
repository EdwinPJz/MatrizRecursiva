
package matrizrecursiva.matrizrecursiva;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author HP15DW004LA
 */
public class MatrizRecursiva {

    public static void main(String[] args) {
        int[][] m = {
            {0,2,3,9,5},
            {3,8,6,7,8},
            {7,2,9,2,7},
        };
        
        RecorrerMatriz(m,0,0);
    }
    public void LlenarMatriz(int[][]m, int i, int j) throws IOException{//No me salió :((
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada;
        System.out.println("Ingrese valor: ");
        entrada = br.readLine();
        
        System.out.print(m[i][j]+"    ");
        
        if(i!=m.length-1 || j!=m[i].length-1){
            if(j==m[i].length-1){
                i++;
                j=0;
                System.out.println("  ");
            }else{
                j++;
            }
            LlenarMatriz(m,i,j);
        }
    }
    
    public static void RecorrerMatriz(int[][] m, int i, int j){
        System.out.print(m[i][j]+"    ");
        
        if(i!=m.length-1 || j!=m[i].length-1){
            if(j==m[i].length-1){
                i++;
                j=0;
                System.out.println("  ");
            }else{
                j++;
            }
            RecorrerMatriz(m,i,j);
        }
        
    }
}



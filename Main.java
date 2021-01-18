package intercambiovalores;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {        
        int matriz [][] = FormaMatriz();
        int matriz_c [][] = IntercambiaValores(matriz);
    }
    
    public static int [][] FormaMatriz()
    {
        int numeros[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz Original: ");
        String filas = "";
        for(int i = 0; i < 4; i++)
        {
            filas = "";
            for(int j = 0; j < 4; j++)
            {
                filas = filas +" "+numeros[i][j];
            }
            System.out.println(filas);
        }
        return numeros;
    }
   
    public static int [][] IntercambiaValores(int nums [][])
    {
        int temp [] = new int[4];
        
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(i == 0)
                {
                    //Se guardan los elementos que corresponden a la primer fila de la matriz.
                    temp[j] = nums[i][j];
                    //Se cambian los valores de la 1er columna a la primer fila
                    nums[i][j] = nums[j][i];
                }
            }
        }
        
        for (int i = 0; i < 4; i++)
        {
            nums[i][0] = temp[i];
        }
        
        //Se imprime la matriz
        
        System.out.println("Matriz modificada: ");
        
        String fil = "";
        
        for(int i = 0; i < nums.length; i++)
        {
            fil = "";
            for(int j = 0; j < nums.length; j++)
            {
               fil = fil + " "+nums[i][j]; 
            }
            System.out.println(fil);
        }
        
        return nums;
    }
}

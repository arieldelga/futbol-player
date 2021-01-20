import java.util.Scanner;


public class Arreglos {
    
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int a[], tamaño1;
        int b[], tamaño2;
        int c[];
    
        System.out.println("Digite el tamaño del primer arreglo: ");
        tamaño1 = entrada.nextInt();
    
        a = new int [tamaño1];
        for (int i=0;i<a.length;i++){
            System.out.println("LLenando el arreglo ");
            System.out.print("Ingrese el elemento "+(i+1)+": ");
            a[i] = entrada.nextInt();
        }
        System.out.println("Digite el tamaño del segundo arreglo: ");
        tamaño2 = entrada.nextInt();
    
        b = new int [tamaño2];
        for (int i=0;i<b.length;i++){
            System.out.println("LLenando el arreglo ");
            System.out.print("Ingrese el elemento "+(i+1)+": ");
            b[i] = entrada.nextInt();
        }

        //Creando el tercer arreglo
        c = new int[a.length+b.length];
        c = a;
        int i=a.length;
        while(i<c.length){
            for(int j=0;j<b.length;j++){
                if(!existe(b[j], c)){
                    c[i]=b[j];
                    i++;
                }    
            }
        }
    }
    
    private static boolean existe(int num, int[] nums){
        boolean x = false;
        for(int i=0; i<nums.length; i++){
            if(num == nums[i]){
                x = true;
            }
        }
        return x;
    }
}

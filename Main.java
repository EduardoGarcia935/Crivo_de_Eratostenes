import java.util.Scanner;

public class Main {

    public static  boolean[] crivoEratostenes(int n){
        
       boolean[] valores = new boolean[n];

       for(int i = 2 ; i < n ; i ++){
           valores[i] = true;
       }

       for(int i = 2 ; i < n ; i ++){

            if(valores[i] == true){
                for(int j = i ; i*j < n ; j ++){
                    valores[i*j] = false;
                }
            }
       }

        return valores;

    }

    private static void mostrar(boolean[] primos) {
        for(int i = 2 ; i < primos.length ; i ++){
            if(primos[i] == true){
                System.out.println(i);
            }
        }
    }

    //Main
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        try {
            System.out.print("Digite o valor maximo do intervalo de numeros primos: ");
            int x = leia.nextInt();

            System.out.print("\n");

            boolean[] primos = crivoEratostenes(x);
            mostrar(primos);

            //Fechando o Objeto
            leia.close();

            //Tratando erros
        } catch (Exception e) {
            System.out.println("Digite um valor valido");
        }     
    }
}

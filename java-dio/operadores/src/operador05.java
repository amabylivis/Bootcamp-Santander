public class operador05 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        
        System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " +simNao);

        simNao = numero1 >= numero2;
        System.out.println("numeroUm é maior ou igual que numeroDois? " + simNao);
    }
}

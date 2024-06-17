public class Classe01 {

    public static void main(String[] args) {
        String primeiroNome = "Amabyli";
        String segundoNome = "Visnheski";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}

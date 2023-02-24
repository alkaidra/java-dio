package Program;

public class anatomia {
    public static void main(String[] args) {

        String primeiroNome = "Vitor";
        String segundoNome = "Bruno";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Nome completo: " + primeiroNome + " " + segundoNome;
    }
}

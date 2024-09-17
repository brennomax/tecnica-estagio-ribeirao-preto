package questao2;

public class VerificaString {
    int cont = 0;
    int validarA(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                cont++;
            }
        }
        return cont;
    }
}

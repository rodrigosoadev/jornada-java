package src.javacore.Cintermediario.Gregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que não for digito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracters excluindo os brancos
        // \w = todos os digitos a-ZA0Z
        // \W = tudo o que não for incluso no \w
        String regex = "\\W";
      //  String texto = "abaaba";
        String texto2 = "hhj 212gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}

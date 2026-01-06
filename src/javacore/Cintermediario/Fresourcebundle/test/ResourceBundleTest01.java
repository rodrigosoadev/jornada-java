package src.javacore.Cintermediario.Fresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("src.javacore.Cintermediario.Fresourcebundle.test.mensagem",
                new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println("-----------");
        ResourceBundle bundle1 = ResourceBundle.getBundle("src.javacore.Cintermediario.Fresourcebundle.test.mensagem",
                new Locale("pt", "BR"));

        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("good.morning"));
    }
}

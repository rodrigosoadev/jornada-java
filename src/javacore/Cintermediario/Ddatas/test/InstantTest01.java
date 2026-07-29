package javacore.Cintermediario.Ddatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); // Instant é trabalhado com nano segundos
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getNano()); // 999.999.999 se adicionar mais 1, vira 1 segundo.
    }
}
// Este arquivo demonstra Instant para representar timestamps em nanossegundos (UTC).

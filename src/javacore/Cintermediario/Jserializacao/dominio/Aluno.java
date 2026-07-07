package javacore.Cintermediario.Jserializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno  implements Serializable{
    @Serial
    private static final long serialVersionUID = 144444444L;
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;


    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            if (turma != null) {
                oss.writeBoolean(true);
                oss.writeUTF(turma.getNome());
            } else {
                oss.writeBoolean(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            boolean hasTurma = ois.readBoolean();
            if (hasTurma) {
                String nomeTurma = ois.readUTF();
                turma = new Turma(nomeTurma);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + ", Turma: " +turma;
    }



    public Turma getTurma() {
        return turma;
    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }



    public static long getSerialversionuid() {
        return serialVersionUID;
    }



    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
    
}

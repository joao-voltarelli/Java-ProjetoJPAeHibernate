import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // é uma entidade do banco
@Table(name="aluno") // vai criar a tabela com nome aluno
public class Aluno {
    @Id //id chave principal
    @GeneratedValue(strategy=GenerationType.IDENTITY) // id auto-increment
    private int id;
    
    @Column // cada atributo é uma coluna
    private String nome;
    @Column
    private String matricula;
    @Column
    private int idade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}

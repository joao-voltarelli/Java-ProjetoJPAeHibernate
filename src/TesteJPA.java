//utilizando o JPA e mapeando o MySql com Hibernate

import java.util.List;

public class TesteJPA {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setIdade(18);
        a1.setMatricula("123456");
        
        Aluno a2 = new Aluno();
        a2.setNome("Jose");
        a2.setIdade(20);
        a2.setMatricula("456789");
        
        Aluno a3 = new Aluno();
        a3.setNome("Maria");
        a3.setIdade(30);
        a3.setMatricula("987654");
        
        //vai inserir o aluno no banco pois ja esta mapeado com hibernate
        
        /*AlunoController con = new AlunoController();
        con.salvar(a1);
        con.salvar(a2);
        con.salvar(a3);*/
        
        /*AlunoController con = new AlunoController();
        con.remover(a1);
        con.remover(a2);
        con.remover(a3);*/
    }
}

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AlunoController {
    
    EntityManagerFactory emf; // abrir uma sessão com o mysql
    EntityManager em;  // realizar as operações
    
    public AlunoController(){
        emf = Persistence.createEntityManagerFactory("aluno");
        em = emf.createEntityManager();
    }
    
    public void salvar(Aluno _aluno){
        em.getTransaction().begin(); // abre a transacao no banco
        em.merge(_aluno);
        em.getTransaction().commit(); // salva no banco o aluno passado por parametro
        emf.close(); // finaliza a sessao com o banco
    }
    
    public void remover(Aluno _aluno){
        em.getTransaction().begin();
        Query q = em.createNativeQuery("delete aluno from aluno where matricula =" + _aluno.getMatricula()); // apagando o aluno qndo a matricula é igual a matricula do aluno passado por parametro
        q.executeUpdate();
        em.getTransaction().commit(); // salva a transacao
        emf.close(); // finaliza a sessao com o banco
    }
    
    public List<Aluno> listar(){
        em.getTransaction().begin();
        Query consulta = em.createQuery("select aluno from Aluno aluno ");
        List<Aluno> lista = consulta.getResultList();
        em.getTransaction().commit();
        emf.close();
        return lista;
    }
}

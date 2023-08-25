import java.util.Date;
import java.util.List;

public class Professor extends Pessoa{

    public Professor(String nome, Date dataNascimento, String cpf, String telefone) {
        super(nome, dataNascimento, cpf, telefone);
    }
    public void verificarMatriculados(List<Aluno> a){
        for(Aluno al :a){
            System.out.println(al.getNome());
        }
    }
}

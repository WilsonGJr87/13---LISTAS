package Controller;

import Model.Aluno;
import java.util.ArrayList;
import java.util.List;
public class AlunoController {
    private List<Aluno> ListaAlunos;

    public AlunoController(){
        ListaAlunos = new ArrayList<Aluno>();
    }

    public void setAluno(Aluno a){
        ListaAlunos.add(a);
    }
    public Aluno getAluno(int index){
        return ListaAlunos.get(index);
    }
    public String mostrarAlunos(){
        StringBuilder sb = new StringBuilder();
        for(Aluno a :ListaAlunos){
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }
    public void removerAluno(int index) {
        if (index >= ListaAlunos.size() || ListaAlunos.get(index) == null)
            return;
        ListaAlunos.remove(index);        
    }
    public int pegarIndice(Aluno a) {
        return ListaAlunos.indexOf(a);
    }
    public void limparLista() {
        ListaAlunos.clear();
    }
    public void virarSemestre() {
        for (Aluno a : ListaAlunos) {
            a.setCiclo(a.getCiclo() + 1);
        }
    }
}

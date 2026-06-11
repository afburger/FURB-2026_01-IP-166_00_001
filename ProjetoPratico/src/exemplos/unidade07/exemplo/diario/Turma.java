package exemplos.unidade07.exemplo.diario;

public class Turma {

    Aluno[] alunos = new Aluno[15];

    boolean[][] listaPresenca = new boolean[15][10];

    public int adicionarAluno(int codigoMatricula, String nome) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                Aluno aluno = new Aluno();
                aluno.setId(i);
                aluno.nome = nome;
                aluno.codigoMatricula = codigoMatricula;
                alunos[i] = aluno;
                return i;
            }
        }
        return -1;
    }

    public void marcarPresencaParaTodos(int numeroAula) {
        for (int a = 0; a < listaPresenca.length; a++) {
            listaPresenca[a][numeroAula] = true;
        }
    }

    public void exibirDiario() {
        for (int a = 0; a < listaPresenca.length; a ++) {
            if (alunos[a] != null) {
                System.out.println("Aluno: " + alunos[a].nome);
                for (int p = 0; p < listaPresenca[a].length; p++) {
                    if (listaPresenca[a][p]) {
                        System.out.println("Aula["+ p + "] = Presente");
                    } else {
                        System.out.println("Aula["+ p + "] = Faltou");
                    }
                }
                System.out.println("#############");
            }
        }
    }


}

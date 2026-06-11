package exemplos.unidade07.exemplo.diario;

public class Escola {

    public static void main(String[] args) {
        Turma[] turmas = new Turma[10];

        // Cria a turma 1
        Turma turma1 = new Turma();
        turmas[0] = turma1;
        
        // Adiciona alunos na turma 1
        turma1.adicionarAluno(111, "André");
        turma1.adicionarAluno(222, "João");

        turma1.marcarPresencaParaTodos(0);

        // Cria a turma 2
        Turma turma2 = new Turma();
        turmas[1] = turma2;

        turma2.adicionarAluno(999, "Júlia");
        turma2.adicionarAluno(555, "Maria");
        turma2.adicionarAluno(777, "Pedro");

        turma2.marcarPresencaParaTodos(0);
        turma2.marcarPresencaParaTodos(1);
        
        turma1.exibirDiario();

        System.out.println("------------------ Troca de turma ------------------");

        turma2.exibirDiario();



    }

}

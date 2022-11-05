package pooexercicio11;

public class Principal {
    
    public static void main(String[] args) {
        //Aluno:
        Aluno al = new Aluno();
        
        al.setNome("David");
        al.setIdade(19);
        al.setCurso("Matematica");
        al.setSexo("M");
        al.setMatricula(11);
        al.fazerAniv();
        
        System.out.println("###Aluno###");
        al.pagarMensalidade();
        System.out.println(al.toString() + al.getCurso());
        System.out.println("###Aluno###" + "\n");
        
        //Bolsista:
        Bolsista bol = new Bolsista();
        
        bol.setNome("Jose");
        bol.setIdade(18);
        bol.setCurso("Ciencias");
        bol.setSexo("M");       
        bol.setMatricula(22);
        bol.setBolsa(500);
        
        System.out.println("###Bolsista###");
        System.out.println(bol.toString() + bol.toStringAluno() 
                         + bol.toStringBolsa());
        bol.pagarMensalidade();
        System.out.println("###Bolsista###" + "\n");
        
        
        //Professor:
        Professor prof = new Professor();
        
        prof.setNome("Joana");
        prof.setIdade(38);
        prof.setSalario(1500.5f);
        prof.setSexo("F");
        prof.setEspecialidade("Matematica");
        
        System.out.println("###Professor###");
        prof.receberAumento(1000);
        System.out.println(prof.toString() + prof.toStringProfessor());
        System.out.println("###Professor###" + "\n");
    }
}

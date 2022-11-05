package pooexercicio11;

public class tecnico extends Aluno {
    
    private int registroProfisional;
    
    public void praticar() {
        System.out.println("Tecnico praticando!");
    }

    public int getRegistroProfisional() {
        return registroProfisional;
    }

    public void setRegistroProfisional(int registroProfisional) {
        this.registroProfisional = registroProfisional;
    }
}

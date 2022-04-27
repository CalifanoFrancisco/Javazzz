//import java.security.Permissions;

public class Main {
    public static void main(String[] args) {
        
        Alumno uwu = new Alumno();
        
        uwu.agregarMateria("matematica");
        uwu.agregarMateria("lengua");
        
        uwu.agregarNota("lengua", 6.5f);
        uwu.agregarNota("lengua", 10.f);
        uwu.agregarNota("lengua", 7.f);

        uwu.agregarNota("matematica", 8.5f);
        uwu.agregarNota("matematica", 8.f);

        uwu.sayAllNotas("lengua");

        System.out.println("Promedio: " + uwu.promedioNotas("lengua"));
        System.out.println("Menor:    " + uwu.mayorNota("lengua"));
        System.out.println("Mayor:    " + uwu.menorNota("lengua"));


    }
}

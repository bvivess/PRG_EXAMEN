package EXAMEN;

import java.util.ArrayList;
import java.util.Arrays;

public class EX_1 { 
    static int NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
    static int NALIENS = UtilitatsConsola.llegirSencer("Nombre de Aliens: ");
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_NAU = 1;
    static final int SIMBOL_ALIEN = 9;

    public static void main(String[] args) {
        int[][] tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        ArrayList<int[]> aliens = new ArrayList<>();  // [[m,n][k,l]...[a,b]] --> posició dels aliens
        int[] nau = new int[2];  // [a,b] és la posició de la nau en el tauler 
        int accio;  // Acció a realitzar
        
        inicialitzaJoc(tauler, nau, aliens);
        
        do {
            mostrarTauler(tauler, nau, aliens);
            accio = UtilitatsConsola.llegirSencer("PUNTUACIÓ: xxxx, 4:ESQUERRA, 6:DRETA, 9: DISPAR, 0:SORTIR: ");

            executaAccio(tauler, nau, aliens, accio);

        } while (accio != 0);
    }
    
    public static void inicialitzaJoc( ... ) {

    }
    
    public static void executaAccio( ... ) { 

    }
 
    public static void mostrarTauler( ... ) {

    }
    
}

package examen;

import java.util.ArrayList;
import java.util.Arrays;

public class EX_1 { 
    static int NTAULER;
    static int NGLOBUS;
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_GLOBUS = 1;
    static final int SIMBOL_GLOBUS_EXPLOTAT = 9;
    static int[][] tauler;
    static ArrayList<int[]> globus = new ArrayList<>();
    static ArrayList<int[]> globusExplotats = new ArrayList<>();
    static int fila;
    static int columna;
    
    public static void main(String[] args) {
        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        NGLOBUS = UtilitatsConsola.llegirSencer("Nombre de globus: ");
        
        tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        emplenaTauler(globus);
        explotaGlobusEnDiagonals(globus, globusExplotats);
        
        do {
            mostrarTauler(tauler, globus, globusExplotats);
            
            fila = UtilitatsConsola.llegirSencer("Nro. Fila: ");
            columna = UtilitatsConsola.llegirSencer("Nro. Columna: ");
            explotaGlobusEnFilaColumna(globus, globusExplotats, fila, columna);
            System.out.println("Queden " + globus.size() + " globus. ");
            System.out.println("S'han explotat " +  globusExplotats.size() + " globus.");
            
            mostrarTauler(tauler, globus, globusExplotats);
        } while ( ... );  // mentre 'quedin globus'
    }
    
    /** ----------------------------------------------------------------
     * Ha d'emplenar l'ArrayList 'globus' amb 'NGLOBUS' posicions (x,y).
     */
    public static void emplenaTauler(ArrayList<int[]> globus ) {
        // ...
    }
    
    /** ----------------------------------------------------------------
     * Ha de situar els globus en el tauler, tenint en compte de mostrar els següents símbols:
     *    SIMBOL_GLOBUS 	 ? " * "
     *    SIMBOL_GLOBUS_EXPLOTAT ? " O "
     */
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {
        // ...
    }
    
    /** ----------------------------------------------------------------
     * ha de cercar els globus que estiguin en les diagonals principal i secundària: 
     *les ha d'eliminar de 'globus' i les ha de crear a 'globusExplotats'.
     *AJUDA: 
     *    ? diagonal principal ? posX = posY
     *    ? diagonal secundària ? posX + posY = NTAULER - 1
     */
    public static void explotaGlobusEnDiagonals(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {
         // ...
    }
    
    /** ----------------------------------------------------------------
     * ha de cercar els globus que estiguin en la 'fila' i la 'columna' indicada com a paràmetre.
     *    ? les ha d'eliminar de 'globus' i les ha de crear a 'globusExplotats'.
     */
    public static void explotaGlobusEnFilaColumna(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats, int fila, int columna) {
        // ...
    }

}
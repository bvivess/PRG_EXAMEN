package examen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        // Arxius per a la càrrega de dades:
        String arxiu = "C:\\temp\\EXAMEN.csv";
        String arxiuLog = "C:\\temp\\EXAMEN.log";
        
        // Estructures de memòria:
        Set<Client> clients = new HashSet<>();
        Set<Producte> productes = new HashSet<>();
        Map<String, Factura> factures = new HashMap<>();
        
        try {
            // Llegir el contingut dels arxius línia a línia:
            LlegeixArxiu(arxiu, arxiuLog, factures, clients, productes);

            // MOSTRAR LES ESTRUCTURES DE MEMÒRIA
            System.out.println("\nCLIENTS");
            mostraClients(clients);
            System.out.println("\nPRODUCTES");
            mostraProductes(productes);
            System.out.println("\nFACTURES");
            mostraFactures(factures);

        } catch (Exception e) {
            System.err.println("Error GENERAL " + e.getMessage());
        }
    }
    
}

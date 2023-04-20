package Analizador2;

// Importing the generated files from the .bat file
import Analizador2.Generado.Parser;
import Analizador2.Generado.ParseException;
import Analizador2.Generado.TokenMgrError;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            // We create a new parser with the file to be analyzed
            Parser parser = new Parser(new BufferedReader(new FileReader(".\\src\\Analizador2\\test.txt")));
            // We analyze the file
            parser.Verify();

            System.out.println("Every string of the file is part of the grammar");
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(Analizador1.Main.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
    }
}

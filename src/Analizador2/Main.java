package Analizador2;

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
            Parser parser = new Parser(new BufferedReader(new FileReader(".\\src\\Analizador2\\test.txt")));
            parser.Verify();
            System.out.println("Todas las sentencias son correctas.");
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(Analizador1.Main.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
    }
}

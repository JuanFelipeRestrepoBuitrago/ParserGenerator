package Analizador1;

import Analizador1.Generado.Parser;
import Analizador1.Generado.ParseException;
import Analizador1.Generado.TokenMgrError;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            Parser parser = new Parser(new BufferedReader(new FileReader(".\\src\\Analizador1\\test.txt")));
            parser.Verify();
            System.out.println("Todas las sentencias son correctas.");
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
    }
}
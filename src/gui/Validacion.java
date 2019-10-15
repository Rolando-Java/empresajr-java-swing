/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import conn.Conection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Validacion {
    
    public Validacion(){
        
    }
    
    static boolean existencia_numero(String cad){
        boolean band=false;
        int tan=cad.length();
        
        for(int i=0;i<tan;i++){
            char car=cad.charAt(i);
            
            switch(car){
                case '0':
                    band=true;
                    break;
                case '1':
                    band=true;
                    break;
                case '2':
                    band=true;
                    break;
                case '3':
                    band=true;
                    break;
                case '4':
                    band=true;
                    break;
                case '5':
                    band=true;
                    break;
                case '6':
                    band=true;
                    break;
                case '7':
                    band=true;
                    break;
                case '8':
                    band=true;
                    break;
                case '9':
                    band=true;
                    break;    
            }
        }
        return band;
    }
    
    static boolean existencia_letras(String cad){
        boolean band=false;
        int tan=cad.length();
        
        for(int i=0;i<tan;i++){
            char te=cad.charAt(i);
            if(te=='0' || te=='1' || te=='2' || te=='3' || te=='4' || te=='5' || te=='6' || te=='7' || te=='8' || te=='9'){
                band=false;
            }else{
                band=true;
                break;
            }
        }
        return band;
    }
    
    static boolean existencia_arroba(String cad){
        boolean band=false;
        int tan=cad.length();
        
        for(int i=0;i<tan;i++){
            char car=cad.charAt(i);
            if(car=='@'){
                band=true;
                break;
            }else{
                band=false;
            }
        }
        return band;
    }
}

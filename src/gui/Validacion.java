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
    
    static boolean ficha_activa(String cod_ficha,String dni){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            String estado="inactivo";
            boolean actualizar_estado=false;
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs=st.executeQuery("SELECT F.COD_FICHA FROM FICHA_TECNICA F WHERE F.ESTADO='ACTIVO' AND F.COD_FICHA='"+cod_ficha+"'");
            
            if(rs.next()){
                estado="activo";
            }
            
            if(estado.equalsIgnoreCase("activo")){
                ResultSet rs2=st.executeQuery("SELECT F.COD_FICHA FROM FICHA_TECNICA F WHERE CONVERT(VARCHAR,F.FECHA_FIN,105)=CONVERT(VARCHAR,GETDATE(),105) AND F.COD_FICHA='"+cod_ficha+"'");

                if(rs2.next()){
                    actualizar_estado=true;
                }
                
                if(actualizar_estado){
                    st.executeUpdate("UPDATE FICHA_TECNICA SET ESTADO='INACTIVO' WHERE COD_FICHA='"+cod_ficha+"'");
                    band=false;
                }else{
                    boolean existencia_empleado=false;
                    
                    ResultSet rs3=st.executeQuery("select e.COD_EMP from empleado_ficha ef,empleado e where ef.COD_EMP=e.COD_EMP and e.DNI='"+dni+"'");
                    
                    if(rs3.next()){
                        existencia_empleado=true;
                    }
                    
                    if(existencia_empleado){
                        band=true;
                    }else{
                        band=false;
                    }
                }
                
            }else{
                band=false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
    }
    
    static boolean avance_registrado_hoy(String cod_empleado,String fecha,String cod_ficha){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs2=st.executeQuery("select A.COD_AVANCE from DBO.AVANCE A where convert(varchar,A.FECHA_INICIO,105)='"+fecha+"' and A.COD_EMP='"+cod_empleado+"' AND A.COD_FICHA='"+cod_ficha+"'");
                
            if(rs2.next()){
                band=true;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
    }
    
    static boolean existe_codigo_estilo(String codigo_estilo){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs2=st.executeQuery("select cod_ficha from dbo.FICHA_TECNICA where cod_estilo='"+codigo_estilo+"'");
                
            if(rs2.next()){
                band=true;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
    }
    
    static boolean esta_asignado(String cod_empleado,String cod_ficha){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs2=st.executeQuery("select * from dbo.EMPLEADO_FICHA where COD_EMP='"+cod_empleado+"' and COD_FICHA='"+cod_ficha+"'");
                
            if(rs2.next()){
                band=true;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
    }
    
    static boolean existe_dni_empleado(String dni_empleado){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs2=st.executeQuery("select cod_emp from dbo.EMPLEADO where dni='"+dni_empleado+"'");
                
            if(rs2.next()){
                band=true;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
    }
    
    static boolean repite_codigo_estilo(String codigo_estilo){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            int cantidad_filas=0;
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            ResultSet rs=st.executeQuery("select count(*) from dbo.FICHA_TECNICA");
            
            if(rs.next()){
                cantidad_filas=rs.getInt(1);
            }
            
            if(cantidad_filas>0){
                ResultSet rs2=st.executeQuery("select cod_ficha from dbo.FICHA_TECNICA where cod_estilo='"+codigo_estilo+"'");
                
                if(rs2.next()){
                    band=true;
                }else{
                    band=false;
                }
            }else{
                band=false;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
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

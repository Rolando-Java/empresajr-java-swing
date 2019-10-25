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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Validacion {
    
    public Validacion(){
        
    }
    
    static boolean fechas_validas(Date fechaInicio,Date fechaFin){
        try{
            if(fechaInicio.before(fechaFin)){
                return true;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
    
    static boolean repite_empleado(String dni){
        try{
            boolean dni_repite=false;
            Connection cn=Conection.getConnection();
            Statement st=cn.createStatement();
            
            ResultSet rs=st.executeQuery("select E.COD_EMP from dbo.EMPLEADO E where E.DNI='"+dni+"'");
            
            if(rs.next()){
                dni_repite=true;
            }
            
            if(dni_repite){
                JOptionPane.showMessageDialog(null, "Ese empleado ya existe");
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return true;
    }
    
    static boolean fecha_valida(String fecha){
        
        try{
            Calendar fech = new GregorianCalendar();
            int año = fech.get(Calendar.YEAR);
            int mes = fech.get(Calendar.MONTH);
            int dia = fech.get(Calendar.DAY_OF_MONTH);
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
            String fechaString=dia+"-"+(mes+1)+"-"+año;

            Date fechaDate=sdf.parse(fecha);
            Date fecha_actual=sdf.parse(fechaString);

            if(fechaDate.after(fecha_actual)){
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"La fecha tiene que ser mayor a la fecha actual");
                return false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
    
    static boolean ficha_activa(String cod_ficha,String dni){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            boolean ficha_activa=false;
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            st.executeUpdate("UPDATE FICHA_TECNICA  SET ESTADO='INACTIVO' WHERE CONVERT(VARCHAR,FECHA_FIN,105)=CONVERT(VARCHAR,GETDATE(),105)");
            
            ResultSet rs3=st.executeQuery("select * from dbo.FICHA_TECNICA ft where ft.ESTADO='ACTIVO' and ft.COD_FICHA='"+cod_ficha+"'");
            if(rs3.next()){
                ficha_activa=true;
            }
                
            if(ficha_activa){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Esa ficha ya está consumada!!");
                return false;
            }
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return band;
    }
    
    static boolean permite_ingresar(String cod_ficha,String dni){
        boolean band=false;
        Connection cn=null;
        Statement st=null;
        try{
            boolean actualizar_estado=false,empleado_existe=false,ficha_activa=false;
            cn=Conection.getConnection();
            st=cn.createStatement();
            
            st.executeUpdate("UPDATE FICHA_TECNICA  SET ESTADO='INACTIVO' WHERE CONVERT(VARCHAR,FECHA_FIN,105)=CONVERT(VARCHAR,GETDATE(),105)");
            
            ResultSet rs2=st.executeQuery("select * from dbo.EMPLEADO e,dbo.EMPLEADO_FICHA ef where e.COD_EMP=ef.COD_EMP and e.DNI='"+dni+"'");
            
            if(rs2.next()){
               empleado_existe=true;
            }
            
            if(!empleado_existe){
                ResultSet rs3=st.executeQuery("select * from dbo.FICHA_TECNICA ft where ft.ESTADO='ACTIVO' and ft.COD_FICHA='"+cod_ficha+"'");
                if(rs3.next()){
                    ficha_activa=true;
                }
                
                if(ficha_activa){
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Esa ficha ya está consumada!!");
                    return false;
                }
            }else{
                boolean band2=false;
                ResultSet rs4=st.executeQuery("select * from dbo.EMPLEADO e,dbo.EMPLEADO_FICHA ef,dbo.FICHA_TECNICA ft where e.COD_EMP=ef.COD_EMP and ft.COD_FICHA=ef.COD_FICHA and e.DNI='"+dni+"' and ft.ESTADO='ACTIVO'");
            
                if(rs4.next()){
                    band2=true;
                }
                
                if(band2){
                    JOptionPane.showMessageDialog(null, "Ya se encuentra asignado a una ficha técnica!!");
                   return false; 
                }else{
                    return true;
                }
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
        int tan=cad.trim().length();
        
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

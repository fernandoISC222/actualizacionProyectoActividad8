/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author luis ferrnando
 */
public class Guardar {
    String Usuario;
   String Contraseña ;
   String Nombre; 
   int TipoUsu;
   public void guardar_Empleado(int usua,String usuario,String contraseña){
   
   
       
            try{
            PrintWriter pw= new PrintWriter(new FileWriter("administrador.txt"));
            pw.println(usuario+","+contraseña+","+usua);
            
            pw.close();
            JOptionPane.showMessageDialog(null, "HAS GUARDADO UN NUEVO USUARIO \n "
                    + "administrador");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"tu error es "+ e);
            }
        
       
   
   }
   public int verificarUgeneral(String usuario,String contraseña) {
   int tipo=0;
   try{
   BufferedReader br=new BufferedReader(new FileReader("trabajador.txt"));
   String linea ;
   while ((linea=br.readLine())!=null){
   StringTokenizer st=new StringTokenizer(linea,",");
   String Vusuario=st.nextToken().trim();
   String Vcontraseña=st.nextToken().trim();
   if (usuario.equals(Vusuario)&&contraseña.equals(Vcontraseña)){
   tipo=Integer.parseInt(st.nextToken().trim());
   }
   }}
   catch(Exception e){
   
   JOptionPane.showMessageDialog(null,"el error es "+ e);}
   return tipo;
   }
  
            
    }
    


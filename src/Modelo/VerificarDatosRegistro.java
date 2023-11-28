
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alede
 */
public class VerificarDatosRegistro {

    public VerificarDatosRegistro() {
    }
    
    
    public boolean verificarCedula(String tipo, String cedula){
        
        String inicio = "123456789";
        boolean correcto = true;
        
        if(tipo.equalsIgnoreCase("Cedula Nacional")){
            
            if(cedula.length() == 11){
                if(!inicio.contains(cedula.charAt(0) + "")){
                    JOptionPane.showMessageDialog(null, "El primer digito de la cedula es invalido");
                    correcto = false;
                }
                else if(!(cedula.charAt(1) + "").equals("-") || !(cedula.charAt(6) + "").equals("-") ) {
                    JOptionPane.showMessageDialog(null, "La cedula debe llevar guiones");
                    correcto = false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "La cedula no posee un largo valido");
                correcto = false;
            }      
        }
        else if(tipo.equalsIgnoreCase("DIMEX")){
            if(cedula.length() != 12){
                JOptionPane.showMessageDialog(null, "El formato del DIMEX es invalido.");
                correcto = false;
            }
            else{
                for(int i = 0; i < cedula.length() - 1; i++){
                    if(!inicio.contains(cedula.charAt(i) + "")){
                        JOptionPane.showMessageDialog(null, "El formato del DIMEX es invalido.");
                        correcto = false;
                        break;
                    }
                }
            }  
        }
        return correcto;
    }
    
    public boolean verificarTelefono(String telefono, String codigo){

        boolean correcto =  true;
        String inicio = "24678";
        String numeros = "1234567890";
        
        if(codigo.equals("+506")){

            for(int i = 0; i < telefono.length(); i++){
                if(i == 0){
                    if(!(inicio.contains(telefono.charAt(i) + ""))){
                        JOptionPane.showMessageDialog(null, "El formato del telefono es invalido.");
                        correcto = false;
                        break;
                    }  
                }
                else if(i == 4){
                    if(telefono.charAt(i) != '-'){
                        JOptionPane.showMessageDialog(null, "El formato del telefono es invalido.");
                        correcto = false;
                        break;
                    }
                }
                else{
                    if(!(numeros.contains(telefono.charAt(i) + ""))){
                        JOptionPane.showMessageDialog(null, "El formato del telefono es invalido.");
                        correcto = false;
                        break;
                    }
                }   
            }
        }else{
            if(telefono.length() < 6){
                correcto = false;
            }
        }
        return correcto;
    }
    
    public boolean verificarEmail(String email){
        ArrayList<String> listaDomains = new ArrayList();
        boolean correcto =  true;
        boolean arroba = false;
        boolean domain = true;
        int posArroba = 0;
        File domains = new File("Domains_Correo.txt");
        
        for(int i = 0; i <  email.length(); i++){
            if(email.charAt(i) == '@'){
                arroba = true;
                posArroba = i;
                break;
            }
        }

        if(arroba){
            
            String dominioCorreo = email.substring(posArroba, email.length() - 1);
            
            try{
                Scanner rDomains = new Scanner(domains);

                while(rDomains.hasNextLine()){
                    String domainsValidos = rDomains.nextLine();

                    listaDomains.add(domainsValidos);
                }
            }catch(FileNotFoundException f){
                System.out.println(f);
                 
            }
            
            for(String d : listaDomains){
                
                if(dominioCorreo.equalsIgnoreCase(d)){
                    domain = false;
                    break;
                }
            }
        }
        
        if(!arroba || !domain){
            correcto = false;
            JOptionPane.showMessageDialog(null, "El formato del email es invalido. Verifique si este posee @  o no tiene un dominio valido.");
        }


        return correcto;
    }
    
    public boolean verificarContraseña(String pass1, String pass2){
        boolean correcto =  true;
        
        if(pass1.length() < 8){
            correcto = false;
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres");
        }
        else if(!(pass1.equals(pass2))){
            correcto = false;
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
            
       return correcto;
    }
}

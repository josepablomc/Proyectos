
package proyectocuenta;

import javax.swing.JOptionPane;

public class ProyectoCuenta {
    
    
    
    public static void main(String[] args) {
        //Inicializacion de variables
        boolean continua = true;
        boolean stop = true;
        boolean stop2 = true;
        boolean stop3 = true;
        int opc = 0;
        int opc2 = 0;
        int opc3 = 0;
        int consecutivoCuentas = 100001;
        int usuariosAgregados = 0;
        //Instanciar vector de objetos
        Usuario usuarios[] = new Usuario[10];
        //Instanciar vectores
        int cuentas[] = new int[10];
        double saldo[] = new double[10];
        
        //Menu principal
        while (continua) {

            opc = Captura.demeInteger("Opciones", "1. Registrarse\n" + "2. Gestion de cuentas\n" + "3. Transacciones \n" + "4. Consultar informacion\n" + "5. Salir");

            if (opc > 0 && opc < 6) {

                switch (opc) {
                    
                    case 1:
                        
                        usuarios[usuariosAgregados] = new Usuario(Captura.demeCadena("Informacion", "Ingrese su nombre"), Captura.demeCadena("Informacion", "Ingrese sus apellidos"),Captura.demeCadena("Informacion", "Ingrese su cedula"), Captura.demeCadena("Informacion", "Ingrese su correo"));
                        cuentas[usuariosAgregados] = consecutivoCuentas;
                        consecutivoCuentas++;
                        break;
                        
                    case 2:
                        
                        do{
                            opc2 = Captura.demeInteger("Opciones", "1. Abrir una cuenta\n" + "2. Saldo de cuenta\n" + "3. Salir");
                            
                           if(opc2 > 0 && opc2 < 4){
                               
                                switch(opc2){
                                    
                                    case 1:  // Se debe de ingresar el codigo para crear una cuenta y guardarla en el arreglo cuentas.
                                        
                                        break;
                                    case 2: // Se debe de ingresar el codigo para ver el saldo de la cuenta
                                        
                                        break;
                                    case 3: // Opcion salir del menu gestion de cuentas
                                        stop = false;
                                }
                               
                           }else{
                               JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
                           }
                            
                        }while(stop);
                        
                        
                        break;
                    case 3:
                        
                        do{
                           opc3 = Captura.demeInteger("Opciones", "1. Depositar\n" + "2. Retirar\n" + "3. Salir");
                            if(opc3 > 0 && opc2 < 4){
                                switch(opc3){
                                    
                                    case 1: 
                                        // Codigo para depositar
                                        break;
                                    case 2: 
                                        // Codigo para retirar
                                        break;
                                    case 3: 
                                     stop2 = false;
                                    
                                }
                                
                            }else{
                                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            
                        }while(stop2);
                        
                        break;
                    case 4:
                        
                        // despliegaInfo de la informacion del usuario.
                        
                        break;
                    case 5:
                        continua = false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
}

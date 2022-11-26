package lab7_oliveriraheta;
//Me la complique demasiado en el primero 
import java.util.Scanner;
public class Lab7_OliverIraheta {
    
    public static Scanner vini = new Scanner(System.in);
    public static Scanner rm = new Scanner(System.in);
    public static void main(String[] args) {
        //try {
            boolean x = true;
            while(x==true){
                System.out.println("-----------------------");
                System.out.println("Bienvenido al Lab #7"+'\n'+"1.  El calamar Pablo    2.  Torre de control    3. Salir"+'\n'+"Ingrese una opcion");
                int opc = vini.nextInt();
                switch(opc){
                    case 1: 
                        opcion();
                        break;
                    case 2:
                        avvion();
                        break;
                    case 3: System.out.println("Adios!");x=false;break;
                }
            }
        //} catch (Exception e) {System.out.println("s");}
    }
   
    public static void opcion(){     
        int goles=0; int gol=0;
        Seleccion mundial = new Seleccion();
        boolean x = true;
        while (x == true) {
            System.out.println("Bienvenido a El calamar Pablo" + '\n' + "1.  Crear seleccion    2.  Simular partido    3. Salir" + '\n' + "Ingrese una opcion");
            int opc = vini.nextInt();
            switch (opc) {
                case 1: 
                    System.out.println("Espana-Alemania-Costa Rica-Japon-Belgica-Croacia-Canada-Marruecos"+'\n' +"Ingrese seleccion");
                    String sele = rm.nextLine().toLowerCase();
                    mundial.selecciones(sele);
                    break;
                case 2:
                    System.out.println("Partidos Disponibles"+ '\n' + "1) Japon contra Costa Rica "+ '\n' + "2) Belgica contra Marruecos"+ '\n' + "3) Croacia contra Canada"+ '\n' + "4) Espana contra Alemania");
                    int partido = vini.nextInt();
                    simular(partido);
                    
                    break;
                case 3:
                    
                    System.out.println("Adios!");
                    x = false;
                    break;
            }
        }
    }
    public static void simular(int partido){
        System.out.println();
        Seleccion mundial = new Seleccion();
        int esp = mundial.setGolesp();int ale = mundial.setGolale();int cos = mundial.setGolcos();int jap = mundial.setGoljap();int bel = mundial.setGolbel();int cro = mundial.setGolcro();int can = mundial.setGolcan();int mar = mundial.setGolmar();
        
        switch(partido){
            case 1: 
                System.out.println("Juega Japon contra Costa Rica ");
                System.out.println("Japon "+jap+" ñ "+" Costa Rica "+cos);
                if(jap>cos){System.out.println("Ha ganado Japon!");
                }else if(jap<cos){System.out.println("Ha ganado Costa Rica! ");
                }else{System.out.println("Empate!");}
                break;
            case 2:   
                System.out.println("Juega Belgica contra Marruecos");
                System.out.println("Belgica "+jap+" ñ "+" Marruecos "+cos);
                if(jap>cos){System.out.println("Ha ganado Belgica!");
                }else if(jap<cos){System.out.println("Ha ganado Marruecos! ");
                }else{System.out.println("Empate!");}
                break;
            case 3:
                System.out.println("Juega Croacia contra Canada ");
                System.out.println("Croacia "+jap+" ñ "+" Canada "+cos);
                if(jap>cos){System.out.println("Ha ganado Croacia!");
                }else if(jap<cos){System.out.println("Ha ganado Canada! ");
                }else{System.out.println("Empate!");}
                break;
            case 4:
                System.out.println("Juega Espana contra Alemania ");
                System.out.println("Espana "+jap+" ñ "+" Alemania "+cos);
                if(jap>cos){System.out.println("Ha ganado Espana!");
                }else if(jap<cos){System.out.println("Ha ganado Alemania! ");
                }else{System.out.println("Empate!");}
                break;
            default:System.out.println("Opcion no valida");
    }
    
}
    public static void avvion(){
        String [] modelo= new String[3];
        String [] codigo= new String[3];
        int [] anio= new int[3];
        int [] cap= new int[3];
        int [] peso= new int[3];
        String [] aero= new String[3];
        Avion avvion = new Avion();
        System.out.println("- Bienvenido al nuevo Torre de control -");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el modelo del avion "+(i+1)+": ");
            modelo[i] = rm.nextLine();
            avvion.setModelo(modelo,i);
            System.out.print("Ingrese el codigo "+(i+1)+": ");
            codigo[i] = rm.nextLine();
            avvion.setCodigo(codigo);
            System.out.print("Ingrese el anio de fabricacion "+(i+1)+": ");
            anio[i]=vini.nextInt();
            avvion.setAnio(anio);
            System.out.print("Ingrese la capacidad maxima de pasajeros "+(i+1)+": ");
            cap[i]=vini.nextInt();
            avvion.setCap(cap);
            System.out.print("Ingrese el peso del avion "+(i+1)+": ");
            peso[i]=vini.nextInt();
            avvion.setPeso(peso);
            System.out.print("Ingrese el nombre de la aerolinea "+(i+1)+": ");
            aero[i]=rm.nextLine();
            avvion.setAero(aero);
            System.out.println("--Se ha agregado el avion exitosamente--");
            
        }
        boolean estado = true;
        while(estado){
            System.out.print("Desea cambiarle el estado a un avion [S/N]: ");
            String opc = rm.nextLine();
            if("s".equals(opc)||"S".equals(opc)){
                System.out.println("Aviones disponibles: ");
                for (int i = 0; i < 3; i++) {
                    System.out.println((i+1)+") "+avvion.getModelo(i));
                }
                System.out.print("Ingrese el numero del avion al que le desea cambiar el estado: ");
                int avion = vini.nextInt();
                System.out.println("---Se ha elegido el "+avvion.getModelo(avion-1)+" ---");
                System.out.println("Estados disponibles: ");
                System.out.println("1. Despegando");
                System.out.println("2. Aterrizado");
                System.out.println("3. Estacionado");
                System.out.print("Ingrese el nuevo estado: ");
                int estados = vini.nextInt();
                if(estados==1){
                    System.out.println("---"+avvion.getModelo(avion-1)+" ahora esta despegando---");
                }else if(estados==2){
                    System.out.println("---"+avvion.getModelo(avion-1)+" ahora esta aterrizando---");
                }else if(estados==3){
                    System.out.println("---"+avvion.getModelo(avion-1)+" ahora esta estacionado---");
                }
            }else{
                System.out.println("*_*");
                estado = false;
            }
                    
        }
        
        
    }
}

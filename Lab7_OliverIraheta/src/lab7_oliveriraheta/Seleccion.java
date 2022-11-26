package lab7_oliveriraheta;
import java.util.Scanner;
import java.util.Random;

public class Seleccion {
    
    public Scanner vini = new Scanner(System.in);
    public Scanner rm = new Scanner(System.in);
    public int golesp;public int a;
    public int golale;public int s;
    public int golcos;public int d;
    public int goljap;public int f;
    public int golbel;public int g;
    public int golcro;public int h;
    public int golcan;public int j;
    public int golmar;public int k;
   
    public int setGolesp() {
        this.golesp = new Random().nextInt((10 - 0) + 1) + 0;
        this.a+=golesp;
        return golesp;
    }

    public int setGolale() {
        this.golale = new Random().nextInt((10 - 0) + 1) + 0;
        this.s+=golale;
        return golale;
    }

    public int setGolcos() {
        this.golcos = new Random().nextInt((10 - 0) + 1) + 0;
        this.d+=golcos;
        return golcos;
    }

    public int setGoljap() {
        this.goljap = new Random().nextInt((10 - 0) + 1) + 0;
        this.f+=goljap;
        return goljap;
    }

    public int setGolbel() {
        this.golbel = new Random().nextInt((10 - 0) + 1) + 0;
        this.g+=golbel;
        return golbel;
    }

    public int setGolcro() {
        this.golcro = new Random().nextInt((10 - 0) + 1) + 0;
        this.h+=golcro;
        return golcro;
    }

    public int setGolcan() {
        this.golcan = new Random().nextInt((10 - 0) + 1) + 0;
        this.j+=golcan;
        return golcan;
    }

    public int setGolmar() {
        this.golmar = new Random().nextInt((10 - 0) + 1) + 0;
        this.k+=golmar;
        return golmar;
    }
    
   
    public void selecciones(String sele){
        if(sele.equals("espana")){
            System.out.println("-"+'\n' +"Espana pertenece al Grupo E"+ '\n' +"Su Director Tecnico es Luis Enrique"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"Si ha ganado un mundial"+ '\n' +"Esta en la primera posicion del grupo"+ '\n' +"Cantidad de goles: "+a+ '\n' +"--Se ha creado exitosamente la seleccion de Espana--"+'\n'+"-");
        
        }else if(sele.equals("alemania")){
            System.out.println("-"+'\n' +"Alemania pertenece al Grupo E"+ '\n' +"Su Director Tecnico es Hansi Flick"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"Si ha ganado un mundial"+ '\n' +"Esta en la tercera posicion del grupo"+ '\n' +"Cantidad de goles: "+s+ '\n' +"--Se ha creado exitosamente la seleccion de Alemania--"+'\n'+"-");
        
        }else if(sele.equals("costa rica")){
            System.out.println("-"+'\n' +"Costa Rica pertenece al Grupo E"+ '\n' +"Su Director Tecnico es Luis Fernando Suarez"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"No ha ganado un mundial"+ '\n' +"Esta en la cuarta posicion del grupo"+ '\n' +"Cantidad de goles: "+d+ '\n' +"--Se ha creado exitosamente la seleccion de Costa Rica--"+'\n'+"-");   
        
        }else if(sele.equals("japon")){
            System.out.println("-"+'\n' +"Japon pertenece al Grupo E"+ '\n' +"Su Director Tecnico es Hajime Moriyasu"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"No ha ganado un mundial"+ '\n' +"Esta en la segunda posicion del grupo"+ '\n' +"Cantidad de goles: "+f+ '\n' +"--Se ha creado exitosamente la seleccion de Japon--"+'\n'+"-");   
            
        }else if(sele.equals("belgica")){
            System.out.println("-"+'\n' +"Belgica pertenece al Grupo F"+ '\n' +"Su Director Tecnico es Roberto Martinez"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"No ha ganado un mundial"+ '\n' +"Esta en la primera posicion del grupo"+ '\n' +"Cantidad de goles: "+g+ '\n' +"--Se ha creado exitosamente la seleccion de Belgica--"+'\n'+"-");   
            
        }else if(sele.equals("croacia")){
            System.out.println("-"+'\n' +"Croacia pertenece al Grupo F"+ '\n' +"Su Director Tecnico es Zlatko Dalic"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"No ha ganado un mundial"+ '\n' +"Esta en la segunda posicion del grupo"+ '\n' +"Cantidad de goles: "+h+ '\n' +"--Se ha creado exitosamente la seleccion de Croacia--"+'\n'+"-");   
            
        }else if(sele.equals("canada")){
            System.out.println("-"+'\n' +"Canada pertenece al Grupo F"+ '\n' +"Su Director Tecnico es John Herdman"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"No ha ganado un mundial"+ '\n' +"Esta en la cuarta posicion del grupo"+ '\n' +"Cantidad de goles: "+j+ '\n' +"--Se ha creado exitosamente la seleccion de Canada--"+'\n'+"-");   
   
        }else if(sele.equals("marruecos")){
            System.out.println("-"+'\n' +"Marruecos pertenece al Grupo F"+ '\n' +"Su Director Tecnico es Walid Regragui"+ '\n' +"Tiene 26 jugadores convocados"+ '\n' +"No ha ganado un mundial"+ '\n' +"Esta en la tercera posicion del grupo"+ '\n' +"Cantidad de goles: "+k+ '\n' +"--Se ha creado exitosamente la seleccion de Marruecos--"+'\n'+"-");    
        }else{
            System.out.println("Seleccion no encontrada");
        }
        
    }
}

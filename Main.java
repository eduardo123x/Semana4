import java.util.*;
import java.util.Scanner;
import maps.coordenadas;



class Main {
  

public static void maps(){
    
    System.out.println("\n");
    System.out.println("Coordenadas");
    System.out.println("------------------------------------");

    ArrayList<coordenadas> lista = new
    ArrayList<coordenadas>();

    
    
    int x=5,c=1;

    String n,m;
    for (int b=0;b<x;b++){

    coordenadas o = new coordenadas();

    Scanner input = new Scanner (System.in);
    System.out.println("\n");
    System.out.println(c+"°"+" "+"Coordenada --->");
    System.out.println("a) Ingrese la Latitud:");
    o.lat=input.nextFloat();
    System.out.println("b) Ingrese la Longitud:");
    o.lonj=input.nextFloat();
    lista.add(o);
    c++;
   
     
    }

    
    System.out.println("\n");
    System.out.println("https://www.keene.edu/campus/maps/tool/?coordinates=");

    int g=5;
    for (int h = 0; h <= g; h++) {
     if (h==0){
        System.out.print(lista.get(0).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(0).lonj);
        System.out.print("%0A");
        
      }
      if (h==1){
        System.out.print(lista.get(1).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(1).lonj);
        System.out.print("%0A");
        
      }
       if (h==2){
        System.out.print(lista.get(2).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(2).lonj);
        System.out.print("%0A");
        
      }

       if (h==3){
        System.out.print(lista.get(3).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(3).lonj);
        System.out.print("%0A");
        
      }
      if (h==4){
        System.out.print(lista.get(4).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(4).lonj);
        System.out.print("%0A");
        
      }
    }
    }
  public static void main(String[] args) {
  System.out.println("\n");
  System.out.println("Poligono con 5 Coordenadas");

  maps();
  }
      
 }

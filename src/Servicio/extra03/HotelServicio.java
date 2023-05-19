
package Servicio.extra03;

import Entidad.extra03.Hotel;
import Entidad.extra03.Hotel_4;
import Entidad.extra03.Hotel_5;

public class HotelServicio {
    
    // tengo que crear un metodo para crear los hoteles.
    
    public Hotel cargarHotel(){
  Hotel hotel = new Hotel();
        System.out.println("Ingrese la cantidad de pisos que tiene el hotel");
        hotel.setCantPisos(10);
        System.out.println("Cuantas habitaciones tiene por piso?");
        hotel.setCantHab(5);
        System.out.println("Cuantas camas por habitacion?");
        hotel.setNumCamas(3);
        System.out.println("Ingrese el precio de la habitacion");
        hotel.setPrecioHab(100);
        return hotel;
    }
    
    public Hotel_4 cargarHotel4(){
  Hotel_4 hotel4 = new Hotel_4();
 Hotel hotel = cargarHotel(); // para utilizar los datos del metodo. y llenarlos con los get y set
 
        System.out.println("El gimnasio es de tipo A o B ?");
 hotel4.setGim("A");
        System.out.println("Ingrese el nombre del restaruante del hotel");
 hotel4.setNomRest("nombreRestaurante");
        System.out.println("Ingrese la capacidad de personas que tiene el restaurante");
 hotel4.setCapacidadRest(60);
 
 return new Hotel_4(hotel4.getGim(), hotel4.getNomRest(), hotel4.getCapacidadRest(), 
         hotel.getCantHab(), hotel.getNumCamas(), hotel.getCantPisos(), hotel.getPrecioHab());   
    }
    
    public Hotel_5 cargaHotel5(){
        Hotel_5 hotel5 = new Hotel_5();
       Hotel_4 hotel4 = cargarHotel4();  // para utilizar los datos del metodo. y llenarlos con los get y set
        System.out.println("Ingrese cuantas limusinas tiene el hotel");
        hotel5.setCantLimusinas(5);
        System.out.println("Cuantos salones de conferencia tiene el hotel");
        hotel5.setCantSalones(3);
        System.out.println("Ingrese cuantas suite tiene el hotel");
        hotel5.setCantSuite(10);
        
        return new Hotel_5(hotel5.getCantSalones(), hotel5.getCantSuite(), hotel5.getCantLimusinas(), 
                hotel4.getGim(), hotel4.getNomRest(), hotel4.getCapacidadRest(), 
                hotel4.getCantHab(), hotel4.getNumCamas(), hotel4.getCantPisos(), hotel4.getPrecioHab());
        
    }
    
    
}

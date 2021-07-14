/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete04.TiposTransporte;
import paquete04.Transporte;
import paquete04.TransporteBus;
import paquete04.TransporteTaxi;


public class Principal {
    public static void main(String[] args) {
         TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("El gran");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Ciudad Victoria");
        taxi.establecerTarifa();

        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerTransvia("Machala");
        t3.establecerTarifa();

        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerAereo("AeroLine");
        aereo.establecerTarifa();

        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerMaritimo("Pacifico");
        mar.establecerTarifa();

        
        ArrayList<Transporte> lista = new ArrayList();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);

        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }

}

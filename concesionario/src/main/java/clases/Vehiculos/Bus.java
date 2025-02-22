package clases.Vehiculos;
import clases.Vehiculos.abstractas.Vehiculo;
import clases.Alimentacion.IAlimentacion;
import clases.Personas.IPersona;
import clases.Vehiculos.abstractas.TipoCaja;

public class Bus extends Vehiculo {
    private int capacidadMaletero;
    private boolean camaraReversa;
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    public Bus(int ID,IAlimentacion alimentacion, TipoCaja tipoCaja, String marca, String nuevo_usado, int cambios, int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, int cantidadBolsasAire, boolean ABS, int capacidadMaletero, boolean camaraReversa, int numeroEjes, int numeroSalidasEmergencia, IPersona usuarioCompro, double precioVehiculo, double precioRenta) {
        super(ID,alimentacion, tipoCaja, marca, nuevo_usado, cambios, velocidadMaxima, cilindrada, numeroPasajeros, numeroPuertas, aireAcondicionado, cantidadBolsasAire, ABS, usuarioCompro, precioVehiculo, precioRenta);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

   
    
}

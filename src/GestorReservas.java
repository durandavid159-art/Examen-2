public class GestorReservas {

    private Reserva[] miReserva;
    private int indice;

    public GestorReservas(int tamaño){
        miReserva = new Reserva[tamaño];
        indice=0;
    }

    public void agregarReserva (Reserva item){
        miReserva [indice]= item;
        indice ++;
    }

    public Reserva [] getMiReserva(){
        return miReserva;
    }

    public double calcularTotal(){
        double total=0;

        for (int i = 0; i<indice; i++){
            total += miReserva[i].getcostoBase();
        }
        return total;
    }
}
 
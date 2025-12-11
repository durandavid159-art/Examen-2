public class SalaTradicional extends Reserva {

    private int duracionMin;
    
    public SalaTradicional (String codigo, String pelicula, double costoBase, int duracionMin){
        super(codigo, pelicula, costoBase);
        this.duracionMin=duracionMin;
    }

    public void setDuracionMin(int duracionMin){
        this.duracionMin=duracionMin;
    }
    public int getDuracionMin(){
        return duracionMin;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "  DURACIÓN: " + duracionMin;
    }
    
}

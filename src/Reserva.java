public class Reserva {
    private String codigo;
    private String pelicula;
    private double costoBase;
    
    public Reserva (String codigo, String pelicula, double costoBase){
        this.codigo=codigo;
        this.pelicula=pelicula;
        this.costoBase=costoBase;
    }
    
    public String obtenerDetalles(){
        String datos ="CODIGO: "+ codigo + "  PELICULA: " + pelicula + "  COSTO: " + costoBase ;

        return datos;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return codigo;
    }

    public void setPelicula(String pelicula){
        this.pelicula=pelicula;
    }
    public String getPelicula(){
        return pelicula;
    }

    public void setCostoBase(double costoBase){
        this.costoBase=costoBase;
    }
    public double getcostoBase(){
        return costoBase;
    }
}

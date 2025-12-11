public class MainCine {
    public static void main(String[] args) {

        GestorReservas mipedido = new GestorReservas(4);

        SalaTradicional pedido1 =new SalaTradicional("P001", "rapido & furiosos", 200, 120);
        SalaTradicional pedido2 = new SalaTradicional("P002", "El conjuro", 200, 60);

        Sala3D pedido3 = new Sala3D("P003", "acuaman", 100, 100);
        Sala3D pedido4 = new Sala3D("P004", "la monja", 200, 100);


        mipedido.agregarReserva(pedido1);
        mipedido.agregarReserva(pedido2);
        mipedido.agregarReserva(pedido3);
        mipedido.agregarReserva(pedido4);

         
        
        for (int i=0; i< mipedido.getMiReserva().length; i++){
            System.out.println(mipedido.getMiReserva()[i].obtenerDetalles());
        }
    
        double total = mipedido.calcularTotal();  
        System.out.println("TOTAL: $" + total);
        
    }
}

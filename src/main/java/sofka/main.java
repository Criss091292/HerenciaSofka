package sofka;

public class main {
    public static void main(String[] args) {
        //realizamos prueba manual:
        Televisor tv = new Televisor();
        tv.setEsSintonizador(true);
        tv.setCantidad(5);
        tv.setTamanioEnPulgadas(50);
        tv.setNombre("samsung");
        tv.setEsNacional(true);
        tv.setConsumo('A');

        System.out.println("tv: " + tv.toString());
        System.out.println("precio: " + tv.calcularPrecioFinal(tv.getConsumo(), tv.getEsNacional(), tv.getTamanioEnPulgadas(), tv.getEsSintonizador()));
    }
}


package almacen;


public class appAlmacen {
    public static void main(String[] args) {
     
        Datos matriz = new Datos (4,4);
      
        
        BebidasAzucaradas CocaCola = new BebidasAzucaradas("1",(float)2.5, 100, "Coca-Cola", 15, false);
        AguaMineral VillaManaos = new AguaMineral("2",(float)2.5, 60, "VillaManaos", "cordoba");
        BebidasAzucaradas Sprite = new BebidasAzucaradas("3",(float)1.5, 100, "Sprite", 5, true);
        AguaMineral VillaManaos2 = new AguaMineral("4",(float)2.5, 60, "VillaManaos", "cordoba");
        BebidasAzucaradas Sprite2 = new BebidasAzucaradas("5",(float)1.5, 100, "Sprite", 5, true);
        
        matriz.agregarProducto(CocaCola);
        matriz.agregarProducto(VillaManaos);
        
        matriz.mostrarInformacion();
        
        matriz.eliminarProducto("1");
        matriz.mostrarInformacion();
        matriz.agregarProducto(Sprite);
        matriz.agregarProducto(VillaManaos2);
        matriz.agregarProducto(Sprite2);
        matriz.mostrarInformacion();
        
        System.out.println("El precio total es:" + matriz.calcularPrecioTotal());
        System.out.println("El precio total es:" + matriz.calcularPrecioMarca("Sprite"));
       }
}

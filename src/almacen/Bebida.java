
package almacen;


public class Bebida {
    private String id;
    private float cant_Litros;
    private float precio;
    private String marca;
    public Bebida(){}
    
    public Bebida(String id, float cantidad, float precio, String marca){
        this.id = id;
        this.cant_Litros = cantidad;
        this.marca = marca;
        this.precio = precio;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCant_Litros(float cant_Litros) {
        this.cant_Litros = cant_Litros;
    }

    
    public String getId() {
        return id;
    }

    public float getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public float getCant_Litros() {
        return cant_Litros;
    }

    @Override
    public String toString() {
        return "identificador:" + id + ", Litros:" + cant_Litros + ", precio:" + precio + ", marca:" + marca ;
    }



}



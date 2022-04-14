
package almacen;


public class AguaMineral extends Bebida{
    private String origen;
    
    AguaMineral(){}
    public AguaMineral(String id, float cantidad, float precio, String marca, String origen) {
        super(id, cantidad, precio, marca);
        this.origen = origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }
     @Override
    public String toString() {
        return super.toString() + ", origen:" + origen;
    }
}

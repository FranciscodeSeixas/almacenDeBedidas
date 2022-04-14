
package almacen;

public class BebidasAzucaradas extends Bebida{
    private float porcentajeAzucar;
    private boolean promocion;
    
    BebidasAzucaradas(){}

    public BebidasAzucaradas(String id, float cantidad, float precio, String marca,float porcentajeAzucar, boolean promocion) {
        super(id, cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public void setPorcentajeAzucar(float porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    public float getPorcentajeAzucar() {
        return porcentajeAzucar;
    }
    
    public boolean isPromocion() {
        return promocion;
    }
    
    @Override
    public float getPrecio(){
    if(isPromocion()){
            return (float) (super.getPrecio()*0.9);
        }
    else  return super.getPrecio();
    
    }
    @Override
    public String toString() {
        return super.toString() + ", porcentaje de Azucar:" + porcentajeAzucar + ", promocion:" + promocion;
    }

    
    
}

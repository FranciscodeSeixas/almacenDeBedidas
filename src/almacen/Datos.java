
package almacen;

public class Datos {
    Bebida[][] estanteria;
    private int c, f;
    
    public Datos(int f, int c){
        this.c=c;
        this.f=f;
    this.estanteria = new Bebida[f][c];
    }

    public void setEstanteria(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setF(int f) {
        this.f = f;
    }
    
    public Bebida[][] getEstanteria() {
        return estanteria;
    }

    public int getC() {
        return c;
    }

    public int getF() {
        return f;
    }
    
public void agregarProducto(Bebida b){
    int j, i;
    boolean encontrado=false;
    for(i=0;i<f && !encontrado;i++){
        for(j=0;j<c && !encontrado;j++){
            if(estanteria[i][j]==null){
                estanteria[i][j] = b;
                encontrado = true;
                }
            }
        }
    }
public void eliminarProducto(String identificador){
    int j, i;
    boolean encontrado=false;
    for(i=0;i<f && !encontrado;i++){
        for(j=0;j<c && !encontrado;j++){
            if(estanteria[i][j].getId().equals(identificador)){
                estanteria[i][j]=null;
                encontrado=true;
                }
            }
        }
    }


public float calcularPrecioTotal(){
float precioTotal = 0;
 int j, i;
    for(i=0;i<f;i++){
        for(j=0;j<c;j++){
            if(estanteria[i][j]!=null) precioTotal+=estanteria[i][j].getPrecio();
            }
        }
    return precioTotal;
    }

public float calcularPrecioMarca(String marca){
float precioMarca = 0;
 int j, i;
    for(i=0;i<f;i++){
        for(j=0;j<c;j++){
            if(estanteria[i][j]!=null){
                if(estanteria[i][j].getMarca().equals(marca)){ 
                   precioMarca+=estanteria[i][j].getPrecio();
                    }
           
                }
            }
        }
    return precioMarca;
 }

public void mostrarInformacion(){
  int j, i;
    for(i=0;i<f;i++){
        for(j=0;j<c;j++){
            if(estanteria[i][j]!=null) {
                System.out.println("fila "+i+" columna "+j+" Bebida "+estanteria[i][j].toString());
                }
            }
        }
    }
}


   


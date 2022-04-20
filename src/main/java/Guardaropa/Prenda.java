package Guardaropa;

public class Prenda {
    TipodePrenda tipo;
    String material;
    String color_ppal;
    String color_sec;

    public Prenda(Categoria categoria, String tipo, String material, String color){
        this.tipo= new TipodePrenda(categoria, tipo);
        this.material=material;
        this.color_ppal=color;
    }

    public void setColor_sec(String color_sec) {
        this.color_sec = color_sec;
    }
}

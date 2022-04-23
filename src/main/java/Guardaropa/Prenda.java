package Guardaropa;

import java.awt.*;

public class Prenda {
    private TipodePrenda tipo;
    private Material material;
    private Color color_ppal;
    private Color color_sec;

    public Prenda(TipodePrenda tipo, Material material, Color color, Color color2){
        this.tipo = tipo;
        this.material = material;
        this.color_ppal = color;
        this.color_sec = color2;
    }
    public Categoria getCategoria(){
        return tipo.getCategoria();
    }
}

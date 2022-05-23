package Guardaropa;

import PrendaCaracteristicas.Categoria;
import PrendaCaracteristicas.Material;
import PrendaCaracteristicas.TipodePrenda;
import PrendaCaracteristicas.Trama;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipodePrenda tipo;
    private Material material;
    private Color color_ppal;
    private Color color_sec;
    private Trama trama;

    public Prenda(TipodePrenda tipo, Material material, Color color, Color color2, Trama trama){
        this.tipo = tipo;
        this.material = material;
        this.color_ppal = color;
        this.color_sec = color2;
        this.trama = trama;
    }
    public Categoria getCategoria(){
        return tipo.getCategoria();
    }
    public Boolean aptoParaTemperatura(Integer temp) {
        return tipo.getTemperatura() <= temp;
    }

}

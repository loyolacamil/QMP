package Guardaropa;

import Guardaropa.PrendaCaracteristicas.Categoria;
import Guardaropa.PrendaCaracteristicas.Material;
import Guardaropa.PrendaCaracteristicas.TipodePrenda;
import Guardaropa.PrendaCaracteristicas.Trama;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipodePrenda tipo;
    private Material material;
    private Color color_ppal;
    private Color color_sec;
    private Trama trama;

    public Prenda(TipodePrenda tipo, Material material, Color color, Color color2, Trama trama){
        this.tipo = requireNonNull(tipo, "tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "material es obligatorio");
        this.color_ppal = requireNonNull(color, "color es obligatorio");
        this.color_sec = color2;
        if (trama == null){
            this.trama = Trama.LISA;
        }else this.trama = trama;
    }
    public Categoria getCategoria(){
        return tipo.getCategoria();
    }

}

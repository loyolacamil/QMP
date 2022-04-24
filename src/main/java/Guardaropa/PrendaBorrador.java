package Guardaropa;

import java.awt.*;

public class PrendaBorrador {
  private TipodePrenda tipo;
  private Material material;
  private Color color_ppal;
  private Color color_sec;
  private Trama trama;

  public Prenda crearPrenda(){
    //validar previamente con una claseException
    return new Prenda(this.tipo,this.material,this.color_ppal,this.color_sec,this.trama);
  }

  public void setTipo(TipodePrenda tipo) {
    this.tipo = tipo;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColor_sec(Color color_sec) {
    this.color_sec = color_sec;
  }

  public void setColor_ppal(Color color_ppal) {
    this.color_ppal = color_ppal;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public TipodePrenda getTipo() {
    return tipo;
  }

  public Color getColor_ppal() {
    return color_ppal;
  }

  public Color getColor_sec() {
    return color_sec;
  }

  public Material getMaterial() {
    return material;
  }

  public Trama getTrama() {
    return trama;
  }
}


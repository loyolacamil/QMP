package Guardaropa;

import Guardaropa.PrendaCaracteristicas.Material;
import Guardaropa.PrendaCaracteristicas.TipodePrenda;
import Guardaropa.PrendaCaracteristicas.Trama;

import java.awt.*;

public abstract class PrendaBorrador {
  public TipodePrenda tipo;
  public Material material;
  public Color color_ppal;
  public Color color_sec;
  public Trama trama;

  public void crearPrenda(){
    //El constructor valida a la prenda, que no se carguen con nulls
    new Prenda(this.tipo,this.material,this.color_ppal,this.color_sec,this.trama);
    //metodo para eliminar el borrador TODO
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


package Borradores;

import PrendaCaracteristicas.Categoria;
import PrendaCaracteristicas.TipodePrenda;

public class PrendaAccesorioBorrador extends PrendaBorrador {

  public PrendaAccesorioBorrador(TipodePrenda tipo) {
    if (tipo.getCategoria() == Categoria.ACCESORIOS) this.crearPrenda();
  }
}

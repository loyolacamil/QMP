package Guardaropa;

import Guardaropa.PrendaCaracteristicas.Categoria;
import Guardaropa.PrendaCaracteristicas.TipodePrenda;

public class PrendaAccesorioBorrador extends PrendaBorrador{

  public PrendaAccesorioBorrador(TipodePrenda tipo) {
    if (tipo.getCategoria() == Categoria.ACCESORIOS) this.crearPrenda();
  }
}

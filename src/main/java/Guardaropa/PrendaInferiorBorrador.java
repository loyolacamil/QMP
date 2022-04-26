package Guardaropa;

import Guardaropa.Exceptions.PrendaInferiorException;
import Guardaropa.PrendaCaracteristicas.Categoria;
import Guardaropa.PrendaCaracteristicas.TipodePrenda;


public class PrendaInferiorBorrador extends PrendaBorrador {

  public PrendaInferiorBorrador(TipodePrenda tipo) throws PrendaInferiorException {
    if (tipo.getCategoria() == Categoria.PARTE_INFERIOR) {
      this.tipo = tipo;
    } throw new PrendaInferiorException("No es una prenda Inferior");
  }
}

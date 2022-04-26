package Guardaropa;

import Guardaropa.Exceptions.PrendaSuperiorException;
import Guardaropa.PrendaCaracteristicas.Categoria;
import Guardaropa.PrendaCaracteristicas.TipodePrenda;

public class PrendaSuperiorBorrador extends PrendaBorrador {

  public PrendaSuperiorBorrador (TipodePrenda tipo) throws PrendaSuperiorException {
    if (tipo.getCategoria() == Categoria.PARTE_SUPERIOR) {
      this.tipo = tipo;}
  throw new PrendaSuperiorException("No es una prenda superior");
  }

}

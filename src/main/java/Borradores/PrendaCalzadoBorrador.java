package Borradores;

import Exceptions.PrendaInferiorException;
import PrendaCaracteristicas.Categoria;
import PrendaCaracteristicas.TipodePrenda;

public class PrendaCalzadoBorrador extends PrendaBorrador {

  public PrendaCalzadoBorrador(TipodePrenda tipo) throws PrendaInferiorException {
    if (tipo.getCategoria() == Categoria.CALZADO) {
    this.tipo = tipo;
    } throw new PrendaInferiorException("No es un Calzado");
  }
}

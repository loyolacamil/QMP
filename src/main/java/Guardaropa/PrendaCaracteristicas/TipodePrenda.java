package Guardaropa.PrendaCaracteristicas;

import Guardaropa.PrendaCaracteristicas.Categoria;

//Pensamos tipo de prenda con una clase enum ya que no hay inifitas tipos de prenda y por criterio de
//usuario sabemos que no le interesa cargarlo.
public enum TipodePrenda{

  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.PARTE_SUPERIOR),
  TACOS(Categoria.CALZADO),
  REMERON(Categoria.PARTE_SUPERIOR),
  SHORT(Categoria.PARTE_INFERIOR),
  TOP(Categoria.PARTE_SUPERIOR),
  JEAN(Categoria.PARTE_INFERIOR),
  VESTIDO(Categoria.PARTE_SUPERIOR);

  private Categoria categoria;
  TipodePrenda(Categoria categoria) {
    this.categoria = categoria;
  };
  public Categoria getCategoria() {
    return this.categoria;
  }
}

package PrendaCaracteristicas;

//Pensamos tipo de prenda con una clase enum ya que no hay inifitas tipos de prenda y por criterio de
//usuario sabemos que no l e interesa cargarlo.
public enum TipodePrenda{

  ZAPATO(Categoria.CALZADO,15),
  CAMISA(Categoria.PARTE_SUPERIOR,19),
  TACOS(Categoria.CALZADO,15),
  REMERON(Categoria.PARTE_SUPERIOR,17),
  SHORT(Categoria.PARTE_INFERIOR,24),
  TOP(Categoria.PARTE_SUPERIOR,27),
  JEAN(Categoria.PARTE_INFERIOR,12),
  VESTIDO(Categoria.PARTE_SUPERIOR,22);

  private Categoria categoria;
  private Integer temperatura;

  TipodePrenda(Categoria categoria, Integer Temperatura) {

    this.categoria = categoria;
    this.temperatura = temperatura;
  };
  public Categoria getCategoria() {
    return this.categoria;
  }
  public Integer getTemperatura () {return this.temperatura;}
}

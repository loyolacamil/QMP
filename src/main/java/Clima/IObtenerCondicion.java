package Clima;

import java.util.List;
import java.util.Map;

public interface IObtenerCondicion {
  public List<Map<String, Object>> getWeather(String ciudad);
}

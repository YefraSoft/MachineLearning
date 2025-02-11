package src.interfaces.models;

/**
 * Interfaz para la regresión lineal simple.
 * Define los métodos para calcular los parámetros de una regresión simple dados
 * los datos de entrada.
 * 
 * @see #computeRegression(float[], float[])
 */
public interface SimpleRegresion {

  /**
   * Calcula los parámetros de la regresión lineal simple (intercepto y
   * pendiente).
   * Utiliza el método de mínimos cuadrados para encontrar la recta de mejor
   * ajuste.
   * 
   * @param x Arreglo de valores de la variable independiente (X).
   * @param y Arreglo de valores de la variable dependiente (Y).
   * @return Un arreglo con los parámetros de la regresión: [b0, b1].
   * @throws IllegalArgumentException Si los arreglos `x` o `y` son nulos o tienen
   *                                  longitudes diferentes.
   */
  public float[] computeRegression(float[] x, float[] y);

  /**
   * Obtiene los componentes intermedios utilizados en el cálculo de la regresión
   * lineal.
   * Devuelve las sumas y productos que son fundamentales para obtener los
   * parámetros de la regresión.
   * 
   * @return Un arreglo con los componentes intermedios: [sumX, sumY, sumXY,
   *         sumXSquare].
   */
  public float[] getRegressionComponents();
}
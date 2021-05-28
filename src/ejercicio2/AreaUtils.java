package ejercicio2;

public class AreaUtils {

    public static Double areaPromedio(FiguraGeometrica[] arr) {
        Double areaTotal = 0.0;
        for (FiguraGeometrica figura : arr) {
            areaTotal += figura.area();
        }
        return areaTotal / arr.length;
    }
}

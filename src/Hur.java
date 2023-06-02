public class Hur {
    
    public double calcArea(double aSide, double bSide, double cSide, double dSide){

        double s = (aSide + bSide + cSide + dSide) / 2;
        double area = Math.sqrt((s - aSide) * (s - bSide) * (s - cSide) * (s - dSide));

        return area;

   } 
    
}

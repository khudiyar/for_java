public class Triangle {
    private double birinchiTaraf;
    private double ikkinchiTaraf;
    private double uchinchiTaraf;

    public Triangle() {
    }

    public Triangle(double birinchiTaraf, double ikkinchiTaraf, double uchinchiTaraf) {
        this.birinchiTaraf = birinchiTaraf;
        this.ikkinchiTaraf = ikkinchiTaraf;
        this.uchinchiTaraf = uchinchiTaraf;
    }

    public double getBirinchiTaraf() {
        return birinchiTaraf;
    }

    public void setBirinchiTaraf(double birinchiTaraf) {
        this.birinchiTaraf = birinchiTaraf;
    }

    public double getIkkinchiTaraf() {
        return ikkinchiTaraf;
    }

    public void setIkkinchiTaraf(double ikkinchiTaraf) {
        this.ikkinchiTaraf = ikkinchiTaraf;
    }

    public double getUchinchiTaraf() {
        return uchinchiTaraf;
    }

    public void setUchinchiTaraf(double uchinchiTaraf) {
        this.uchinchiTaraf = uchinchiTaraf;
    }

    public double perimetr(){
        return birinchiTaraf+ikkinchiTaraf+uchinchiTaraf;
    }

    public double yuza(){
        double p = birinchiTaraf+ikkinchiTaraf+uchinchiTaraf;
        return Math.sqrt(p*(p-birinchiTaraf)*(p-ikkinchiTaraf)*(p-uchinchiTaraf));
    }
}

package cursoJAVA;

public class ejeplosDia3 {

    public static void main(String[] args) {
        int dividendo = 17;
        int divisor = 3;

        Division division = rdivision(dividendo, divisor);

        System.out.print("Dividendo: "+dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Cociente: " + division.getCociente());
        System.out.println("Resto: "+division.getResto());
        System.out.println("Respuesta: " +division.getRespuesta());
    }

    public static Division rdivision(int dividendo, int divisor) {
        //Calcular cociente
        int cociente = dividendo / divisor;

        //Calcurar resto
        int resto = dividendo % divisor;

        //Calcular la división
        double respurtaDiv = (double) dividendo / divisor;

        //Calcular instansia
        return new Division(cociente, resto, respurtaDiv);
    }
}

    class Division{
        private int cociente;
        private int resto;
        private double respurtaDiv;

        public Division(int cociente, int resto, double respurtaDiv) {
            this.cociente = cociente;
            this.resto = resto;
            this.respurtaDiv = respurtaDiv;
        }

        public int getCociente() {
            return cociente;
        }

        public int getResto() {
            return resto;
        }

        public double getRespuesta() {
            return respurtaDiv;
        }


}
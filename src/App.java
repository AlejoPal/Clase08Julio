import javax.swing.plaf.synth.SynthSpinnerUI;

public class App {
    public static void main( String[] args )
    {
        Nota notaVacia = new Nota();
        /*
        System.out.println("--------------------------------------------------");
        System.out.println("Nota Vacia");
        System.out.println("Valor Escala 5 -> " + notaVacia.getEscala5());
        System.out.println("Valor Escala 100 -> " + notaVacia.getEscala100());
        System.out.println("Valor Escala Cualitativa -> " + notaVacia.getCualitativa());
        */
        notaVacia.mostrarNotasConsola();

        Nota notaEscala5 = new Nota(4.0);
        /*
        System.out.println("--------------------------------------------------");
        System.out.println("NotaEscala 5 ");
        System.out.println("Valor Escala 5 -> " + notaEscala5.getEscala5());
        System.out.println("Valor Escala 100 -> " + notaEscala5.getEscala100());
        System.out.println("Valor Escala Cualitativa -> " + notaEscala5.getCualitativa());
        */
        notaEscala5.mostrarNotasConsola();
       
        Nota notaEscala100 = new Nota(60);
        /*
        System.out.println("--------------------------------------------------");
        System.out.println("NotaEscala 100 ");
        System.out.println("Valor Escala 5 -> " + notaEscala100.getEscala5());
        System.out.println("Valor Escala 100 -> " + notaEscala100.getEscala100());
        System.out.println("Valor Escala Cualitativa -> " + notaEscala100.getCualitativa());
        */
        notaEscala100.mostrarNotasConsola();

        Nota notaTodos = new Nota(5, 100, "Aprobado");
        /*
        System.out.println("--------------------------------------------------");
        System.out.println("Nota TODOS ");
        System.out.println("Valor Escala 5 -> " + notaTodos.getEscala5());
        System.out.println("Valor Escala 100 -> " + notaTodos.getEscala100());
        System.out.println("Valor Escala Cualitativa -> " + notaTodos.getCualitativa());
        */
        notaTodos.mostrarNotasConsola();
    
    }
}

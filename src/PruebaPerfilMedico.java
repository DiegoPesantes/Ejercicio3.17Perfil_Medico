import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el sexo: ");
        String sexo = entrada.nextLine();

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = entrada.nextInt();

        System.out.print("Ingrese el año actual: ");
        int anioActual = entrada.nextInt();

        System.out.print("Ingrese la altura en centímetros: ");
        double altura = entrada.nextDouble();

        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = entrada.nextDouble();

        PerfilMedico perfil = new PerfilMedico(
                nombre, apellido, sexo,
                dia, mes, anioNacimiento, altura, peso
        );

        int edad = perfil.calcularEdad(anioActual);
        int frecuenciaMaxima =
                perfil.calcularFrecuenciaCardiacaMaxima(edad);
        double frecuenciaMinima =
                perfil.calcularFrecuenciaEsperadaMinima(edad);
        double frecuenciaEsperadaMaxima =
                perfil.calcularFrecuenciaEsperadaMaxima(edad);
        double imc = perfil.calcularIMC();

        String categoriaIMC;

        if (imc < 18.5) {
            categoriaIMC = "Bajo peso";
        } else if (imc < 25) {
            categoriaIMC = "Normal";
        } else if (imc < 30) {
            categoriaIMC = "Sobrepeso";
        } else {
            categoriaIMC = "Obeso";
        }

        System.out.println();
        System.out.println("----- Perfil médico -----");
        System.out.println("Nombre: " + perfil.obtenerPrimerNombre()
                + " " + perfil.obtenerApellido());
        System.out.println("Sexo: " + perfil.obtenerSexo());
        System.out.println("Fecha de nacimiento: "
                + perfil.obtenerDiaNacimiento() + "/"
                + perfil.obtenerMesNacimiento() + "/"
                + perfil.obtenerAnioNacimiento());
        System.out.println("Altura: " + perfil.obtenerAltura() + " cm");
        System.out.println("Peso: " + perfil.obtenerPeso() + " kg");
        System.out.println("Edad aproximada: " + edad + " años");
        System.out.println("IMC: " + imc + " (" + categoriaIMC + ")");
        System.out.println("Frecuencia cardiaca máxima: "
                + frecuenciaMaxima + " pulsaciones por minuto");
        System.out.println("Rango esperado: de "
                + frecuenciaMinima + " a "
                + frecuenciaEsperadaMaxima
                + " pulsaciones por minuto");

        entrada.close();
    }
}
import java.util.Scanner;
public class TraductorSemanal {
    public static void main(String[] args) {
        int dia;
        String idioma;
        Scanner entrada = new Scanner(System.in);
        try (Scanner sc = new Scanner(System.in)) {
    
        System.out.print("Día de la semana: ");
        dia = entrada.nextInt();
        System.out.print("Idioma: ");
        idioma = sc.nextLine();
        
        switch (dia) {
            case 1:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Lunes");
                        break;
                    case ("en"):
                        System.out.println("Monday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

            case 2:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Martes");
                        break;
                    case ("en"):
                        System.out.println("Tuesday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

             case 3:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Miércoles");
                        break;
                    case ("en"):
                        System.out.println("Wednesday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

     
             case 4:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Jueves");
                        break;
                    case ("en"):
                        System.out.println("Thursday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

            case 5:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Viernes");
                        break;
                    case ("en"):
                        System.out.println("Friday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

            case 6:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Sábado");
                        break;
                    case ("en"):
                        System.out.println("Saturday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

            case 7:
                switch (idioma.toLowerCase()) {
                    case ("es"):
                        System.out.println("Domingo");
                        break;
                    case ("en"):
                        System.out.println("Sunday"); 
                        break;
                    default:
                        System.out.println("ERROR: El idioma " + idioma + " no es válido.");
                        break;
                    }
                break;

            default:
                System.out.println("ERROR: El día " + dia + " no es válido.");
                break;  
        }
            
        
    }
}}

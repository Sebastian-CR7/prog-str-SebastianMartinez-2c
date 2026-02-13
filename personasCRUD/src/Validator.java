import java.util.Scanner;

public class Validator {

    public int Id(Scanner sc, String msg, Persona[] personas, int contador){
        int id;
        while (true){
            System.out.println(msg);
            if (sc.hasNextInt()){
                id = sc.nextInt();
                sc.nextLine();
                if (id<=0){
                    System.out.println("El id no puede ser menor o igual a 0");
                    continue;
                }
                boolean repetido = false;
                for (int i=0;i<contador;i++){
                    if (personas[i].getId()==id){
                        repetido = true;
                        break;
                    }
                }
                if (repetido){
                    System.out.println("El id ya existe, ingresa otro diferente");
                }else {
                    return id;
                }
            }else {
                System.out.println("El valor no es numerico");
                sc.nextLine();
            }
        }
    }

    public String nombre(Scanner sc,String msg){
        String nombre;
        while (true){
            System.out.println(msg);
            nombre = sc.nextLine();
            if (nombre.trim().isEmpty()){
                System.out.println("El texto esta vacío");
            }else {
                return nombre;
            }
        }
    }

    public boolean activo (Scanner sc, String msg){
        boolean activo;
        while (true){
            System.out.println(msg);
            if (sc.hasNextBoolean()){
                activo = sc.nextBoolean();
                sc.nextLine();
                return activo;
            }else {
                System.out.println("El dato ingresado no es uno de los indicados");
                sc.nextLine();
            }
        }
    }

}

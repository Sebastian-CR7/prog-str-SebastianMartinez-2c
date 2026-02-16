import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        int opc, contador=0;
        Alumno[] alumnos = new Alumno[25];

        do {
            System.out.println(".-.-.-M E N U-.-.-.");
            System.out.println("1) Alta del alumno");
            System.out.println("2) Buscar por ID (solo activos)");
            System.out.println("3) Actualizar promedio por ID (solo activos)");
            System.out.println("4) Baja lógica por ID");
            System.out.println("5) Listar activos");
            System.out.println("6) Reportes");
            System.out.println("0) SALIR");
            System.out.println("Selecciona una de las opciones: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    if (contador<alumnos.length){
                        int id= validator.validarId(sc,"Ingresa el ID: ",alumnos,contador);
                        String nombre = validator.ValNombre(sc,"Ingresa el nombre: ");
                        double promedio = validator.validarProm(sc,"Ingresa el promedio: ");
                        alumnos[contador]=new Alumno(id,nombre,promedio,true);
                        contador++;
                        System.out.println("Se registro al alumno");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el ID que quieres buscar: ");
                    int buscaid = sc.nextInt();
                    sc.nextLine();
                    boolean encontrada = false;
                    for (int i=0;i<contador;i++){
                        if (alumnos[i].getId()==buscaid && alumnos[i].isActivo()){
                            System.out.println(alumnos[i]);
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada){
                        System.out.println("La ID no se encontro o esta inactiva");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa la ID donde quieres actualizar el promedio: ");
                    int actuId = sc.nextInt();
                    boolean actuEncontrada = false;
                    for (int i=0;i<contador;i++){
                        if (alumnos[i].getId()==actuId && alumnos[i].isActivo()){
                            double newProm= validator.validarProm(sc,"Ingresa nuevo promedio: ");
                            alumnos[i].setProm(newProm);
                            actuEncontrada=true;
                            System.out.println("Se actualizo el promedio");
                            break;
                        }
                    }
                    if (!actuEncontrada){
                        System.out.println("No se puede realizar una actualizacion");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa ID para desactivar: ");
                    int bajId=sc.nextInt();
                    for (int i=0;i<contador;i++){
                        if (alumnos[i].getId()==bajId){
                            alumnos[i].setActivo(false);
                            System.out.println("Se desactivo");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Lista de los alumnos activos: ");
                    for (int i=0;i<contador;i++){
                        if (alumnos[i].isActivo()){
                            System.out.println(alumnos[i]);
                        }
                    }
                    break;
                case 6:
                    validator.reportesAlumno(alumnos,contador);
                    break;
                case 0:
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Error al elegir una opcion");
                    break;
            }
        }while (opc!=0);
    }
}
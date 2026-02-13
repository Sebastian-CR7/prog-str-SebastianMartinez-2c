import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        int opc, contador=0;

        Persona[] personas = new Persona[20];
        Persona persona = new Persona();


        do {
            System.out.println("-----M E N U-----");
            System.out.println("1. Alta");
            System.out.println("2. Buscar por ID (solo activas");
            System.out.println("3. Baja lógica por ID");
            System.out.println("4. Listar activas");
            System.out.println("5. Actualizar nombre por ID (solo activas)");
            System.out.println("0. SALIR");
            System.out.println("Selecciona una opcion: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    int id = validator.Id(sc,"Ingresa el ID: ",personas,contador);
                    String nom = validator.nombre(sc,"Ingresa el nombre: ");
                    boolean active = validator.activo(sc,"Estas activo:");
                    persona = new Persona(id,nom,active);

                    personas[contador]=persona;
                    contador++;
                    System.out.println("Persona registrada");
                    break;
                case 2:
                    System.out.println("Ingresa el ID que quieres buscar: ");
                    int buscaid = sc.nextInt();
                    sc.nextLine();
                    boolean encontrada = false;
                    for (int i=0;i<contador;i++){
                        if (personas[i].getId()==buscaid && personas[i].isActiva()){
                            System.out.println("ID: "+personas[i].getId());
                            System.out.println("Nombre: "+personas[i].getNombre());
                            System.out.println("Activo: "+personas[i].isActiva());
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada){
                        System.out.println("No se encontro la ID o esta inactiva");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa ID para desactivar: ");
                    int bajaid = sc.nextInt();
                    sc.nextLine();
                    boolean encontrarbaja = false;
                    for (int i=0;i<contador;i++){
                        if (personas[i].getId()==bajaid){
                            personas[i].setActiva(false);
                            System.out.println("La ID se desactivo");
                            encontrarbaja=true;
                        }
                    }
                    if (!encontrarbaja){
                        System.out.println("No se encontro la ID ingresada");
                    }
                    break;
                case 4:
                    System.out.println("Listas que estan activas: ");
                    for (int i=0;i<contador;i++){
                        if (personas[i].isActiva()){
                            System.out.println("ID: "+personas[i].getId());
                            System.out.println("Nombre: "+personas[i].getNombre());
                            System.out.println("Activa: "+personas[i].isActiva());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingresa la ID para cambiar el nombre: ");
                    int cambiarnom = sc.nextInt();
                    sc.nextLine();
                    boolean encontradactiva =false;
                    for (int i=0;i<contador;i++){
                        if (personas[i].getId()==cambiarnom && personas[i].isActiva()){
                            nom = validator.nombre(sc,"Ingresa el nuevo nombre: ");
                            personas[i].setNombre(nom);
                            encontradactiva=true;
                            break;
                        }
                    }
                    if (!encontradactiva){
                        System.out.println("No se encontro la ID o esta inactiva");
                    }
                    break;
                case 0:
                    System.out.println("SALISTE del programa");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo");
                    break;
            }
        }while (opc!=0);

    }
}

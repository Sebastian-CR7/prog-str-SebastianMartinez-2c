import java.util.Scanner;

public class Validator {

    public int validarId (Scanner sc, String msg,Alumno[]alumnos,int contador){
        int id;
        while (true){
            System.out.println(msg);
            if (sc.hasNextInt()){
                id = sc.nextInt();
                sc.nextLine();
                if (id<=0){
                    System.out.println("El ID debe ser mayor a 0");
                    continue;
                }
                boolean repet = false;
                for (int i=0;i<contador;i++){
                    if (alumnos[i].getId()==id){
                        repet = true;
                        break;
                    }
                }
                if (repet){
                    System.out.println("El ID ya existe, ingresa otro nuevo");
                }else {
                    return id;
                }
            }else {
                System.out.println("El ID no es un valor numerico");
                sc.nextLine();
            }
        }
    }

    public String ValNombre(Scanner sc,String msg){
        String nom;
        while (true){
            System.out.println(msg);
            nom = sc.nextLine();
            if (nom.trim().isEmpty()){
                System.out.println("El texto esta vacio");
            }else {
                return nom;
            }
        }
    }

    public double validarProm (Scanner sc,String msg){
        double prom;
        while (true){
            System.out.println(msg);
            if (sc.hasNextDouble()){
                prom = sc.nextDouble();
                sc.nextLine();
                if (prom>=0 && prom <=10){
                    return prom;
                }else {
                    System.out.println("El promedio debe estar entre el 0 y 10");
                }
            }else {
                System.out.println("El valor no es numerico");
                sc.nextLine();
            }
        }
    }

    public void reportesAlumno(Alumno[] alumnos, int contador){
        double sum=0,maxProm=-1,minProm=11;
        int activos=0,alumnosdeocho=0,posiMayor=-1,posiMin=-1;

        for (int i=0;i<contador;i++){
            if (alumnos[i].isActivo()){
                double prom=alumnos[i].getProm();

                sum = sum+prom;
                activos++;

                if (prom>=8){
                    alumnosdeocho=alumnosdeocho+1;
                }
                if (prom>maxProm){
                    maxProm=prom;
                    posiMayor = i;
                }
                if (prom<minProm){
                    minProm=prom;
                    posiMin=1;
                }
            }
        }
        if (activos>0){
            System.out.println("-.-.R E P O R T E S.-.-");
            System.out.println("El promedio general de los alumnos activos: "+(sum/activos));

            System.out.println("Alumno activo con mayor promedio");
            System.out.println("ID del alumno: "+alumnos[posiMayor].getId());
            System.out.println("Nombre: "+alumnos[posiMayor].getNom());
            System.out.println("Promedio: "+alumnos[posiMayor].getProm());

            System.out.println("Alumno con menor promedio");
            System.out.println("ID del alumno: "+alumnos[posiMin].getId());
            System.out.println("Nombre: "+alumnos[posiMin].getNom());
            System.out.println("Promedio: "+alumnos[posiMin].getProm());

            System.out.println("Alumnos con promedio >=8 "+alumnosdeocho);
        }else {
            System.out.println("No se puede mostrar el registro");
        }


    }

}


package EjercicioSesion5;
/*Ejercicio Sesión 5

Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save()
findAll()
delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();


    }

}

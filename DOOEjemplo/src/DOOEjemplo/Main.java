package DOOEjemplo;

import java.util.ArrayList;
import java.util.List;

// Interfaz Responsable
interface Responsable {
    void realizarTarea();
}

// Clase base Empleado
abstract class Empleado implements Responsable {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public abstract void realizarTarea();
}

// Clases que heredan de Empleado
class Desarrollador extends Empleado {
    public Desarrollador(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está desarrollando código.");
    }
}

class Diseñador extends Empleado {
    public Diseñador(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarTarea() {
        System.out.println(getNombre() + " está diseñando interfaces.");
    }
}

// Clase Proyecto
class Proyecto {
    private String nombre;
    private List<Empleado> empleados;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados en el proyecto " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre());
        }
    }
}

// Clase Departamento
class Departamento {
    private String nombre;
    private List<Proyecto> proyectos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void mostrarProyectos() {
        System.out.println("Proyectos en el departamento " + nombre + ":");
        for (Proyecto proyecto : proyectos) {
            System.out.println("- " + proyecto);
        }
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado dev1 = new Desarrollador("Carlos");
        Empleado designer1 = new Diseñador("Ana");

        // Crear proyecto y agregar empleados
        Proyecto proyecto1 = new Proyecto("Proyecto A");
        proyecto1.agregarEmpleado(dev1);
        proyecto1.agregarEmpleado(designer1);

        // Mostrar empleados en el proyecto
        proyecto1.mostrarEmpleados();

        // Crear departamento y agregar proyecto
        Departamento departamento = new Departamento("Tecnología");
        departamento.agregarProyecto(proyecto1);

        // Mostrar proyectos en el departamento
        departamento.mostrarProyectos();

        // Realizar tareas
        dev1.realizarTarea();
        designer1.realizarTarea();
    }
}

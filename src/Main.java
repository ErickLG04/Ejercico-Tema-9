public class Main {
    public static void main(String[] args) {
        Cliente cliente =  new Cliente();
        Trabajador trabajador =new Trabajador();

        cliente.setEdad(19);
        cliente.setNombre("Erick");
        cliente.setTelefono(939212543);
        cliente.setCredito(250.00);

        trabajador.setEdad(31);
        trabajador.setNombre("Carlos");
        trabajador.setTelefono(963582417);
        trabajador.setSalario(971.00);

        System.out.println("Datos del cliente");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        System.out.println("Datos del trabajador");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());




    }
}

class Persona {

    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    double salario ;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}




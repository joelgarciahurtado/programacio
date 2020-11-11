class Persona {
  private static int numPersonas = 0;
  private String nombre;
  private int edad;
  private static int sumaedad = 0;

  Persona(String n, int e) {
    nombre = n;
    numPersonas++;
    edad = e;
    sumaedad = sumaedad + e;
  }

  public void muestra() {
    System.out.print("Soy " + nombre + " tengo " + edad + " años");
    System.out.println(" pero hay " + (numPersonas - 1) + " personas más.");
    System.out.println("la suma de todas las edades es " + sumaedad);
  }
}

class exercici1 {
  public static void main(String arg[]) {
    Persona p1, p2, p3;
    p1 = new Persona("Pedro", 23);
    p2 = new Persona("Juan", 45);
    p3 = new Persona("Susana", 78);
    p2.muestra();
    p1.muestra();
    p3.muestra();
  }
}
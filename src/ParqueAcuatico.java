class ParqueAcuatico {
    public String nombreCliente;
    public double precioEntrada;
    public double precioBuffet;
    public double precioSeccion;
    public double precioDelfines;
    public double totalPagar;
    public int opcionPaquete;
    public int opcionIteraccion;
    public int opcionDelfines;
    public String tipoIteraccion;

    //metodo constructor
    public ParqueAcuatico(double precioEntrada, double precioBuffet) {
        this.precioEntrada = precioEntrada;
        this.precioBuffet = precioBuffet;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public double getPrecioBuffet() {
        return precioBuffet;
    }

    //menu de paquetes
    public void menuPaquetes() {
        System.out.println("PAQUETES DEL PARQUE ACUATICO");
        System.out.println("1. Entrada");
        System.out.println("2. Entrada + Buffet");
        System.out.println("3. Entrada + Buffet + Espectaculo");
        System.out.println("4. Entrada + Buffet + Espectaculo + Delfines");
    }

    //menu de tipo de seccion de iteraccion
    public void menuIteraccion() {
        System.out.println("¿Que tipo de iteraccion deseas?");
        System.out.println("1. Balcon");
        System.out.println("2. VIP");
        System.out.println("3. General");
    }

    //metodo para el nombre del cliente
    public void setNombreCliente(String nombre) {
        this.nombreCliente = nombre;
    }

    //obtenemos el valor del nombre del cliente
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setPrecioSeccion(double precioSeccion) {
        this.precioSeccion = precioSeccion;
    }

    public double getPrecioSeccion() {
        return precioSeccion;
    }

    public void setPrecioDelfines(double precioDelfines) {
        this.precioDelfines = precioDelfines;
    }

    public double getPrecioDelfines() {
        return precioDelfines;
    }

    //metodo para la opcion del paquete que elige el usuario
    public void setOpcionPaquete(int opcion) {
        this.opcionPaquete = opcion;
    }
    //optenemos la opcion del paquete
    public int getOpcionPaquete() {
        return opcionPaquete;
    }
    //metodo para la opcion del paquete que elige el usuario
    public void setOpcionIteraccion(int opcion) {
        this.opcionIteraccion = opcion;
    }
    //optenemos la opcion del paquete
    public int getOpcionIteraccion() {
        return opcionIteraccion;
    }
    public void calcularIteraccion(){
        switch (getOpcionIteraccion()){
            case 1:
                this.tipoIteraccion = "Balcon";
                this.precioSeccion = 60.0;
                break;
            case 2:
                this.tipoIteraccion = "VIP";
                this.precioSeccion = 100.0;
                break;
            case 3:
                this.tipoIteraccion = "General";
                this.precioSeccion = 150.0;
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }
    public void paquete1(){
        System.out.println("Entrada = " + getPrecioEntrada());
        System.out.print("Total a pagar:\t" + getPrecioEntrada() + " MXN");
    }
    public void paquete2(){
        System.out.println("Entrada = " + getPrecioEntrada());
        System.out.println("Buffet = " + getPrecioBuffet());
        totalPagar = getPrecioEntrada() + getPrecioBuffet();
        System.out.print("Total a pagar:\t" + totalPagar + " MXN");
    }
    public void paquete3(){
        System.out.println("Entrada = " + getPrecioEntrada());
        System.out.println("Buffet = " + getPrecioBuffet());
        System.out.println("Tipo de Seccion = " + this.tipoIteraccion);
        System.out.println("Precio de la Seccion = " + this.precioSeccion);
        totalPagar = getPrecioEntrada() + getPrecioBuffet() + this.precioSeccion;
        System.out.print("Total a pagar:\t" + totalPagar + " MXN");
    }
}
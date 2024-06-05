public class Medico {

        private int id;
        private String codigo;
        private String nombre;
        private String apellido;
        private String especialidad;
        private String telefono;

        public Medico(int id, String nombre, String apellido, String especialidad, String telefono) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.especialidad = especialidad;
            this.telefono = telefono;
            this.codigo = generarCodigo(nombre, apellido);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        // Método para generar el código del médico
        private String generarCodigo(String nombre, String apellido) {
            String primerasLetras = apellido.substring(0, 2) + nombre.substring(0, 2);
            int numeroAleatorio = (int)(Math.random() * 900) + 100; // Genera un número entre 100 y 999
            return primerasLetras + numeroAleatorio;
        }

        @Override
        public String toString() {
            return "Médico [ID=" + id + ", Código=" + codigo + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Especialidad=" + especialidad + ", Teléfono=" + telefono + "]";
        }
    }


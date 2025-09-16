public class Main {
    public static void main(String[] args) {
        Profesional medico = new Profesional("Marcos", "Pediatra");
        Paciente paciente = new Paciente("Lucas", "Deos");
        CitaMedica cita = new CitaMedica("12-12-26", "10:00");
        cita.setPaciente(paciente);
        cita.setProfesional(medico);
        System.out.println(cita);
    }
}

package es.alejandro.modelo;

public class Paciente {

    private String pacienteId;
    private String name;

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Paciente{pacienteId='%s', name='%s'}", pacienteId, name);
    }
}

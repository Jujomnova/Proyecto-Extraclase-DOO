package co.edu.uco.tiendachepito.dto;

import ch.qos.logback.core.net.SyslogOutputStream;
import co.edu.uco.tiendachepito.crosscutting.helpers.ObjectHelper;
import co.edu.uco.tiendachepito.crosscutting.helpers.TextHelper;

public final class ciudadDTO {

    private int id;
    private String nombre;
    private DepartamentoDTO departamento;

    public ciudadDTO(){
        setNombre(TextHelper.EMPTY);
        setDepartamento(DepartamentoDTO.build());
    }

    public ciudadDTO(final int id, final String nombre, final DepartamentoDTO departamento) {
        setId(id);
        setNombre(nombre);
        setDepartamento(departamento);
    }

    public static final ciudadDTO build(){
        return new ciudadDTO();
    }

    public final int getId() {
        return id;
    }

    public final ciudadDTO setId(final int id) {
        this.id = id;
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final ciudadDTO setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim((nombre));
        return this;
    }

    public final DepartamentoDTO getDepartamento() {
        return departamento;
    }

    public final ciudadDTO setDepartamento(final DepartamentoDTO departamento) {
        this.departamento = ObjectHelper.getObjectHelper().getDefault(departamento, DepartamentoDTO.build());
        return this;
    }

    public static void main(String[] args) {
        System.out.println(ciudadDTO.build().getDepartamento().getPais().getNombre());
    }
}

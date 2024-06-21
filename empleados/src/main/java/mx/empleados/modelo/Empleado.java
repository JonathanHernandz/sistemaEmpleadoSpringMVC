package mx.empleados.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data //get y set
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEmpleado;  //id_emplado en la bd, hibernate lo crea automaticamente
    String nombreEmpleado;
    String departamento;
    Double sueldo;


}

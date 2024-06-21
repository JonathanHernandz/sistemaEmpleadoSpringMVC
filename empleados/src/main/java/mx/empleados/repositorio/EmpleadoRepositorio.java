package mx.empleados.repositorio;

import mx.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
// la ventaja de extender con la interface JpaRepository, de manera automatica Spring agrega
//    una implementacion al vuelo y entonces tenemos acceso para listar estudiante todos los empleados,
//     para guardar un empleado, eliminar, para hacer una busqueda por id, etc

}

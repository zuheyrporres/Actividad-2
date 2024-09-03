select e.id_empleados,e.codigo,e.nombre,e.apellidos,e.direccion,e.telefono,e.fecha_nacimiento, p.puestos from empleados as e;
from empleados as e inner join puestos as p on e.id_puesto = p.id_puestos;

INSERT INTO `db_empresaa`.`empleados`(codigo,nombre,apellidos,direccion,telefono,fecha_nacimiento,id_puesto)
VALUES('E002','Angel','Manzano','Guatemala','124345','1998-03-08',2);

Select * from empleados;
Select * from puestos;

update empleados set telefono='2222'
where id_empleados=2;

delete from empleados where id_empleados = 2;
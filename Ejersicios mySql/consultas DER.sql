#1
SELECT horas FROM proyecto_has_departamento;
#2
SELECT MAX(horas) FROM proyecto_has_departamento;
#3
SELECT tareas.empleado_codigo , tareas.proyecto_codigo, proyecto.codigo FROM tareas inner join proyecto on tareas.proyecto_codigo = proyecto.codigo order by fechaInicio;
#4
SELECT departamento_codigo , proyecto_codigo FROM proyecto_has_departamento where departamento_codigo = '2';
#5
SELECT * FROM empleado join proyecto on empleado.proyecto_codigo = proyecto_codigo order by proyecto.fechaInicio desc;
#6
select nombre from areas;
# 6.3.Actividad-taller


3. Justificación de Diseño:
   
El modelado orientado a objetos exige tomar decisiones fundamentadas sobre el tipo de relaciones entre clases, la visibilidad de los atributos y métodos, y el uso de abstracciones como interfaces. A continuaci detALLO las razones técnicas detrás de las elecciones realizadas en el diseño del sistema "MerceDAWs".


3.1. Composición vs Agregación entre Vehiculo y Reparacion:

Composición y agregación son dos formas de asociación "todo-parte" en UML, pero difieren en la dependencia del ciclo de vida y la propiedad de los objetos involucrados.

- Composición (rombo negro): Indica que la parte (Reparacion) no puede existir sin el todo (Vehiculo). Si el vehículo se elimina, todas sus reparaciones asociadas también desaparecen. La composición implica una relación de propiedad fuerte y un ciclo de vida compartido.
  
- Agregación (rombo blanco): La parte (por ejemplo, Vehiculo en Cliente) puede existir independientemente del todo. Si un cliente se elimina, los vehículos pueden seguir existiendo en el sistema, o ser reasignados a otro cliente.
  
Justificación en el sistema:

- La relación entre Vehiculo y Reparacion es de composición porque:
  - Una reparación no tiene sentido fuera del contexto de un vehículo concreto.
  - El historial de reparaciones es gestionado internamente por el vehículo; si el vehículo se elimina, su historial debe desaparecer.
  - Esto se traduce en que la lista de reparaciones es un atributo privado de Vehiculo y su ciclo de vida está completamente gestionado por la clase contenedora.
    
- La relación entre Cliente y Vehiculo es de agregación porque:
  - Un vehículo puede cambiar de propietario (cliente) o incluso existir sin estar asignado a un cliente concreto (por ejemplo, en inventario).
  - El ciclo de vida de los vehículos no depende estrictamente del cliente.



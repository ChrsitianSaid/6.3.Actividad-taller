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
 

3.2. Ventajas de usar la interfaz Especialista
El uso de interfaces en Java es una práctica recomendada para lograr abstracción, polimorfismo, desacoplamiento y flexibilidad en el diseño de sistemas orientados a objetos.

Beneficios concretos en el sistema:

- Polimorfismo: Permite que la clase Taller trabaje con cualquier objeto que implemente la interfaz Especialista, sin importar su implementación concreta. Así, se puede sustituir un Mecanico por otro tipo de especialista (por ejemplo, un robot de reparación) sin modificar la lógica del taller.
  
- Desacoplamiento: El taller depende de una abstracción (Especialista), no de una implementación específica (Mecanico). Esto facilita el mantenimiento y la evolución del sistema, permitiendo la introducción de nuevas variantes de especialistas sin afectar el código existente.
  
- Extensibilidad: Si en el futuro se desea añadir nuevos tipos de especialistas (por ejemplo, subcontratistas, sistemas automáticos), basta con implementar la interfaz sin modificar las clases consumidoras.
  
- Facilidad de pruebas unitarias: Las interfaces permiten el uso de mocks y stubs en pruebas unitarias, facilitando la simulación de comportamientos y la verificación de interacciones sin depender de implementaciones reales.



3.3. Buenas prácticas de modelado UML y Java:

- Visibilidad: Los atributos son privados y se accede a ellos mediante getters y setters, promoviendo el encapsulamiento.
- Herencia: Se utiliza para modelar la especialización de vehículos (Coche y Moto), permitiendo la reutilización de atributos y comportamientos comunes.
- Composición y agregación: Se aplican según el ciclo de vida y la dependencia entre los objetos, siguiendo las recomendaciones de UML y la literatura especializada.
- Interfaces: Se emplean para definir contratos de comportamiento, facilitando el polimorfismo y el desacoplamiento.
- Multiplicidades: Se especifican en el diagrama para clarificar las restricciones de cardinalidad entre los objetos.
- Documentación: El uso de Mermaid y Markdown permite mantener la documentación sincronizada con el código y facilita la colaboración.






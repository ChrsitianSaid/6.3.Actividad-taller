```mermaid

---
config:
  look: neo
  theme: neo-dark
---
classDiagram
    direction TB

    class Cliente {
        -String dni
        -String nombre
        -List~Vehiculo~ vehiculos
        +addVehiculo(Vehiculo v)
    }

    class Vehiculo {
        <<abstract>>
        -String matricula
        -String modelo
        -List~Reparacion~ reparaciones
        +addReparacion(String desc, double costo)
    }

    class Coche {
        -int numPuertas
    }

    class Moto {
        -boolean tieneSidecar
    }

    class Reparacion {
        -String descripcion
        -double costo
        -LocalDate fecha
    }

    class Especialista {
        <<interface>>
        +reparar(Vehiculo v)
    }

    class Mecanico {
        -String nombre
        -String especialidad
        +reparar(Vehiculo v)
    }

    class Taller {
        -String nombre
        -Mecanico mecanicoAsignado
        +gestionarReparacion(Vehiculo v, String desc, double costo)
    }
    Cliente "1" o-- "1..*" Vehiculo : Agregacion
    Vehiculo <|-- Coche : Herencia
    Vehiculo <|-- Moto : Herencia
    Vehiculo "1" *-- "0..*" Reparacion : Composicion
    Mecanico ..|> Especialista : Realización
    Taller --> Mecanico : Dependencia
    Taller ..> Vehiculo : Usa


El diagrama anterior modela los elementos principales del sistema:
- Cliente: Representa a los usuarios del taller. Cada cliente puede poseer uno o varios vehículos, reflejado mediante una relación de agregación (rombo vacío) y multiplicidad "1..*".
- Vehiculo: Clase abstracta que encapsula los atributos y comportamientos comunes a todos los vehículos. De ella heredan las clases concretas Coche y Moto.
- Reparacion: Cada vehículo mantiene una lista de reparaciones, estableciendo una relación de composición (rombo relleno), ya que una reparación no tiene sentido fuera del contexto de un vehículo.
- Especialista: Interfaz que define el contrato para cualquier entidad capaz de realizar reparaciones. Mecanico implementa esta interfaz, permitiendo polimorfismo y desacoplamiento.
- Taller: Clase que orquesta la gestión de reparaciones, utilizando un mecánico de manera puntual (dependencia) para asignar y ejecutar reparaciones sobre los vehículos.

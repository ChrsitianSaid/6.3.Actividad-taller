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

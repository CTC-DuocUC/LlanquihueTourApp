# LlanquihueTourApp

## Autor del proyecto

- **Nombre completo:** Cristopher Tropa Cabrera
- **Carrera:** Analista Programador Computacional

---

## Descripción general del sistema

Sistema en Java que modela la gestión de tours de la agencia Llanquihue Tour, ubicada en la
Región de Los Lagos. Lee registros desde un archivo .txt, los convierte en objetos y los
almacena en un ArrayList. Aplica composición entre Tour y Operador, validaciones básicas
y filtros por tipo y precio.

---

## Paquetes y clases implementadas

```
LlanquihueTourApp/
├── model/
│   ├── Tour.java          (clase principal del dominio, tiene un Operador)
│   └── Operador.java      (clase compuesta dentro de Tour)
├── util/
│   └── Validador.java     (validaciones basicas con try-catch)
├── service/
│   └── TourService.java   (carga el archivo y aplica filtros)
├── app/
│   └── Main.java          (clase principal de ejecucion)
└── resources/
    └── tours.txt          (datos separados por punto y coma)
```

---

## Instrucciones para ejecutar el proyecto

1. Clona el repositorio:

```
git clone https://github.com/CTC-DuocUC/LlanquihueTourApp.git
```

2. Abre el proyecto en NetBeans o IntelliJ IDEA.

3. Verifica que la carpeta `resources/` este en la raiz del proyecto.

4. Ejecuta la clase `app.Main`.

---

**Repositorio GitHub:** https://github.com/CTC-DuocUC/LlanquihueTourApp

**Fecha de entrega:** 22/06/2026

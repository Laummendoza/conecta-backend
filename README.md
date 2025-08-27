# CONECTA

CONECTA es una aplicación asistiva diseñada para que las personas con **Esclerosis Lateral Amiotrófica (ELA)** preserven su capacidad de comunicación y mantengan la conexión con el mundo utilizando su propia voz, incluso en etapas avanzadas de la enfermedad.

---

## 🚀 Objetivo
El objetivo principal es ofrecer una herramienta tecnológica accesible, que permita:
- Facilitar la comunicación de personas con ELA.
- Mejorar la calidad de vida y la autonomía.
- Integrar la tecnología en el cuidado de la salud y la inclusión social.

---

## 🛠️ Tecnologías utilizadas
- **Backend:** Java + Spring Boot  
- **Frontend:** Thymeleaf (para esta primera demo)  
- **Base de datos:** MySQL (en esta etapa inicial también se probó con H2 en memoria)  

---

## 📂 Estructura del proyecto
conecta/
├── src/
│ ├── main/
│ │ ├── java/com/conecta/conecta/ → Código fuente Java
│ │ └── resources/ → Templates Thymeleaf, configuración
│ └── test/ → Tests
├── pom.xml → Dependencias Maven
└── README.md → Documentación del proyecto

yaml
Copiar
Editar

---

## 📌 Endpoints iniciales
- `GET /usuarios` → Lista todos los usuarios.  
- `POST /usuarios` → Crea un nuevo usuario.  
- `GET /frases` → Lista todas las frases.  
- `GET /frases/por-clave?clave=palabra` → Busca frases por palabra clave parcial.  

---

## ✅ Estado actual
- Conexión establecida a base de datos MySQL.  
- Persistencia de entidad `Usuario`.  
- Persistencia de entidad `Frase`.  
- Búsqueda por palabra clave funcionando correctamente.  

---

## 📅 Próximos pasos
1. Mejorar el diseño de las vistas con Thymeleaf.  
2. Documentar API con Swagger/OpenAPI.  
3. Desplegar demo funcional.  
4. Preparar MVP para **InnovELA (septiembre 2025)**.  

---

## 👩‍💻 Autora
Proyecto desarrollado por **Laura Mendoza**  
Médica y desarrolladora backend en formación.  
Participación en concurso InnovELA 2025.  

---

## 🤝 Contribuciones
Actualmente este proyecto está en desarrollo personal.  
En el futuro, se aceptarán contribuciones de colaboradores.  

---

## 📜 Licencia
Este proyecto es de uso académico y social.  
Pendiente de definir licencia (MIT/GPL).

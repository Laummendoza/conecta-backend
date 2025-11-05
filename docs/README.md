# CONECTA - Demo Completa Offline con IndexedDB

Esta es la versión estática **completamente funcional** de CONECTA para GitHub Pages.

## ✨ Características

- **100% Offline**: Funciona sin conexión a internet
- **IndexedDB**: Almacena audios localmente en el navegador
- **Grabación de voz**: Captura y reproduce frases personalizadas
- **Botones Sí/No**: Graba respuestas rápidas con tu propia voz
- **Responsive**: Funciona en móvil, tablet y escritorio
- **Sin servidor**: No necesita backend, todo corre en el navegador

## 🎤 Funcionalidad

### Página de Inicio (index.html)
- Logo CONECTA personalizado
- Diseño moderno y accesible
- Paleta de colores optimizada para ELA
- Botón de acceso a comunicación

### Página de Comunicación (comunicacion.html)
- **Grabar frases libres**: Botón "Grabar frase" (3 segundos)
- **Reproducir frases**: Click en frases guardadas
- **Botones flotantes Sí/No**: Graba tu voz diciendo "Sí" o "No"
- **Almacenamiento persistente**: IndexedDB guarda todos los audios

## 🚀 Cómo usar localmente

1. Abre `index.html` en cualquier navegador moderno (Chrome, Firefox, Edge, Safari)
2. Permite acceso al micrófono cuando lo solicite
3. Graba frases y respuestas Sí/No
4. Los audios se guardan automáticamente en tu navegador

## 🌐 Cómo activar GitHub Pages

1. Ve a tu repositorio: `https://github.com/Laummendoza/conecta-backend`
2. Click en **Settings** → **Pages**
3. En **Source**, selecciona tu branch
4. En **Folder**, selecciona `/docs`
5. Click en **Save**
6. Tu sitio estará en: `https://laummendoza.github.io/conecta-backend/`

## 📁 Archivos incluidos

- `index.html` - Landing page principal
- `comunicacion.html` - Página de comunicación con IndexedDB
- `logo.jpg` - Logo personalizado de CONECTA
- `README.md` - Este archivo

## 🎨 Paleta de colores

- Gris oscuro: `#2d3748` (textos)
- Celeste: `#76abae` (botón Sí, acentos)
- Coral: `#ff7f67` (botón No, CTA)
- Beige: `#f5e6d3` (fondo)

## 💡 Requisitos

- Navegador moderno con soporte para:
  - IndexedDB
  - MediaRecorder API
  - getUserMedia API
- Permisos de micrófono

## 🔒 Privacidad

Todos los audios se guardan **localmente en tu navegador**. Nada se sube a la nube ni se envía a ningún servidor.

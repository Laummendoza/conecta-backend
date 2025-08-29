document.addEventListener("DOMContentLoaded", () => {
    const buttons = document.querySelectorAll(".main-buttons button, .nav-buttons button");
    let timer;

    buttons.forEach(button => {
        // Hover en escritorio
        button.addEventListener("mouseenter", () => {
            timer = setTimeout(() => {
                button.click();
            }, 2000); // 2 segundos "mirada"
        });

        button.addEventListener("mouseleave", () => {
            clearTimeout(timer);
        });

        // Toque prolongado en móvil
        button.addEventListener("touchstart", () => {
            timer = setTimeout(() => {
                button.click();
            }, 2000);
        });

        button.addEventListener("touchend", () => {
            clearTimeout(timer);
        });
    });
});

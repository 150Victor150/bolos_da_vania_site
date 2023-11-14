document.addEventListener("DOMContentLoaded", function () {
    const contactForm = document.getElementById("contact-form");
    const customerForm = document.getElementById("customer-form");
    const customerDetails = document.getElementById("customer-details");

    customerForm.addEventListener("submit", function (event) {
        event.preventDefault();

        // Obter valores do formulário
        const name = document.getElementById("name").value;
        const email = document.getElementById("email").value;
        const message = document.getElementById("message").value;

        // Atualizar dados do cliente na página
        document.getElementById("customer-name").innerText = `Nome: ${name}`;
        document.getElementById("customer-email").innerText = `E-mail: ${email}`;
        document.getElementById("customer-message").innerText = `Mensagem: ${message}`;

        // Alternar entre formulário e detalhes do cliente
        contactForm.style.display = "none";
        customerDetails.style.display = "block";
    });
});
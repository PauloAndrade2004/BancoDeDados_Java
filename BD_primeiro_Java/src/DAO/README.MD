Essa classe tem metodos que fazem a conexão com o banco de dados.

### O PreparedStatement em Java é uma interface usada para executar consultas SQL de forma mais eficiente e segura. Ele pertence ao pacote java.sql e é uma alternativa ao Statement, com vantagens importantes:
🔹 Principais Benefícios do PreparedStatement:

    Evita SQL Injection
        Diferente do Statement, ele usa placeholders (?) para definir valores, evitando ataques de SQL Injection.
    Melhora o desempenho
        O SQL é compilado apenas uma vez e pode ser reutilizado com diferentes parâmetros.
    Facilita a leitura e manutenção
        Separar a lógica SQL dos valores inseridos torna o código mais organizado.
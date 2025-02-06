# Challenge III - PB Springboot Dez 2023
> Status: Entregue
-------------------------------------------------------------------------------------------------------


O MS Notification tem a responsabilidade de gerar novas notificações.

### Colaborador - Alex Spohr

<table>
  <tr>
    <td>E-mail</td>
    <td>GitHub</td>
  </tr>
   <tr>
    <td>alexspohr436@gmail.com</td>
    <td>AlexSpohr</td>
  </tr>
</table>

-------------------------------------------------------------------------------------------------------

### Tecnologias Utilizadas
<table>
  <tr>
    <td>Java</td>
    <td>Spring</td>
    <td>MongoDB Atlas</td>
  </tr>
  <tr>
    <td>17.*</td>
    <td>3.2</td>
    <td>6.0</td>
  </tr>
</table>

-------------------------------------------------------------------------------------------------------

### Setup
1. Clone o repositório
```
git clone https://github.com/AlexSpohr/ms-notification.git
```
2. Configure o banco de dados no arquivo `application.properties`


3. Execute a aplicação
```
mvn spring-boot:run
```
A aplicação deverá estar em execução e acessível em http://localhost:9090/

-------------------------------------------------------------------------------------------------------

### MS Notification

A aplicação está configurada a partir do RabbitMQ, na qual está interligada com o MS User, após cada  
request realizada pelo usuário é criada uma notificação contendo o email evento e data. Essas informações  
são lançadas no producer do MS User e apenas consumidas no MS Notification. As notificações são salvas no  
MongoDB Atlas. 



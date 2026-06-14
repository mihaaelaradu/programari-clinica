https://start.spring.io
<img width="1600" height="869" alt="image" src="https://github.com/user-attachments/assets/7ac6bcb0-91c4-48d6-97bb-df0ba51db324" />

---------------

Resources -> app.yaml: Server:Port:8080

HomeController

Templates->Home.html

Ruleaza fara probleme?
Intra pe http://localhost:8080/home

---------------

<img width="1421" height="868" alt="image" src="https://github.com/user-attachments/assets/265d7eed-8a13-4acd-8ef3-47c762b8dafa" />
<img width="1397" height="812" alt="image" src="https://github.com/user-attachments/assets/15191182-afea-46dd-9a76-36ecd932ca59" />

---------------

Create Entities(Model) + Enums

Repository pt fiecare entitate

---------------

Request + Response + Service

Controllere

Template -> prograamri ->formular, lista

---------

Resources-> Seed.txt

config-> DataLoader 

<img width="956" height="625" alt="image" src="https://github.com/user-attachments/assets/49679b65-6c0c-482f-8607-d69962276890" />


**Domeniul:** Gestiunea programărilor într-o clinică

**Descriere:** Se dorește dezvoltarea unei aplicații pentru gestionarea programărilor făcute de pacienți la medici. O programare poate avea stările: solicitată, confirmată, efectuată, anulată.

**Functionalităti:**

• Pacienții: pot vedea lista programărilor și starea fiecăreia; pot face o programare (aleg medic, data/ora, motiv scurt); pot anula programarea doar dacă este în starea solicitată sau confirmată (cu minim X ore înainte).

• Administratorii/Recepția: pot vizualiza toate programările; pot filtra/căuta după: dată/interval, medic, pacient, stare; pot confirma sau anula programări; pot marca o programare ca efectuată.

• Notificări: pacientul primește notificare la fiecare schimbare de stare.

**Conditii minime pentru evaluare:**

• Aplicația să nu aibă erori de compilare

• Aplicația să nu aibă code autogenerat prin intermediul instrumentelor de IA (ex. ChatGPT)

• Aplicația să treacă de gradul minim de plagiat.

• Aplicația să poată fil accesată la adresa: http://localhost:8080/home

**Cerinte**

Să se implementeze o aplicație Web folosind limbajul Java de programare respectând următoarele restricții:

1. Utilizarea modelului arhitectural de tip Model View Controller - MVC prin intermediul framework-ului Spring
MVC.

2. Utilizarea template engine-ului Thymeleaf pentru a implementa interfața cu utilizatorul.
Configurarea unei baze de date in-memory, H2.

4. Utilizarea Data Mapper-ului Spring Data pentru asocierea datele din baza de date în memoria aplicației Web.

5. La pornirea aplicației tabelele definite sunt populate automat cu cel puțin 5 înregistrări pentru fiecare. Datele sunt preluate dintr-un fişier text.

6.Integrarea DTO-urilor pentru asigurarea comunicării între componentele MVC. Nu este permisă utilizarea modelelor direct în View-uri.

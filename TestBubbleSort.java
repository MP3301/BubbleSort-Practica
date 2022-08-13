package pruebatecnicapractica;

import java.util.ArrayList;
import java.util.List;

public class TestBubbleSort {


    class Client {

        public Integer id;

        public String taxNumber;

        public String name;

    }

    class Account {

        public Integer clientId;

        public Integer bankId;

        public Integer balance;

    }

    class Bank {

        public Integer id;

        public String name;

    }

    List<Client> clients = List.of(
        new Client() {
        {

            id = 1;

            taxNumber = "86620855";

            name = "HECTOR ACUÑA BOLAÑOS";

        }
    }, new Client() {
        {

            id = 2;

            taxNumber = "7317855K";

            name = "JESUS RODRIGUEZ ALVAREZ";

        }
    }, new Client() {
        {

            id = 3;

            taxNumber = "73826497";

            name = "ANDRES NADAL MOLINA";

        }
    }, new Client() {
        {

            id = 4;

            taxNumber = "88587715";

            name = "SALVADOR ARNEDO MANRIQUEZ";

        }
    }, new Client() {
        {

            id = 5;

            taxNumber = "94020190";

            name = "VICTOR MANUEL ROJAS LUCAS";

        }
    }, new Client() {
        {

            id = 6;

            taxNumber = "99804238";

            name = "MOHAMED FERRE SAMPER";

        }
    }
    );

    List<Account> accounts = List.of(
        new Account() {
        {

            clientId = 6;

            bankId = 1;

            balance = 15000;

        }
    }, new Account() {
        {

            clientId = 1;

            bankId = 3;

            balance = 18000;

        }
    }, new Account() {
        {

            clientId = 5;

            bankId = 3;

            balance = 135000;

        }
    }, new Account() {
        {

            clientId = 2;

            bankId = 2;

            balance = 5600;

        }
    }, new Account() {
        {

            clientId = 3;

            bankId = 1;

            balance = 23000;

        }
    }, new Account() {
        {

            clientId = 5;

            bankId = 2;

            balance = 15000;

        }
    }, new Account() {
        {

            clientId = 3;

            bankId = 3;

            balance = 45900;

        }
    }, new Account() {
        {

            clientId = 2;

            bankId = 3;

            balance = 19000;

        }
    }, new Account() {
        {

            clientId = 4;

            bankId = 3;

            balance = 51000;

        }
    }, new Account() {
        {

            clientId = 5;

            bankId = 1;

            balance = 89000;

        }
    }, new Account() {
        {

            clientId = 1;

            bankId = 2;

            balance = 1600;

        }
    }, new Account() {
        {

            clientId = 5;

            bankId = 3;

            balance = 37500;

        }
    }, new Account() {
        {

            clientId = 6;

            bankId = 1;

            balance = 19200;

        }
    }, new Account() {
        {

            clientId = 2;

            bankId = 3;

            balance = 10000;

        }
    }, new Account() {
        {

            clientId = 3;

            bankId = 2;

            balance = 5400;

        }
    }, new Account() {
        {

            clientId = 3;

            bankId = 1;

            balance = 9000;

        }
    }, new Account() {
        {

            clientId = 4;

            bankId = 3;

            balance = 13500;

        }
    }, new Account() {
        {

            clientId = 2;

            bankId = 1;

            balance = 38200;

        }
    }, new Account() {
        {

            clientId = 5;

            bankId = 2;

            balance = 17000;

        }
    }, new Account() {
        {

            clientId = 1;

            bankId = 3;

            balance = 1000;

        }
    }, new Account() {
        {

            clientId = 5;

            bankId = 2;

            balance = 600;

        }
    }, new Account() {
        {

            clientId = 6;

            bankId = 1;

            balance = 16200;

        }
    }, new Account() {
        {

            clientId = 2;

            bankId = 2;

            balance = 10000;

        }
    }
    );

    List<Bank> banks = List.of(
        new Bank() {
        {

            id = 1;

            name = "SANTANDER";

        }
    },
        new Bank() {
        {

            id = 2;

            name = "CHILE";

        }
    },
        new Bank() {
        {

            id = 3;

            name = "ESTADO";

        }
    }
    );


    /*

      SECCIÓN PROBLEMAS:

        - No promover la copia:

          - No preguntar en StackOverflow, foros, o similares ya que estas preguntas/respuestas quedan disponibles a otros candidatos

          - No subir a repositorios públicos (github, o similares)

          - Otros sitios como codepen o editores de texto on-line (codepen, repl, o similares), dejan guardado el código, por lo que les pedimos tampoco usar editores on-line, la mejor forma de debuggear su código es usando un interprete de Java y ejecutarlo de manera local

          - Para nosotros es fácil detectar pruebas con copia, no pierda su tiempo intentando hacerlo

          - Posteriormente, se evaluará conocimiento en programación en entrevistas presenciales

        - Las siguientes son preguntas básicas de Java y manejo de datos. Se evaluará eficiencia, ORDEN y claridad del código entregado.

        - Se debe programar un algoritmo para cada método y que este retorne lo requerido.

        - Debe usar nombres explicativos para sus variables.

        - Los resultados son evaluados con un test automatizado, revise que sus retornos sean con la estructura de datos solicitada en cada pregunta.

        - Métodos menos verbosos, DRY, y buenas prácticas en el código mejoran el puntaje final de su prueba

        - Si necesita hacer supuestos que afecten las respuestas entregadas, por favor déjelos escritos en el cuerpo del correo cuando envíe su prueba (No en este archivo). Supuestos que contradigan lo solicitado, no serán considerados como válidos.

        - Su prueba debe compilar y ejecutarse sin errores con: javac Main.java y java Main

                - Su prueba debe ejecutarse sin errores
    
    

     */
    
    public static void main(String[] args) {
         TestBubbleSort test = new TestBubbleSort();
        
        test.listClientsIdsSortByTaxNumber();
        
    }
    
    // 0 Arreglo con los ids de clientes
    public Integer[] listClientIds() {

        ArrayList<Integer> listClientIds = new ArrayList();

        for (int i = 0; i < clients.size(); i++) {
            // System.err.println(clients.get(i).id.intValue());
            listClientIds.add(clients.get(i).id.intValue());
        }

        return listClientIds.toArray(Integer[]::new);

    }

    // 1 Arreglo con los ids de clientes ordenados por rut
    Integer[] listClientsIdsSortByTaxNumber() {

        // CODE HERE
        ArrayList<Integer> RutSort = new ArrayList<>();
        ArrayList<Integer> ClientIdSort = new ArrayList<>();

       // currentRutString = clients.get(i).taxNumber.replaceAll("\\D", "");
        int prev = 0;
        int currentClientId = 0;
        int next = 0;
        int currentRut = 0;
        int nextRut = 0;
        String currentRutString;

        System.err.println("size " + clients.size());

        Integer a;
        Integer b;
        Integer c;
        Integer d;
        Client y;
        Client z;

      
 
List<Client> clientsAux = new ArrayList<Client>();


        for (int i = 0; i < clients.size(); i++) {

            for (int j = 0; j < clients.size() - i - 1; j++) {

                a = Integer.parseInt(clients.get(j).taxNumber.replaceAll("\\D", ""));
                b = Integer.parseInt(clients.get(j + 1).taxNumber.replaceAll("\\D", ""));

                c = Integer.parseInt(clients.get(j).taxNumber.replaceAll("\\D", ""));
                d = Integer.parseInt(clients.get(j + 1).taxNumber.replaceAll("\\D", ""));

                
                y = clients.get(j);
                
                z = clients.get(j + 1);
                if (a.compareTo(b) > 0) {
                    
                   // clientsAux.add(clients.get(j));
                int temp = d;
               clients.set(j + 1, clients.get(j));
               clients.set(j, clients.get(j + 1));
                }
            }

        }
        
        for (int i = 0; i < clientsAux.size(); i++) {
            System.out.println(clientsAux.get(i).taxNumber);
        }
  ArrayList<Integer> listClientIdss = new ArrayList();

        for (int i = 0; i < clients.size(); i++) {
            // System.err.println(clients.get(i).id.intValue());
            listClientIdss.add(clients.get(i).id.intValue());
        }

               return clients.toArray(Integer[]::new);
    }
}


HTTP(HyperText Transfer Protocol) ,World Wide Web’in temelidir ve hypertext bağlantılarını kullanarak web sayfalarını yüklemek için kullanılır.

HTTP protokolü client-server mimarisinde çalışır. Client tarafından request(istek) gönderilir ve server tarafından response(cevap) alınır.

HTTP, ağa bağlı cihazlar arasında bilgi aktarmak için tasarlanmış bir uygulama katmanı protokolüdür ve bir alt katmanda TCP üzerine kurulmuştur. Bu sebeple HTTP haberleşmeleri sırasında gerçekleşebilecek veri kaybı, veya kaybedilen verinin tekrar gönderimi veya doğru sıraya konması gibi konularla TCP ilgilenir.

Temel Kavramlar:

`	`**User		Client	Hosting	Ip	Domain	Request Respones**

**User**: Kullanıcı

**Client**: İstemci. İstekleri yerine getiren herhangi bir şey. Kumanda, Bilgisayar, Sunucu, Server vs.

User’ın istemciden bir şey istemesi **Request**.

İstemcinin bir yanıt döndürmesi **Respones**.

**Hosting** alan adıdır. www.firat.edu.tr

**Ip** 193.255.124.33

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.001.png "HHTTTP")

Client ile server arasındaki haberleşmeyi sağlayan ilişki protokolüdür.

à**Get**

àHead

à**Post**

à**Put**

à**Delete**

àTrace

àOptions

àConnect

àPatch

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.002.png "a")







![C:\Users\sinan\AppData\Local\Microsoft\Windows\INetCache\Content.Word\AAA.PNG](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.003.png)

REST API çağrılarını http üzerinden yapabiliriz.

REST: REpresentational State Transfer:

Client-server iletişimiyle ilgili bir mimaridir. Client-server arasında ki veri alışverişini SOAP,RPC gibi kompleks mimarilerle sağlamak yerine , http protokolü üzerinden sağlamak için kullanılmaktadır. REST mimarisini kullanan servislere genel olarak RESTfull servis deniyor.

SOAP, RPC’nin aksine basit ve hafiftirler. Aynı zaman da Esnek ve yetenekli. SOAP gibi keskin standartları yoktur.

RESTful servisler’in birçok farklı response tipi olabilir. Bugünlerde popüler olarak JSON kullanılıyor.(Amaca bağlı XML, CSV veya HMTL bile kullanılabilir.) 

Platform  ve dil bağımsızlar.

Hafiftir, kolay extend edilebilir. Gelen, giden data boyutu SOAP ile karşılaştırıldığında çok ufaktır.

Tasarlaması kolaydır ve implementasyonu kolaydır, herhangi bir ekstra tool’a ihtiyacı yoktur.Entegre etmesi kolaydır.

JSON: JavaScript Object Notation



Kullanıcının isteklerine göre bir API oluşturmak. Örneğin

Hava Durumu servisi.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.004.png "1")

Dolar vs Hindistan Rupisi.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.005.png "2")

Yer ve zaman bilgilerine göre sinema biletlerini gösteren.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.006.png "3")





Bunların hepsi aşağıdaki anlamlara gelir.

![C:\Users\sinan\AppData\Local\Microsoft\Windows\INetCache\Content.Word\1.png](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.007.png)

Json dilden bağımsız veri tipidir.

Anahtar-değer.(Key-Value)

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.008.png "Ekran Alıntısı")

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.009.png "2")

HTTP Request

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.010.png "1")
HTTP Response

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.011.png "response")

POJO(Plain Old Java Object) Java’nın Özel Olmayan Nesneleri anlamına gelir. Diğer sınıflardan veya frameworklerden herhangi bir özel bağımlılığı veya mirası olmayan Java sınıfını ifade eder.

POJO, özel alanlara, getter ve setter yöntemlerine sahip basit bir Java nesnesidir. Verileri bir Java nesnesi olarak temsil etmenin ötesinde herhangi bir özel davranışı veya işlevi yoktur.

POJO’lar genellikle Java uygulamalarında basit veri aktarım nesneleri veya basit etki alanı nesneleri olarak kullanılmaktadır. Basittirler, anlaşılması kolaydır ve verileri bir Java nesnesi olarak temsil etmenin ötesinde herhangi bir özel bağımlılıkları veya işlevleri yoktur.


POJO’lar, bakımı ve anlaşılması daha kolay olduğu için genellikle özel bağımlılıkları veya kalıtım ilişkileri olan daha karmaşık sınıflar yerine tercih edilir. Herhangi bir özel bağımlılıkları veya gereksinimleri olmadığı için daha geniş bağlamlarda da kullanılabilirler.

Java POJO Örneği

public class Person { 

private String name; 

private int age;

` `// No-argument constructor

` `public Person() { }

` `// Constructor with arguments

public Person(String name, int age)

` `{ this.name = name; this.age = age; } 

// Getter and setter methods 

public String getName() { return name; } 

public void setName(String name) { this.name = name; }

public int getAge() { return age; } 

public void setAge(int age) { this.age = age; } 

}

Jackson Kütüphanesi(Json to Java & Java to Json)

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.012.png "1")

@PathVariable: Bir metodun çağrılması sırasında gönderilen bir yol değişkeni almasını sağlar. Örneğin , bir metodun /customer/{id} adresiyle çağrılması sırasında gönderilen “id” değişkeni almasını sağlamak için kullanılır.

@RestController

@RequestMapping("/api") 

public class StudentRestController {

` `@GetMapping("/students/{studentId}") 

public Student getStudent(@PathVariable int studentId) { 

List theStudents = new ArrayList<>(); 

return theStudents.get(studentId); 

}

}

@ControlAdvice  ile servislerimize ait özel hataları daha iyi yönetebilir, monitör edebilir ve kolay okunabilir kodlar yazabiliriz.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.013.png "aa")





API endpointlerimiz böyle olmalı. @RestController  kullanılmalı

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.014.png "a")

Böyle olmamalı.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.015.png "b")

Örneğin Paypal’ın endpointleri.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.016.png "aa")






Service katmanı veritabanına gelen giden verileri filtrelemek veyahut özel kurallar koymak için kullanılır.

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.017.png "a")

@Transactional genelde servis katmanında kullanılır.

Ama Jpa Repository kullanırsak @Transactional’ a gerek kalmıyor.

Spring Data Rest ile

-Employee Entity sınıfı 

-JpaRepository,(EmployeeRepository extends JpaRepository<Employee,Long>)

-Pom xml’de spring-boot-starter-data-rest

Eğer yukarıda üç’ü varsa çalıştırdıktan sonra service ve controller yazmaya gerek yok bunlar otomatik olarak çalışır.(!Entity sınıfının sonuna s getirerek oluşturur apiEndpointlerini)

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.018.png "aaa")

spring.data.rest.base-path=/magic-api

Bunu application.properties kısmına yazarsak endpoint’imiz şu şekilde olur.

<http://localhost:8080/magic-api/employees>

![](Aspose.Words.621754da-0ce1-4b44-b1a7-5902eb1e16ed.019.png "aa")

Eğer özel bir ad ile DataJpa’yı kullanmak istersek @RepositoryRestResource(path=”path\_name”) kullanırız.




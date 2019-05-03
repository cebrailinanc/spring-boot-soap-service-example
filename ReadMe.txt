Projede spring-boot framework ü kullanılarak soap servis oluşturdu.
Soap servisi geliştirirken aşağıdaki adımları sırasıyla uygulamalısınız.
sınıfların içinde ek açıklamalar eklendi.
1- xsd (XML schema) dosyası oluşturulur. Dosyada request ve response tanımlanır.
2- xsd deki domain sınıfları jaxb2-maven-plugin kullanırılarak ide tarafından otomatik üretilir.
3- repository ler veritabanından verinin getirilmesinden sorumludur. Veri tabanıyla uğraşmadan listede tutulan 
veriyi servise göndereceğiz.

4- servisin endpoint i tanımlanır. EndPoint url'dir. İsteklerin yapıldığı adres.
xml mesajlarını yönetir.
(Spring WS annotations to handle the incoming SOAP requests.)



Not: spring boot WSDL operasyonlarını oluştururken request ve response biten tanımları kullanır.
Servisin WSDL düzgün üretilmesi için xsd dosyasında request ve response son ek olarak imzalara eklenmeli.
Eklenmediğinde wsdl:operation oluşturulamayacaktır.

The default request suffix is Request; the default response suffix is Response, though these can be changed by setting the requestSuffix and responseSuffix properties, respectively.
You can hence, in the mentioned example code, change the suffix in the WebServiceConfig configuration class, defaultWsdl11Definition method, adding the following method invocation:
wsdl11Definition.setRequestSuffix("your-new-prefix-here");


service: http://localhost:8080/ws/vehicleUrl.wsdl
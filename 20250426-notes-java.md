
- [[20250426-notes-java.md]]

- # AP Computer Science A

- ## Konu Başlıkları:
	- Grok Topics: [Topics](https://grok.com/chat/f77733e3-ef94-4fae-913d-a21072f5d02c)
	- Explain Subtopics: [Explain](https://grok.com/chat/d5daa045-2e94-4e8d-ad08-58fe29334576)
- ## Topics
	- Primitive Data Types
		- Type casting
	- Objects
		- Class
		- Instance: Class (genel) örnekleri. 
			- Örnek: Mercedes bir marka. Bu bir class a denk gelir.
			- Bizim Mercedes arabamız, bu markadaki bir örnek araba. Fiziksel bir örnek. Buna instance diyoruz.
			- Class aslında kavramsal bir şeydir.
			- Instance fiziksel bir varlıktır.
			- Class kavramsal olduğu için, onu dünyada bir fiziksel somut örnekle gösteremeyiz.
			- Zihnimizde olan bir modeldir.
		- Method call:
			- Method vs. Function
				- Bir class içinde tanımladığın tüm fonksiyonlara method deriz.
				- Javada neredeyse tüm fonksiyonlar bu şekilde tanımlanır.
				- Dolayısıyla arasındaki farkı bilmenize çok gerek yok.
				- Method = function gibi düşünebilirsin.
				- Method: İkiye ayrılır:
					- Static (class) method: Obje oluşturmana gerek yok. Doğrudan class üzerinden fonksiyonu çağırabilirsin.
					- Instance method: Önce obje instance oluşturursun. Sonra obje üzerinden fonksiyonu çağırmak.
		- Reference vs. primitive value:
			- String x = "ali"
				- x: reference 
			- int y = 10
				- y: primitive value içerir
	- if statements
		- Nested (içiçe) conditional: if içinde bir if olması
		- Statement: Her satır. `;` ile biten her ifadeye statement deriz.
	- Iteration
		- Iteration: Döngü (for loop, while loop)
		- Nested loop: İçiçe döngü olması (for içinde bir for daha olması)
		- `break`, `continue`: Bunlar çok nadir kullanılır. Aslında tavsiye edilmez.
	- Class
		- Attribute = property = instance variable (member)
		- Methods: instance method
		- Static attribute veya static method da olabilir
			- Herhangi bir class member başına `static` kelimesi konulursa, o member artık, instance değil, class a ait bir özelliktir.
		- Public vs private
		- Constructor



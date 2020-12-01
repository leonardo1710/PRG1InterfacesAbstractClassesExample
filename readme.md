# Java Interface vs. Abstract Class

### Abstract Class
- kann abtract Methoden haben, muss aber nicht
- abstrakte Methoden müssen von Subklassen implementiert werden
- kann nicht instanziert werden
- kann public, private und protected Modifier haben
- Java Klasse kann nur eine Abstract Class implementieren
- Abstract Class kann mehrere Interfaces extenden
- Keyword IMPLEMENTS

### Interface
- ist nur eine Deklaration von Methoden (keine Implementierung)
- Klassen, die das Interface implementieren MÜSSEN die Methoden implementieren (Contract)
- Variablen sind immer final
- Methoden sind immer public
- Keyword EXTENDS

### Wann Abstract Class?
- Bei Vererbung gut - stellt eine Basisklasse inkl. default Implementierungen zur Verfügung
- wenn private oder protected Methoden/Variablen verwendet werden 
- bei Erweiterungen in der Zukunft (kein Problem, alle Subklassen erben Implementierung)
- teilweise Implementierung von ähnlichen Objekten
- für Klassen/Objekte die zusammenhängend sind

### Wann Interface?
- Wenn Funktionalität für viele, wenig zusammenhängende Klassen notwendig
- wenn sich die Schnittstelle längere Zeit nicht ändert
- Wenn wir Multiple Vererbungen umsetzen wollen (Klassen können mehrere Interfaces implementieren)

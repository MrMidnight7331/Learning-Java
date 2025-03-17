## Queue, List, Stack – Vor- und Nachteile

### **Queue (FIFO - First In, First Out)**
**Vorteile**:  
- Effizient für Warteschlangen
- Klare Reihenfolge der Verarbeitung  
- Gute Performance bei Enqueue/Dequeue

**Nachteile**:  
- Keine direkte Elementzugriffe (nur erstes Element erreichbar)  
- Kann Speicher ineffizient nutzen, wenn nicht gut implementiert  

---

### **List (Allgemeine Liste)**
**Vorteile**:  
- Flexible Datenstruktur (Hinzufügen/Löschen überall möglich)  
- Unterstützt zufälligen Zugriff bei Arrays  

**Nachteile**:  
- Ineffiziente Einfüge-/Löschoperationen in der Mitte (bei Arrays O(n))  
- Mehr Speicherverbrauch bei verlinkten Listen (zusätzliche Zeiger)  

---

### **Stack (LIFO - Last In, First Out)**
**Vorteile**:  
- Ideal für rekursive Algorithmen und Backtracking  
- Push und Pop sind sehr effizient (O(1))  
- Speicherverwaltung einfach (z. B. Call Stack in Programmen)  

**Nachteile**:  
- Kein direkter Zugriff auf ältere Elemente  
- Kann zu Stack Overflow führen, wenn nicht korrekt verwaltet  

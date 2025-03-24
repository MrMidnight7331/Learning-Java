# Abi 2018 Aufgaben

### Aufgabe a

**Beziehungen:**
- Die Klasse `Verwaltung` besitzt eine Liste von `Grundstueck`-Objekten (`alleGrundstuecke`).
- Jedes `Grundstueck` enthält eine Liste von `Einbruch`-Objekten.
- Zwischen `Verwaltung` und `Einbruch` besteht keine direkte Verbindung, sondern nur über die `Grundstueck`-Objekte.

**Warum Liste statt Array?**
- Die Anzahl der Einbrüche pro Grundstück ist nicht vorher bekannt.
- Listen sind dynamisch erweiterbar, Arrays haben feste Größe.
- Mit der `List`-Klasse können neue Einbrüche eingefügt, durchlaufen oder gelöscht werden.

---

### Aufgabe b 

**Beispiel:**
Aufruf:
```java
fuegeEinbruchHinzu(new Grundstueck("Schulstr.", "1"), new Einbruch(false));
```

**Verarbeitungsschritte:**
1. Wenn das Grundstück nicht existiert, wird es hinzugefügt.
2. Der Einbruch wird dem Grundstück hinzugefügt.
3. Alle Grundstücke im Umkreis von 1000 Metern werden betrachtet.
4. Je näher ein Grundstück am Einbruchsort liegt, desto stärker beeinflusst der Einbruch seinen Gefährdungsindex.
   - Unaufgeklärt: Erhöhung um (2000 - Abstand)
   - Aufgeklärt: Erhöhung um (1000 - Abstand)

**Neuberechnung für Tabelle:**
| Grundstück     | Abstand | alter Index | neuer Index         |
|----------------|---------|-------------|----------------------|
| Schulstr. 20   | 200     | 1000        | 1000 - 200 + 2000 = **2800** |
| Bergweg 24     | 750     | 5000        | 5000 - 750 + 2000 = **6250** |
| Marktplatz 2a  | 500     | 1000        | 1000 - 500 + 2000 = **2500** |
| Schulstr. 1    | 0       | 2000        | 2000 - 0 + 2000 = **4000** |
| Landstr. 123   | 2500    | 500         | **500** (außerhalb Radius) |

---

### Aufgabe c

**Strategie:**
1. Leere Ergebnisliste erstellen.
2. Alle Grundstücke durchlaufen.
3. Für jedes Grundstück alle Einbrüche zählen, die **nicht aufgeklärt** sind.
4. Wenn Anzahl ≥ `pMinAnzahl`, dann zur Ergebnisliste hinzufügen.

**Implementierung:**

```java
public List<Grundstueck> ermittleEinbruchsschwerpunkte(int pMinAnzahl){
    List<Grundstueck> ergebnis = new List<Grundstueck>();
    alleGrundstuecke.toFirst();
    while(alleGrundstuecke.hasAccess()){
        Grundstueck g = alleGrundstuecke.getContent();
        int anzahl = 0;
        List<Einbruch> einbrueche = g.gibEinbrueche();
        einbrueche.toFirst();
        while(einbrueche.hasAccess()){
            Einbruch e = einbrueche.getContent();
            if(!e.istAufgeklaert()){
                anzahl++;
            }
            einbrueche.next();
        }
        if(anzahl >= pMinAnzahl){
            ergebnis.append(g);
        }
        alleGrundstuecke.next();
    }
    return ergebnis;
}
```

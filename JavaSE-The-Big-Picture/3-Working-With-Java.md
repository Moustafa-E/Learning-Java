## Desktop Java Development
<span style=color:pink>Swing</span> is a desktop app development toolkit for Java. 
It offers Pure, Java-based UI controls as well as cross-platform looks. Intellij IDEA was actually built in this. 
Using it right now to make these notes in fact. 

<span style=color:pink>OpenJFX</span> / FXML (decouples GUI Design from app code) are the modern approach for advanced controls, animations/3D Graphics, and supports CSS (See "Skinnable").
This is a subproject of the JDK and doesn't get shipped with it. For making desktop apps with purely the JDK, Swing works fine. Mainstream app dev focuses on WebApps though. 

## Enterprise Java (JEE)
Big apps tend to use **a lot** of 3rd party libraries for common functionality. 
For really complex apps, this can bleed into the hundreds which would *suck* to select manage manually. 
And so we have another acronym, <span style=color:pink>JEE</span>. 
This enterprise edition of Java is a stack specification of pre-packaged tech built on top of the Java SE APIs mentioned in md-1.

JEE provides lots of features including:
- Data persistance
- Web applications
- Security
- Messaging
- JSON/XML handling

Given it's a specification, many distributions of it exist (similar to JDK) from companies like Oracle WebLogic & RedHat WildFly etc

Here's an example of the tech stack we've covered so far. Java EE App Distro supplies small blue modules. 
```mermaid
block-beta
    columns 4
    1["enterprise app"]:4
    a["Persistence"] b["Java Beans"] c["..."] d["Server Faces"]
    e["Java EE APIs (App server distribution)"]:4
    g["Java SE APIs"]:4
    h["Java Virtual Machine"]:4
    
    classDef JEE fill:#2b1852,stroke:#8d69d6,stroke-width:1px;
    classDef JSE fill:#0b112b,stroke:#3f4669,stroke-width:2px;
    
    class a,b,c,d,e JSE

```

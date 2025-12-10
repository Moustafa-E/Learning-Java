# The Platform

## JDK, JRE, JDE, JVM, JSE-API 
We can split Java into the 3 basic parts below:

### 1. Programming Language
Defines Syntax, keywords file structure, etc.
### 2. Runtime Environment
Where Java code is executed. The Java Virtual Machine (<span style="color:pink">JVM</span>) and Standard Edition APIs (<span style="color:pink">JSE-API</span>) make up the (<span style="color:pink">JDK</span>) - The Java Development Kit.
The JVM is responsible for abstracting away Bytecode and turning it into machine code readable by the OS & Hardware it sits in. 
### 3. Standard Library
Collection of code written for us so that we aren't constantly re-inventing the wheel. Third party libraries exist too, but they don't come prepackaged with Java. 

## The Development Cycle
```mermaid
flowchart LR
    TPL("Third-Party Libraries (JARs)")
    SC("Source Code (.java)")
    C("Compiler")
    B("Bytecode (.class)")
    JSE("Java SE APIs")
    JVM["Java Virtual Machine"]
    OS["Operating System"]
    HW["Hardware"]

    subgraph S1["Runtime Environment"]
        direction LR
        HW
        OS
        subgraph S11["JDK"]
        direction LR
            JVM
            JSE
        end

        S11 --> OS --> HW
    end

    subgraph S2["Development Environment"]
        direction LR
        SC
        C
        TPL
        
        subgraph S21["Bytecode"]
        direction LR
            B
            TPL
        end

        SC --- C
        C --> S21
    end

%% Dev to Runtime
    S21 --> S11

```
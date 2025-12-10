# The Platform

## The JDK
We can split Java into the 3 parts below. These make up the <span style="color:pink">Java Development Kit (JDK)</span>. This contains all the tools needed to run Java apps. 

### 1. Programming Language
Defines Syntax, keywords file structure, etc.
### 2. Runtime Environment
Where Java code is executed. This abstracts away the code from the underlying hardware, meaning it can run anywhere. 
### 3. Standard Library
Collection of code written for us so that we aren't constantly re-inventing the wheel.
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
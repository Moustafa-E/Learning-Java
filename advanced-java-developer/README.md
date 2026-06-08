<img src="https://github.com/stayahead-training/shared/blob/master/stayahead.png" />

# Advanced Java Developer

> [Internationalisation](#internationalisation)<br />
  [Generics](#generics)<br />
  [Collections](#collections)<br />
  [Nested Classes and Lambdas](#nested-classes-and-lambdas)<br />
  [Streams](#streams)<br />
  [IO and NIO](#io-and-nio)<br />
  [Concurrency](#concurrency)<br />
  [Modules](#modules)<br />
  [Annotations and Reflection](#annotations-and-reflection)<br />
  [Logging](#logging)<br />
  [Secure Coding](#secure-coding)

## Internationalisation

[Recommended reading](content/recommended-reading.md#internationalisation) | [Slides](content/slides/01-internationalisation.pdf)

- About internationalisation
- Locale
- ResourceBundle
- Date formatting
- Number formatting
- Message formatting

## Generics

[Recommended reading](content/recommended-reading.md#generics) | [Slides](content/slides/02-generics.pdf)

- About generics
- Generic types
- Raw types
- Generic methods
- Type inference
- Bounded type parameters
- Inheritance
- Wildcards
- Covariance and contravariance
- PECS
- Type erasure
- Restrictions
- **[Guided exercise - custom queue](content/exercises/guided/generics/custom-queue)**
- **[Guided exercise - array to list](content/exercises/guided/generics/array-to-list)**

## Collections

[Recommended reading](content/recommended-reading.md#collections) | [Slides](content/slides/03-collections.pdf)

- About collections
- Collections framework
- Collection vs array
- Collection hierarchy
- Collection methods
- Iterating over a Collection
- Big O notation
- Lists
- Sets
- Immutable collections
- The Collections class
- Queues
- Stacks
- Maps
- Sequenced Collections and Maps
- **[Guided exercise - shopping cart](content/exercises/guided/collections/shopping-cart)**

## Nested Classes and Lambdas

[Recommended reading](content/recommended-reading.md#nested-classes-and-lambdas) | [Slides](content/slides/04-nested-classes-and-lambdas.pdf)

- Nested classes
- Inner classes
- Static nested classes
- Shadowing
- Local classes
- Anonymous classes
- Lambda expressions
- Functional interfaces
- Method references
- Combining lambdas
- **[Guided exercise - lambda expressions](content/exercises/guided/nested-classes-and-lambdas/lambda-expressions)**

## Streams

[Recommended reading](content/recommended-reading.md#streams) | [Slides](content/slides/05-streams.pdf)

- Collection transformation
- Map-filter-reduce
- The Stream pattern
- Reducing to a Collection
- Primitive Streams
- Optional
- Good practice
- Creating Streams
- Intermediate operations
- Terminal operations
- Collectors
- **[Guided exercise - course processor](content/exercises/guided/streams/course-processor)**

## IO and NIO

[Recommended reading](content/recommended-reading.md#io-and-nio) | [Slides](content/slides/06-io-and-nio.pdf)

- About IO, NIO, and NIO2
- IO streams
- java.io.File
- java.nio.file.Path
- java.nio.file.FileSystem
- java.nio.file.Files
- Walking a file tree
- Watching a directory for changes
- Reading and writing small files
- Character sets
- Buffering
- Reading and writing text and binary files
- Decoration
- Serialisation

## Concurrency

[Recommended reading](content/recommended-reading.md#concurrency) | [Slides](content/slides/07-concurrency.pdf)

- About concurrency
- Threads
- Runnable
- Identifying Threads
- Pausing a Thread
- Waiting for a Thread to finish
- Stopping a Thread
- Daemon Threads
- ExecutorService
- Future
- Callable
- Platform Threads
- Virtual Threads
- Java memory model
- Data sharing
- Race conditions
- Thread safety
- Immutability
- Synchronised methods and blocks
- Hardware memory model
- The volatile keyword
- ThreadLocal
- Deadlock
- Synchronised and concurrent collections
- Atomic objects
- Parallel Streams
- **[Guided exercise - movie fetcher](content/exercises/guided/concurrency/movie-fetcher)**

## Modules

[Recommended reading](content/recommended-reading.md#modules) | [Slides](content/slides/08-modules.pdf)

- About modules
- Custom modules
- Module declarations
- Concepts
- Lauching modules
- Reflective access
- Services
- The unnamed module
- Automatic modules
- Building modules
- Runtime and application images
- **[Guided exercise - joke service](content/exercises/guided/modules/joke-service)**

## Annotations and Reflection

[Recommended reading](content/recommended-reading.md#annotations-and-reflection) | [Slides](content/slides/09-annotations-and-reflection.pdf)

- About annotations
- Annotation format
- Applying annotations
- Declaring annotations
- Annotation retention
- Annotation targets
- Built-in annotations
- About reflection
- The Class class
- Shallow reflection
- Deep reflection
- **[Guided exercise - validator](content/exercises/guided/annotations-and-reflection/validator)**

## Logging

[Recommended reading](content/recommended-reading.md#logging) | [Slides](content/slides/10-logging.pdf)

- About logging
- Logging frameworks
- Components
- Configuration
- Loggers
- Logger hierarchy
- Logging events
- Appenders/handlers
- Layouts/formatters
- Log levels
- **[Guided exercise - book store](content/exercises/guided/logging/book-store)**

## Secure Coding

[Recommended reading](content/recommended-reading.md#secure-coding) | [Slides](content/slides/11-secure-coding.pdf)

- About secure coding
- Fundamentals
- Denial of service
- Confidential information
- Injection and inclusion
- Accessibility and extensibility
- Input validation
- Mutability
- Object construction
- Serialisation
- Access control
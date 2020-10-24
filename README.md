# <i>apply, let, with, also, run</i>

## <B>In terms of context object type,</B>

### context object is lambda receiver(this) - <i>run, with, apply</i>
Do something directly related to manipulating context object.
* ```apply``` returns context object.
```kotlin
val p = Person("name").apply{
    age = 20
    city = "Seoul"
}
```
* ```run``` and ```with``` return lambda result.

### context object is lambda argument(it) - <i>also, let</i>
Aside from context object itself, do something else.
* ```also``` returns context object.
* ```let``` returns lambda result.
---
---

## <b>In terms of return value,</b>

### returns context object
* ```apply``` - this
* ```also```- it

### returns lambda result
* ```with``` and ```run``` - this
* ```let``` - it
```kotlin
val people = mutableListOf(jonathan, tyler, trevor)
val cntNameEndsWithR = people.run{
    add(alan)
    add(keller)
    count{it.endsWith("r")}
}
println("Number of names ending with R: $cntNameEndsWithR") //3
```
---
---

## <b>Respectively,</b>
* let - it, lambda result
* apply - this, lambda result
* also - it, context object
* run - this, lambda result
* with - this, lambda result
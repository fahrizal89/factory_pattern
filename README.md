# The Abstract Factory Pattern
Provides an interface for creating famiies of related or dependent objects without specifiying their concrete classes.

Separate screation with generic usage but creation procress having different process.

For learning The Factory Pattern, I create program "Noodles Factory" to create noodles.

Basically, create noodles can use:
```
if(type.equals(...)
```
But if we want to create store more than one, it should create redundant code

Creator Class:

NoodleStore (Abstract)

IndonesianNoddleStore -> NoodleStore (Abstract)

KoreanNoodleStore -> NoodleStore (Abstract)

Product Class:

Noodles (Abstract)

```
Samyang
Goreng
IgaBakar
```

Process:
```
1. Create Instance Store
2. In Store automatically call createNoodles
3. In create noodles create noodles by type
4. Create noodles using parameter Factory
```

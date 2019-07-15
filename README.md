# The Factory Pattern
Separate screation with generic usage but creation procress having different process.

For learning The Factory Pattern, I create program "Noodles Factory" to create noodles.

```
Noodles 

Variants:
Samyang
Goreng
IgaBakar
```

Basically, create noodles can use:
```
if(type.equals(...)
```
But if we want to create store more than one, it should create redundant code.


1. Simple Factory

Decouple of creating object in another class, so any object can create using simple Factory.
```
public class SimpleNoodleFactory(){
  public Noodles createNoodles(String type){
    Noodles noodles=null;
    if(type.equals("SAMYANG"){
      noodles = new SamyangNoodles();
    }
    else if(type.equals("GORENG"){
      noodles = new GorengNoodles();
    }
    ....
  }
}
```

2. Method Factory Pattern

Define interface for creating an object, but letst subclass decide which class to instantiate.
```
public class IndonesiaNoodleStore extends NoodleStore {
    @Override
    Noodles createNoodles(String type) {
        Noodles noodles=null;
        if(type.equals("SAMYANG")){
            noodles = new IndonesiaSamyangNoodles();
            noodles.name = "Mie Samyang";
        }
        else if(type.equals("IGA BAKAR")){
            noodles = new IndonesiaIgaBakarNoodles();
            noodles.name = "Mie Iga Bakar";
        }
        else if(type.equals("GORENG")){
            noodles = new IndonesiaGorengNoodles();
            noodles.name = "Mie Goreng";
        }

        return noodles;
    }
}
```

```
public class IndonesiaGorengNoodles(){
  public IndonesiaGorengNoodles(){
    name = "Mie Goreng";
    System.out.println("preparing..." +name);
    isThrowAwayWater = true;
  }
}
```

3. Abstract Factory Pattern

Provides an interface for creating famiies of related or dependent objects without specifiying their concrete classes.

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

```
public class IndonesiaNoodleStore extends NoodleStore {

    @Override
    Noodles createNoodles(String type) {
        Noodles noodles=null;
        NoodlesIngredientFactory noodlesIngredientFactory = new IndonesiaNoodlesIngredientsFactory();

        if(type.equals("SAMYANG")){
            noodles = new SamyangNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Samyang";
        }
        else if(type.equals("IGA BAKAR")){
            noodles = new IgaBakarNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Iga Bakar";
        }
        else if(type.equals("GORENG")){
            noodles = new GorengNoodles( noodlesIngredientFactory);
            noodles.name = "Mie Goreng";
        }

        return noodles;
    }
}
```

```
public class SamyangNoodles extends Noodles {
    private final NoodlesIngredientFactory noodlesIngredientFactory;
    
    public SamyangNoodles(NoodlesIngredientFactory noodlesIngredientFactory) {
        this.noodlesIngredientFactory = noodlesIngredientFactory;
        prepare();
    }

    @Override
    public void prepare() {
        name = "Mie Samyang";
        System.out.println("Boiled "+name+" ...");
        isThrowAwayWater = false;
        seasoning = noodlesIngredientFactory.createSeasoning();
        sauce = noodlesIngredientFactory.createSauce();
    }
}
```

Process:
```
1. Create Instance Store
2. In Store automatically call createNoodles
3. In create noodles create noodles by type
4. Create noodles using parameter Factory
```

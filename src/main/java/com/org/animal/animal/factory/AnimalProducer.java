package com.org.animal.animal.factory;

import com.org.animal.AnimalType;

public class AnimalProducer {
   public static AbstractFactoryAnimal getFactory(AnimalType animalType){
   
      if(animalType.equals(AnimalType.BIRD)){
         return new BirdFactory();
         
      }else if(animalType.equals(AnimalType.FISH)){
         return new FishFactory();
      } else if(animalType.equals(AnimalType.SEA_ANIMAL)){
             return new SeaAnimalFactory();
      } else if(animalType.equals(AnimalType.INSECT)){
          return new InsectFactory();
      }      
      return null;
   }
}

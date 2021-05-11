package pooHeranca;

public class Cachorro extends Animal {

		public Cachorro(String nomeAnimal, int idadeAnimal) {
			super(nomeAnimal, idadeAnimal);
		}

        public void correr() {
         System.out.println("Correndo...");
        }	
        	
        }
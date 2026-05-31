// PalmerPenguinsM3.java
// Lindsey Diamond
// 5/31/26
// This program calculates and displays the population count of the species of the palmer penguins

public class PalmerPenguinsM3 {

    // constants to represent the species names & number of species
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    
    static final int NUM_CHINSTRAP = 68;
    static final int NUM_GENTOO = 123;
    static final int NUM_ADELIE = 151;
    
    static int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
   
    static final int TOTAL_SPECIES = 3;
   
    public static void main(String[] args) {
   
        // outputs an introduction of the species and how many there are
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES + 
                           " penguin species in this dataset.");
        System.out.println("There are a total of " + totalPenguins + 
                           " penguins in the dataset.");

        // outputs each species with its total count and percent of penguins
        System.out.printf("%s: %d (%.2f%%)\n", 
            SP_CHINSTRAP, 
            NUM_CHINSTRAP,
            ((double) NUM_CHINSTRAP / totalPenguins * 100));
        System.out.printf("%s: %d (%.2f%%)\n", 
            SP_GENTOO, 
            NUM_GENTOO,
            ((double) NUM_GENTOO / totalPenguins * 100));
        System.out.printf("%s: %d (%.2f%%)\n",
            SP_ADELIE,
            NUM_ADELIE,
            ((double) NUM_ADELIE / totalPenguins *100 ));
            
        System.out.println();
        System.out.println("Branching Analysis:");
        
        // calculates which penguin species has the highest population
        // prints the species with the highest population
        if (NUM_CHINSTRAP > NUM_GENTOO && NUM_CHINSTRAP >
        NUM_ADELIE) {
           System.out.println(SP_CHINSTRAP + 
           " penguins are the most populous.");
       } else if (NUM_GENTOO > NUM_CHINSTRAP &&
                  NUM_GENTOO > NUM_ADELIE) {
           System.out.println(SP_GENTOO +
               " penguins are the most populous.");
       } else if (NUM_ADELIE > NUM_CHINSTRAP &&
                  NUM_ADELIE > NUM_GENTOO) {
           System.out.println(SP_ADELIE +
               " penguins are the most populous.");
       } else {
           System.out.println("There is a tie between species for the most populous.");
       }
       
       System.out.println();
       System.out.println("Individual Species Switch Statement Analysis:");
       
       // chooses which species to analyze in the switch statement
       String chosenSpecies = SP_GENTOO;
       
       // uses a switch statement to display population and percentage
       // of the chosen species
       switch (chosenSpecies) {
       // chinstrap is selected in switch statement
       // displays the chinstrap population and percentage
           case SP_CHINSTRAP:
               System.out.printf("%s: %d (%.2f%%)\n",
                   SP_CHINSTRAP,
                   NUM_CHINSTRAP,
                   ((double) NUM_CHINSTRAP / totalPenguins * 100));
               break;
       // gentoo is selected in switch statement
       // displays the gentoo population and percentage
       case SP_GENTOO:
           System.out.printf("%s: %d (%.2f%%)\n",
               SP_GENTOO,
               NUM_GENTOO,
               ((double) NUM_GENTOO / totalPenguins * 100));
           break;
       // adelie is selected in switch statement
       // displays the adelie population and percentage
       case SP_ADELIE:
           System.out.printf("%s: %d (%.2f%%)\n",
               SP_ADELIE,
               NUM_ADELIE,
               ((double) NUM_ADELIE / totalPenguins * 100));
           break;
       // if none of the cases match dataset, it outputs invalid statement
       default:
           System.out.println("Species not recognized.");
       }
   }
}
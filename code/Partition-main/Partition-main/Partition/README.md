Partition

Fonction qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties :

 

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]


Importation

- Dans le projet, importer la librairie myLibrary-1.jar

	Exemple avec Intellij : File/Project Structure/Libraries

- Dans votre classe, ajouter l'import :
	import com.espaceptc.mylibrary.MyLibrary;



Exemple d'utilisation
	
// création de l'ArrayList
        List<Integer> listeInt = new ArrayList<>();
        listeInt.add(1);
        listeInt.add(2);
        listeInt.add(3);
        listeInt.add(4);
        listeInt.add(5);
        listeInt.add(6);
        listeInt.add(7);
        listeInt.add(8);

        int size = 2;
        System.out.println(MyLibrary.partition(listeInt, size));

        size = 3;
        System.out.println(MyLibrary.partition(listeInt, size));	


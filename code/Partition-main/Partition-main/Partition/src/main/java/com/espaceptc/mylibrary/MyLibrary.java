package com.espaceptc.mylibrary;

import com.espaceptc.mylibrary.Exceptions.ListParamException;
import com.espaceptc.mylibrary.Exceptions.SizeParamException;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette librairie permet d'effectuer des operations sur une liste d'elements de type int
 */
public class MyLibrary {
    private static int indexEnCours;
    private static int listSize;
    private static List<ArrayList<Integer>> listRetour;

    /**
     * fonction qui prend un parametre liste et un parametre taille et retourne une liste
     * de sous liste, ou chaque sous liste a au maximum taille elements.
     * Exemples d'entrees et sorties :
     * <p>
     * partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
     * partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
     * partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
     *
     * @param list : liste d'éléments de type int
     * @param size : taille des sous listes
     * @return : liste de sous listes de taille size
     * @throws Exception
     */
    public static List<ArrayList<Integer>> partition(final List<Integer> list, final int size) throws Exception {
        listRetour = new ArrayList<ArrayList<Integer>>();

        indexEnCours = 0;

        if (list == null) {
            throw new ListParamException("list can't be null");
        }

        if (size <= 0) {
            throw new SizeParamException("size can't be null or negative");
        }

        if (list.isEmpty()) {
            return listRetour;
        }

        listSize = list.size();
        do {
            // Création d'une sous liste de <size> elements
            listRetour.add(makeSublist(list, size));
        }
        while (indexEnCours < list.size());

        return listRetour;
    }

    /**
     * Methode retournant une sous liste de size elements
     *
     * @param list : liste d'éléments de type int
     * @param size : taille de la sous liste
     * @return
     */
    private static ArrayList<Integer> makeSublist(List<Integer> list, int size) {

        ArrayList<Integer> sublist = new ArrayList<>();

        if (listSize < size) {
            size = listSize;
        }

        for (int i = indexEnCours; i < indexEnCours + size; i++) {
            sublist.add(list.get(i));
            listSize--;
        }

        indexEnCours = indexEnCours + size;

        return sublist;
    }
}


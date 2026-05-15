package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {   
        //Selection Sort

        for (int i = 0; i < movies.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < movies.length; j++) {
                if (movies[j].getTitle().compareToIgnoreCase(movies[minIndex].getTitle()) < 0) {
                    minIndex = j;
                }
            }

            Movie temp = movies[i];
            movies[i] = movies[minIndex];
            movies[minIndex] = temp;
        }

        System.out.println("\nLista de películas ordenada por título:");
        for (Movie movie : movies) {
            System.out.println("- " + movie.getTitle() + " (" + movie.getYear() + ")");
        }

    }

    }



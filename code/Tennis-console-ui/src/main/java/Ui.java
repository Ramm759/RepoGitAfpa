import com.afpa.tennis.controller.EpreuveController;
import com.afpa.tennis.controller.JoueurController;
import com.afpa.tennis.controller.MatchController;
import com.afpa.tennis.controller.TournoiController;

public class Ui {
    public static void main(String[] args) {
        // JoueurController joueurController = new JoueurController();
        // joueurController.afficheDetailsJoueur();
        // joueurController.creerJoueur();
        // joueurController.renomme();
        // joueurController.changeSexe();
        // joueurController.deleteJoueur();


        // TournoiController tournoiController = new TournoiController();
        // tournoiController.afficheDetailsTournoi();
        // tournoiController.creerTournoi();
        // tournoiController.deleteTournoi();

        // EpreuveController epreuveController = new EpreuveController();
        // epreuveController.afficheDerniereEpreuve();
        // epreuveController.afficheRollandGarros();

        MatchController matchController = new MatchController();
        matchController.afficheDetailsMatch();
    }
}

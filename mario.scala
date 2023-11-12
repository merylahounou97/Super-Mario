/*Fonctions*/
def chance(n: Int, m: Int) = 
        val rand = new scala.util.Random
        if (rand.nextInt(n) < m) true else false
        ;

/*Création des classes*/
class Personnage(var nom: String, var nombre_vie : Int, var argent: Int){
        def gagner_argent(gain: Int) = 
                argent += gain
        def perdre_argent(perte: Int) = 
                argent -= perte
        def perdre_vie(perte: Int) = 
                nombre_vie -= perte
        def battre(perso: Ennemi) = 
                println(nom + " a battu " + perso.nom)
        def battre(perso: Boss) = 
                println(nom + " a battu " + perso.nom)
        def bisou(perso: Princesse) = 
                println(nom + " a donné un bisou à " + perso.nom)
        def entrer_chateau = 
                println(nom + " est rentré dans le chateau")
        def mourrir = 
                if (nombre_vie <= 0){
                        println(nom + " est mort")
                        true
                } else {
                        false
                        }
        def sauter =
                println(nom + " a sauté")
        };

class Ennemi(var nom: String){
        def battre(perso: Personnage) ={
                println(nom + " a battu " + perso.nom)
                perso.perdre_vie(1)
                } 
                
        };

class Boss(var nom: String){
        def battre(perso: Personnage) = {
                println(nom + " a battu " + perso.nom)
                perso.perdre_vie(1)
                }
        def battre(perso: Ennemi) = {
                println(nom + " a battu " + perso.nom)
                }
        def battre(perso: Boss) = {
                println(nom + " a battu " + perso.nom)
                }
        };

class Princesse(var nom: String){
        def bisou(perso: Personnage) = {
                println(nom + " a donné un bisou à " + perso.nom)
                }
        def gifler(perso: Personnage) = {
                println(nom + " a gifflé " + perso.nom)
                perso.perdre_vie(1)
                }
        };




/*Création jeu*/
def malediction_mario() = {
        val perso_name = scala.io.StdIn.readLine("Entrez le nom du personnage principal: ")
        println(s"Le nom du personnage principal est ${perso_name}")
        val perso_pv = scala.io.StdIn.readLine("Entrez le nombre de vie du personnage principal: ").toInt
        println(s"Le nombre de vie du personnage principal est ${perso_pv}")
        val perso_money = scala.io.StdIn.readLine("Entrez le nombre d'argent du personnage principal: ").toInt
        println(s"Le nombre d'argent du personnage principal est ${perso_money}")
        val princesse_name = scala.io.StdIn.readLine("Entrez le nom de la princesse: ")
        println(s"Le nom de la princesse est ${princesse_name}")
        val ennemi_name = scala.io.StdIn.readLine("Entrez le nom de l'ennemi: ")
        println(s"Le nom de l'ennemi est ${ennemi_name}")
        val boss_name = scala.io.StdIn.readLine("Entrez le nom du boss: ")
        println(s"Le nom du boss est ${boss_name}\n")
        println("-" * 10 + "LE JEU COMMENCE" + "-" * 10)

        var game_over = false
        var win = false
        val mario = new Personnage(perso_name, perso_pv, perso_money)
        val peach = new Princesse(princesse_name)
        val goomba = new Ennemi(ennemi_name)
        val bowser = new Boss(boss_name)

        for (i <- 1 to mario.nombre_vie+1; if (!win)){
                println(s"Mario a ${mario.nombre_vie} vies")
                // une chance sur cinq de tomber lors du premier saut
                if (mario.mourrir) {
                        game_over = true
                        println("-" * 10 + "GAME OVER" + "-" * 10)
                                        } 
                else {
                        if (chance(4, 2)){
                                mario.sauter
                                if (chance(3, 1)){
                                        mario.sauter
                                        if (chance(4, 1)){
                                                mario.battre(goomba)
                                                if (chance(10, 4) || chance(10, 4)){
                                                        mario.entrer_chateau
                                                        if (chance(2, 1)){
                                                                mario.battre(bowser)
                                                                if (chance(3, 2)){
                                                                        win = true
                                                                        println("Mario a sauvé Peach")
                                                                        println("-" * 10 + "WIN" + "-" * 10)
                                                                } else {
                                                                        peach.gifler(mario)
                                                                        }
                                                        } else {
                                                                bowser.battre(mario)                                                         
                                                                }
                                                } else {
                                                        println("Mario a été repéré par les gardiens")
                                                        mario.perdre_vie(1)
                                                        }
                                        } else {
                                                goomba.battre(mario)
                                                }
                                } else {
                                        println("Mario est tombeé dans le deuxième trou")
                                        mario.perdre_vie(1)
                                        }
                        } else {
                                println("Mario est tombé lors du premier saut")
                                mario.perdre_vie(1)
                                }
                }
                Thread.sleep(3000) 
                println("*" * 50)
                println("*" * 50)
                println("\n")
        }
}

malediction_mario()


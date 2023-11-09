/*Création des classes*/
class Personnage(var nom: String, var nombre_vie : Int, var argent: Int){
        def gagner_argent(gain: Int) = 
                argent += gain
        def perdre_argent(perte: Int) = 
                argent -= perte
        def perdre_vie(perte: Int) = 
                nombre_vie -= perte
        def battre(perso: Ennemi) = 
                println(nom + "a battu" + perso.nom)
        def battre(perso: Boss) = 
                println(nom + "a battu" + perso.nom)
        def bisou(perso: Princesse) = 
                println(nom + "a donné un bisou à" + perso.nom)
        def entrer_chateau = 
                println(nom + "est rentré dans le chateau")
        def mourrir = 
                if (nombre_vie <= 0){
                        println(nom + "est mort")
                }
        def sauter =
                println(nom + "a sauté")
        }

class Ennemi(var nom: String){
        def battre(perso: Personnage) ={
                perso.nombre_vie -= 1
                println(nom + "a battu" + perso.nom)
        } 
                
        }

class Boss(var nom: String){
        def battre(perso: Personnage) = {
                perso.nombre_vie -= 1
                println(nom + "a battu" + perso.nom)
                }
        def battre(perso: Ennemi) = 
                println(nom + "a battu" + perso.nom)
        def battre(perso: Boss) = 
                println(nom + "a battu" + perso.nom)
        }

class Princesse(var nom: String){
        def bisou(perso: Personnage) = {
                perso.nombre_vie -= 1
                println(nom + "a donné un bisou à" + perso.nom)
                }
        def gifler(perso: Personnage) = 
                println(nom + "a gifflé" + perso.nom)
        }






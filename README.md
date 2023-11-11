# Super-Mario
Ce TP est réaliser dans l'apprentissage du langage Scala. Il a pour but de créer un simple jeu de Mario en console.
Pour gagner, Mario doit :

- sauter ;

- resauter ;

- battre un ennemi ;

- entrer dans le château ;

- vaincre Bowser ;

- sauver Peach.

![uploads siteduzero com_files_245001_246000_245833](https://github.com/merylahounou97/Super-Mario/assets/91097262/2556961a-97d9-468d-8016-c92a4c792440)


On va créer quatre classes : Personnage, Ennemi, Boss et Princesse. Voici ce que doit faire chacun des personnages secondaires :

- les objets de classe Ennemi doivent être capables de battre seulement le personnage principal (qui est une instance de PersonnagePrincipal) ;

- par contre, les objets de classe Boss doivent être capables de battre le personnage principal et les autres ennemis et boss ;

- les princesses, quant à elles, doivent savoir donner un bisou et donner une gifle.

Le personnage principal est plus intéressant à créer puisqu'il est capable de faire plusieurs choses :

- il a un nombre de vies et une quantité d'argent (les deux sont des valeurs entières) ;

- il peut gagner et perdre de l'argent ;

- il peut seulement perdre des vies  ;

- il peut battre les ennemis et les boss ;

- il peut donner des bisous aux princesses ;

- il peut entrer dans un château ;

- il peut mourir.

## Histoire
Voici l'histoire du jeu, racontée par Toad :

« C'était un beau jour de printemps, tout le monde dans la Ville Champignon était en train de faire son travail avec euphorie et fierté. Tout d'un coup, tout devint noir, comme s'il y avait une éclipse. J'ai levé la tête vers le ciel et... surprise ! Ce n'était pas une éclipse, mais un géant château volant, bien évidemment celui de Bowser ! Tout le monde criait, courait dans tous les sens en hurlant « Mariooooo ! Marioooo ! ». Mais hélas, Mario a quitté la ville depuis un moment et est allé à Hollywood pour travailler comme garde du corps de Hannah Montana. :'( Je me suis caché dans une cave avec trois autres citoyens. Quelques heures après, je suis sorti voir ce qui se passait : c'était le chaos total ! Tout est détruit : les maisons, les arbres, les champs... J'ai couru vers le château de Peach, mais, malheureusement elle n'était pas là : Bowser l'a kidnappée. :waw:

À l'autre bout du monde, Mario était en train de se préparer pour le grand concert de Hannah. Il regardait son beau visage dans un petit miroir qu'il avait dans sa main, tout en chantant une des chansons de Hannah :

You get the best of both worlds
Chill it out, take it slow
Then you rock out the show

You get the best of both worlds
Mix it all together and you know that it's the best of both worlds

Quelques minutes avant le début du concert, Mario a reçu un SMS sur son iPhone 3G, qui contenait quatre mots : « Bowser a pris Peach ! ». Sous le choc, Mario a jeté le miroir par terre et couru vers l'aéroport pour retourner à la Ville Champignon. Le pauvre ne savait pas ce qui l'attendait, puisque briser un miroir entraîne sept ans de malchance ! >_ »

## Déroulement du jeu
Mario a :

- une chance sur cinq de tomber lors du premier saut ;

- une chance sur trois de tomber dans le deuxième trou :

- une chance sur quatre d'être tué par le premier Goomba ;

- trois chances sur dix de pouvoir entrer dans le château sans qu'il ne soit repéré par les gardiens ;

- une chance sur deux de battre Bowser  ;

- une chance sur trois qu'il soit giflé par Peach .

Mario commence avec 10 vies. À chaque fois qu'il tombe, qu'il est attaqué ou qu'il est giflé, il perd une vie. Il a deux essais pour entrer dans le château, si aucune de ses deux tentatives n'est fructueuse il perd une vie. À chaque fois, Mario reprend le jeu depuis le début.

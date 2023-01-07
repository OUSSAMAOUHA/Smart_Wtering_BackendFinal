
# Smart_Wtering_Backend 

Ce projet presente la partie backend du projet Smart_Wtering (seulement la 1ere partie concernant le plantag, la partie arrosage et installation vont etre realiser apres) 

Ce projet a pour but de mettre en place une interface permettant de gerer les fermes, les parcelles, et le plantage dans les parcelles. Il est developper par ##Spring Boot

<img src="https://atomrace.com/blog/wp-content/uploads/2018/05/spring-boot-logo.png" width="200" height="200">

## Fonctionnalités
1.Gestion des fermes;

2.Gestion des parcelles;

3.Gestion des plantes (Création des plantes en spécifiant leurs types, et ses conditions optimales) ;

4.Gestion des types plantes;

5.Gestion de plantage;

6.Gestion des utilisateurs;

## Mise en place du projet
Pour mettre en place ce projet, vous aurez besoin des éléments suivants :

Un serveur d'application Java (comme Tomcat)

Un SGBD (comme MySQL)

Un éditeur de code (comme InteligeIdea)

Le driver JDBC de votre SGBD (à télécharger sur le site officiel de votre SGBD)

Le framework Hibernate (si vous utiliser InteligeIdea il est inclus dans cet outil)


## Pour commencer 
Il faut dabord comprendre la conception du projet 

          Diagramme de cas utilisation 
<img src="https://files.fm/thumb.php?i=j86jeecw9" width="600" height="400">

          Diagramme de classe
<img src="https://files.fm/thumb.php?i=38kx98jx5" width="600" height="400"> 

            Architecture globale de l'application
<img src="https://fv9-4.failiem.lv/thumb.php?i=suwnx4thw&download_checksum=c7c851181f3d1639836ab5acdf15ce864040222c&download_timestamp=1673088504" width="600" height="400"> 

## Installation 

            Il faut installer IntelliJ IDEA 

IntelliJ IDEA également appelé « IntelliJ », « IDEA » ou « IDJ » est un environnement de développement intégré (en anglais Integrated Development Environment - IDE) destiné au développement de logiciels informatiques reposant sur la technologie Java. Il est développé par JetBrains (anciennement « IntelliJ ») et disponible en deux versions, l'une communautaire, open source, sous licence Apache 2 et l'autre propriétaire, protégée par une licence commerciale. Tous deux supportent les langages de programmation Java, Kotlin, Groovy et Scala.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/800px-IntelliJ_IDEA_Icon.svg.png" width="100" height="100"> 

            Il faut installer XAMPP 
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Xampp_logo.svg/1200px-Xampp_logo.svg.png" width="200" height="100"> 

## Démarrage 
              Demarrer XAMPP 
<img src="https://upload.wikimedia.org/wikipedia/commons/d/de/XAMPP_Windows_10.PNG" width="400" height="400"> 
Ajouter une base de donnee avec le nom ecrite dans le fichier ``application.proprieties``
spring.datasource.url=jdbc:mysql://localhost:3306/testSchema2 spring.datasource.username=root spring.datasource.password= spring.datasource.driverClassName=com.mysql.jdbc.Driver spring.jpa.hibernate.ddl-auto=update spring.test.database.replace=none server.port=8087 

              Lancer le backend et la base de donee va etre generee automatiquement
<img src="https://i.ibb.co/nPsXgyy/Capture-d-cran-2023-01-07-120830.png" width="600" height="400"> 

            Tester avec Postman
<img src="https://i.ibb.co/02k9fxX/2.png" width="600" height="400"> 

## Auteurs 

OUHAYOU OUSSAMA

BERRHOU SALAH 

ED_DAIF KAOUTHAR

#GitHub

Project 2

Hide Assignment Information Instructions https://classroom.github.com/a/ohdQnXQr

Please submit the URL to your repository AND a self assessment using the rubric

Write a simulator for the game of War.

https://en.wikipedia.org/wiki/War_(card_game)

Use enum for Face and Suit for Card

Class for Card that is comparable based on the Face value, a toString() method to dispaly the face and suit of the card.

Create a class for Player, when the players stack is empty, shuffle their win pile and put back into the stack

Deck class, deal cards from the deck to the player at the start of the game.

Display both players card snad say who wins. If there is a tie, a war happens, and 3 care are played, then the 4th is used to determine the next winner.

Put the cards each player wins into a 'pile' array list so you can shuffle it when their stack is empty.

Create a deck of cards to deal each players stack of cards, be sure to shuffle it each time ( see Collections.suffle )

Run the game 100 times, and count the # of turns it take sto finish the game, calculate the average.

Repeat with different numbers of decks, 1 deck through 10 decks. Display the deck count and average turn count at the end.

Due on Jun 13, 2023 11:59 PM


Card class implement Comparable<T> interface

Score of Card class implement Comparable<T> interface,/ 2
Card class has enums for Face and Suit

Score of Card class has enums for Face and Suit,/ 1
Deck class with various numbers of decks, can deal cards to players

Score of Deck class with various numbers of decks, can deal cards to players,/ 2
Player class with a stack of cards and an arraylist for the win pile, can add cards to the stack from the deck or the win pile

Score of Player class with a stack of cards and an arraylist for the win pile, can add cards to the stack from the deck or the win pile,/ 2
Player class - when the stack is empty, shuffle the win pile and put back into the stack

Score of Player class - when the stack is empty, shuffle the win pile and put back into the stack,/ 2
Simulator, runs 100 times, counting # of turns until someone wins, averages the # of turns

Score of Simulator, runs 100 times, counting # of turns until someone wins, averages the # of turns,/ 3
Simulator runs for various deck sizes, 1-10

Score of Simulator runs for various deck sizes, 1-10,/ 3
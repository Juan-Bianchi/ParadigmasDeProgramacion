%
% Hechos sobre DBZ
%
 
parent(bardock,radditz).
parent(bardock,goku).
parent(goku,gohan).
parent(goku,goten).
parent(chichi,gohan).
parent(chichi,goten).
parent(mrsatan,videl).
parent(gohan,pan).
parent(videl,pan).
parent(vegeta,trunks).
parent(bulma,trunks).
parent(vegeta,bra).
parent(bulma,bra).
rival(piccolo,goku).
rival(goku,piccolo).
rival(vegeta,goku).
rival(goku,vegeta).
 
%
% Mas hechos
%

male(bardock).
male(radditz).
male(goku).
male(gohan).
male(goten).
male(vegeta).
male(trunks).
male(piccolo).
male(mrsatan).
female(chichi).
female(bulma).
female(videl).
female(pan).
female(bra).
 
%
% Definicion de parentescos
%
 
father(X,Y) :- parent(X,Y), male(X).
mother(X,Y) :- parent(X,Y), female(X).
grandparent(X,Y) :- parent(X,Z), parent(Z,Y).
grandfather(X,Y) :- grandparent(X,Y), male(X).
grandmother(X,Y) :- grandparent(X,Y), female(X).
sibling(X,Y) :- parent(Z,X), parent(Z,Y), \+ (X=Y).
uncle(X,Y) :- parent(Z,Y),sibling(Z,X),male(X).
aunt(X,Y) :- parent(Z,Y),sibling(Z,X),female(X).

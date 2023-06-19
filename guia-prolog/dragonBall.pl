% Hechos sobre DBZ

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

%padre, madre, abuelos

father(Father, Child)
:-
    parent(Father, Child),
    male(Father).

mother(Mother, Child)
:-
    parent(Mother, Child),
    female(Mother).
    
mother2(Mother, Child)
:-
    parent(Mother, Child),
    \+father(Mother, Child).

grandparent(Grandparent, Child)
:-
    parent(Parent, Child),
    parent(Grandparent, Parent).

sibling(X, Y)
:-
    parent(Parent, X),
    parent(Parent, Y),
    X \== Y.
    
uncle(Uncle, Y)
:-
    sibling(Uncle, Parent),
    parent(Parent, Y),
    male(Uncle).


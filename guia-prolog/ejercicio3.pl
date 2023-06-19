%A partir de estas afirmaciones, formular las reglas generales de:


hombre(pedro).
hombre(manuel).
hombre(arturo).
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría).

%niño(X,Y) expresa que X es hijo o hija de Y.
niño(Child, Parent)
:-
    padre(Parent, Child),
    (   hombre(Child); 	mujer(Child)	).


%hijo(X,Y) expresa que X es un hijo varón de Y.
hijo(Son, Parent)
:-
    padre(Parent, Son),
    hombre(Son).


%hija(x,y) expresa que X es una hija de Y.
hija(Daughter, Parent)
:-
    padre(Parent, Daughter),
    mujer(Daughter).


%hermano-o-hermana(X,Y) expresa que X es hermano o hermana de Y.
hermano-o-hermana(Sibling1, Sibling2)
:-
    (   hijo(Sibling1, Parent), hijo(Sibling2, Parent);
    	hija(Sibling1, Parent), hija(Sibling2, Parent);
    	hijo(Sibling1, Parent), hija(Sibling2, Parent);
    	hija(Sibling1, Parent), hijo(Sibling2, Parent)	),
    Sibling1 \== Sibling2.
    

%hermano(X,Y) expresa que X es un hermano de Y.
hermano(Brother, Sibling2)
:-
    (   hijo(Brother, Parent), hijo(Sibling2, Parent);
        hijo(Brother, Parent), hija(Sibling2, Parent)	),
    Brother \== Sibling2.


%hermana(X,Y) expresa que X es una hermana de Y.
hermana(Sister, Sibling)
:-
    (   hija(Sister, Parent), hijo(Sibling, Parent);
        hija(Sister, Parent), hija(Sibling, Parent)	),
    Sister \== Sibling.
%El árbol genealógico siguiente se describe con el programa Prolog:

hombre(pedro) .
hombre(manuel) .
hombre(arturo) .
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría) .

%A partir de estas afirmaciones, formular las reglas generales de:
%Nota: Un individuo no puede ser hermano ni hermana de sí mismo.

niño(X,Y):- % expresa que X es hijo o hija de Y.
	padre(Y, X).

hijo(X,Y):- % expresa que X es un hijo varón de Y.
    padre(Y, X),
    hombre(X).

hija(X,Y):- % expresa que X es una hija de Y.
    niño(X, Y),
    mujer(X).

hermano-o-hermana(X,Y):- % expresa que X es hermano o hermana de Y.
    niño(X,Z),
    niño(Y,Z),
    X \== Y.

hermano(X,Y):- % expresa que X es un hermano de Y.
    hijo(X,Z),
    niño(Y,Z), 
    X \== Y.
    
hermana(X,Y):- % expresa que X es una hermana de Y.
    hija(X,Z),
    niño(Y,Z), 
    X \== Y.
    

%Basado en el ejemplo de paises.pl visto en clase, complete la base de conocimientos 
%pais_superficie(P,A) con todos los países de latinoamérica y codifique las reglas prolog 
%que permitan encontrar el país de mayor superficie.

pais_superficie(argentina, 2780400).
pais_superficie(uruguay, 176000).
pais_superficie(chile, 756102).
pais_superficie(bolivia, 1098581).
pais_superficie(peru, 1285215).
pais_superficie(paraguay, 406752).
pais_superficie(brasil, 8515770).
pais_superficie(colombia, 1141748).
pais_superficie(venezuela, 1076945).
pais_superficie(guyana, 214969).

prod_cart(X, Y):-
    pais_superficie(_,X),
    pais_superficie(_,Y),
    X \== Y.

seleccion(X, Y):-
    prod_cart(X, Y),
    X > Y.

proyeccion(Menores):-
    seleccion(_, Menores).

todos_menos_el_mayor(Menores):-
    proyeccion(Menores).

mayor(Pais, Superficie):-
    pais_superficie(Pais, Superficie),
    \+todos_menos_el_mayor(Superficie).

todos_menos_el_mayorResumido(Menores):-
    pais_superficie(_,Menores),
    pais_superficie(_,Y),
    Menores < Y.

mayorResumido(Pais, Superficie):-
    pais_superficie(Pais, Superficie),
    \+todos_menos_el_mayorResumido(Superficie).
parcial1(luisa, 6).
parcial1(pedro, 5).
parcial1(maria, 8).
parcial1(carlos, 1).
parcial1(laura, 3).
parcial1(agos, 8.5).
parcial1(juan, 10).
parcial1(julio, 2).
parcial1(lucas, 9).
parcial1(hernan, 10).

parcial2(luisa, 7).
parcial2(pedro, 6).
parcial2(maria, 9).
parcial2(carlos, 8).
parcial2(laura, 4).
parcial2(agos, 8.5).
parcial2(juan, 4).
parcial2(julio, 1).
parcial2(lucas, 9).
parcial2(hernan, 10).

% Cual es la nota más alta
% Siendo nota (P1 + P2) / 2

nota(Alumno, Nota):-
    parcial1(Alumno, P1),
    parcial2(Alumno, P2),
    Nota is (P1 + P2) / 2.

producto_cartesiano(A, B):-
    nota(_, A), nota(_, B).

seleccion(A, B):-
    producto_cartesiano(A, B),
    A < B.

proyeccion(A):-
    seleccion(A, _).

% alias
todos_menos_max(A):-
    proyeccion(A).

maximo(X):-
    nota(_, X), \+todos_menos_max(X).


% Conjunto original notas
% nota = (2 4 9 7)

% Producto cartesiano (A X B)
% ( [2 2] [2 4] [2 9] [2 7] [4 2] [4 4] [4 9] [4 7] [9 2] [9 4] [9 9] [9 7] [7 2] [7 4] [7 9] [7 7] )

% Seleccion (A < B)
% 2 4
% 2 9
% 2 7
% 4 9
% 4 7
% 7 9

% Proyección (A)
% (2 2 2 4 4 7)


% Resta de conjuntos
% (2 4 9 7) - (2 2 2 4 4 7) = (9)


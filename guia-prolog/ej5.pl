%Se dispone de un listado con los resultados de los parciales de los alumnos del curso 
%de Paradigmas de Programación, organizado de la siguiente manera:

%Hechos
parcial1(ana,7).
parcial1(juan,4).
parcial1(julio, 2).
parcial1(maria, 10).
parcial1(lucas, 10).
parcial1(hernan, 9).

parcial2(ana,9).
parcial2(juan,8).
parcial2(maria, 2).
parcial2(lucas, 10).
parcial2(hernan, 9).

%Se desea obtener: 1. a. El listado de los alumnos que promocionan la materia 

promociona(Persona):-
    parcial1(Persona,Nota1),
    parcial2(Persona,Nota2),
    Nota1 >= 7,
    Nota2 >= 7.

%b. El mismo listado pero esta vez incluyendo la nota final (promedio de los dos parciales) 
%para cada uno 

promociona_y_nota(Persona, Promedio):-
    parcial1(Persona,Nota1),
    parcial2(Persona,Nota2),
    Nota1 >= 7,
    Nota2 >= 7,
    Promedio is (Nota1 + Nota2) / 2.

%2. El listado de los alumnos que recursan la materia. 

recursa(Persona):-
    parcial1(Persona,Nota1),
    parcial2(Persona,Nota2),
    (Nota1 < 4; Nota2 < 4).

%3. El listado de los alumnos que obtendrán la cursada. 

presente(Persona):-
    parcial1(Persona,_),
    parcial2(Persona,_).

cursada(Persona):-
    presente(Persona),       % antes de realizar la resta SIEMPRE debo tener un total de donde restar
    \+promociona(Persona),
    \+recursa(Persona).
    
%4. A fin de entregar la medalla al mérito, encontrar de aquellos que promocionan (1b), 
%el o los alumnos con mayor nota final (nombre y nota)

producto_cartesiano(Promedio1, Promedio2):-
    promociona_y_nota(_, Promedio1),
    promociona_y_nota(_, Promedio2).
    
seleccion(Promedio1, Promedio2):-
    producto_cartesiano(Promedio1, Promedio2),
    Promedio1 > Promedio2.

proyeccion(Menor):-
    seleccion(_, Menor).

todos_menos_mayor(Menor):-
    proyeccion(Menor).

medalla_al_merito(Persona, Mayor):-
   	promociona_y_nota(Persona, Mayor),
    \+todos_menos_mayor(Mayor).

    
%5. Ahora se desea obtener cuales fueron las dos notas más altas, considerando simplemente 
%a la nota como el promedio de la nota de parcial1 y parcial2. Solo interesan los números.
% Un tip es pensar la resolución en dos etapas, la más alta, y después la más alta de lo 
% restante

prod_cart2(Prom1, Prom2):-
    todos_menos_mayor(Prom1),
    todos_menos_mayor(Prom2).

seleccion2(Prom1, Prom2):-
    prod_cart2(Prom1, Prom2),
    Prom1 > Prom2.

proy2(Prom):-
    seleccion2(_, Prom).

todos_menos_mayor2(Menor):-
    proy2(Menor).

promedio_maximo2(_, Promedio):-
    todos_menos_mayor(Promedio),
    \+todos_menos_mayor2(Promedio).

dos_promedios_maximos(Promedio1, Promedio2):-
    medalla_al_merito(_, Promedio1),
    promedio_maximo2(_, Promedio2).


%Versión 2
%El listado se compone de al menos una nota para cada alumno. En caso de que algún alumno adeude uno de 
%los parciales (es decir no tenga un hecho relacionado a su parcial), su condición es ausente. No se 
%toman en cuenta quienes no dieron ninguno de los parciales.

ausente(Persona):-
    parcial1(Persona,_),
    \+parcial2(Persona,_);
    parcial2(Persona,_),
    \+parcial1(Persona,_).
%Hechos
limita(argentina, brasil).
limita(argentina, uruguay).
limita(argentina, paraguay).
limita(argentina, bolivia).
limita(argentina, chile).
limita(chile, peru).
limita(bolivia, peru).
limita(bolivia, brasil).
limita(bolivia, paraguay).
limita(paraguay, brasil).
limita(brasil, uruguay).
limita(brasil, peru).
limita(brasil, colombia).
limita(brasil, venezuela).
limita(brasil, guyana).


%Reglas
limita_con(Pais1, Pais2)
:-
    limita(Pais1, Pais2);
    limita(Pais2, Pais1).

translimita_con(Pais1, Pais2)
:-
    limita_con(Pais1, PaisIntermedio),
    limita_con(PaisIntermedio, Pais2),
    \+limita_con(Pais1, Pais2),
    Pais1 \== Pais2.
	
grammar Simple;

procedure: VOID P_OPEN P_CLOSE L_OPEN sentencia*  L_CLOSE;

sentencia: (asignacion|ciclo|cicloFor|println|condicional);

asignacion: (VAR IGUAL NUMERO P_COMA) | INTEGER VAR IGUAL NUMERO P_COMA ;
ciclo: WHILE P_OPEN (condicionnum|condicion| TRUE | FALSE) P_CLOSE L_OPEN sentencia L_CLOSE;
cicloFor : FOR P_OPEN asignacion condicionnum P_COMA incremento P_CLOSE L_OPEN sentencia L_CLOSE;

println: PRINTLN P_OPEN (expresion | expresionMat) P_CLOSE P_COMA;





condicional: IF P_OPEN (condicion | condicionnum | TRUE | FALSE) P_CLOSE L_OPEN sentencia L_CLOSE;




expresion  : NUMERO | VAR | CADENA;
expresionMat: NUMERO | NUMERO simboloMat NUMERO | INTEGER VAR IGUAL NUMERO;
operadorCondicional: IGUALA | MENORQUE | MENORIGUALQUE |MAYORIGUALQUE | MAYORQUE | DIFERENTE ;


condicionnum: (VAR | NUMERO) operadorCondicional (VAR | NUMERO);
incremento: VAR SUMA SUMA;


condicion: (VAR | CADENA) IGUAL (VAR | CADENA);

simboloMat: SUMA | RESTA | MULT | DIVISION;


SUMA: '+';
RESTA: '-';
MULT: '*';
DIVISION: '/';
IGUAL : '=';
IGUALA : '==';
MENORQUE : '<';
MENORIGUALQUE : '<=';
MAYORIGUALQUE : '>=';
MAYORQUE : '>';
DIFERENTE : '!=';

P_OPEN : '(';
P_CLOSE : ')';
L_OPEN :'{';
L_CLOSE : '}';
COMA :',';
P_COMA:';';
COMILLA: '"';

IF: 'if';
VOID: 'void';
PRINTLN: 'println';
FOR: 'for';
WHILE : 'while';
TRUE: 'true';
FALSE: 'false';
INTEGER: 'int';
STRING: 'String';

VAR: [a-zA-Z_][a-zA-Z0-9_]*;

CADENA: (["])[a-zA-Z0-9_]*(["]);

NUMERO : [0-9] | [0-9][0-9]*;


ESPACIO : [ \t\n\r]+ -> skip;
grammar Simple;

procedure: CREATE PROCEDURE VAR LENGUAJE SQL AS PROCEDURE_DEL 
sentenciaSQL* 
PROCEDURE_DEL P_COMA;


sentenciaSQL: insertSQL | deleteSQL | selectSQL;

selectSQL: SELECT (ALL | valorestabla  ) 
FROM VAR (P_COMA | condicion)

{System.out.println("SENTENCIA SQL SELECT");};

deleteSQL: DELETE FROM VAR WHERE VAR IGUAL NUMERO P_COMA 
{System.out.println("SENTENCIA SQL DELETE");}
;

insertSQL: INSERT INTO VAR VALUES P_OPEN valores P_CLOSE P_COMA
{System.out.println("SENTENCIA SQL INSERT");}
;


valores: ((NUMERO | VAR | CADENA ) COMA)* (NUMERO|VAR|CADENA);
valorestabla : ((VAR COMA)* VAR) | P_OPEN((VAR COMA)* VAR) P_CLOSE ;
condicion : WHERE (VAR comparativoNumerico | comparativoCadena  P_COMA);
comparativoNumerico : VAR (IGUAL | MENORQUE| MAYORQUE | MENORIGUALQUE | MAYORIGUALQUE | DIFERENTE) NUMERO;
comparativoCadena : VAR (IGUAL | LIKE) CADENA;

expresion returns [Object value] : 

	NUMERO {$value = Integer.parseInt($NUMERO.text); } 
	| 
	VAR  {$value = $VAR.text;}; 

SELECT : 'SELECT';
DELETE : 'DELETE';
INSERT : 'INSERT';
VALUES : 'VALUES';

FROM : 'FROM';

INTO :'INTO';
CREATE : 'CREATE';
PROCEDURE : 'PROCEDURE';
ALL : '*';
WHERE : 'WHERE';
AS : 'AS';
GO : 'GO';
LENGUAJE : 'LANGUAGE';
SQL : 'SQL';


AND : 'AND';
OR : 'OR';
NOT : 'NOT';
LIKE : 'LIKE';

IGUAL : '=';
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
PROCEDURE_DEL: '$$';



VAR: [a-zA-Z_][a-zA-Z0-9_]*;

CADENA: [""][a-zA-Z0-9_]*[""];

NUMERO : [0-9] | [0-9][0-9]*;


ESPACIO : [ \t\n\r]+ -> skip;
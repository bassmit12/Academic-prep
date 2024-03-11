(declare-const C Int)
(declare-const A Int)
(declare-const T Int)
(declare-const S Int)
(declare-const O Int)
(declare-const N Int)
(declare-const P Int)
(declare-const D Int)
(declare-const R Int)
(declare-const I Int)
(declare-const G Int)
(declare-const E Int)
 
(assert (and
 
(distinct C A T)
(distinct S O N)
(distinct P O D)
(distinct R I G)
(distinct P E G)
(distinct T A P)
(distinct D I N)
(distinct A P E)
 
(<= 1 C 4) ; every symbol gets a value that is the number of the dice on which it appears
	; so all values must be 1,2, or 3
(<= 1 A 4)
(<= 1 T 4)
(<= 1 S 4)
(<= 1 O 4)
(<= 1 N 4)
(<= 1 P 4)
(<= 1 D 4)
(<= 1 R 4)
(<= 1 I 4)
(<= 1 G 4)
(<= 1 E 4)
 
))
 
(check-sat)
(get-value (
 
C A T;
S O N;
P O D;
R I G;
P E G;
T A P;
D I N;
A P E
 
))